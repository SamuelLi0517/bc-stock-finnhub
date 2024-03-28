package com.venturenix.bcstockfinnhub.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.venturenix.bcstockfinnhub.entity.Profile2Entity;
import com.venturenix.bcstockfinnhub.exception.Code;
import com.venturenix.bcstockfinnhub.exception.RestClientException;
import com.venturenix.bcstockfinnhub.infra.BcUtil;
import com.venturenix.bcstockfinnhub.infra.Mapper;
import com.venturenix.bcstockfinnhub.infra.RedisHelper;
import com.venturenix.bcstockfinnhub.infra.Scheme;
import com.venturenix.bcstockfinnhub.model.Profile2;
import com.venturenix.bcstockfinnhub.repository.Profile2Repo;
import com.venturenix.bcstockfinnhub.service.Profile2Service;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class Profile2ServiceImpl implements Profile2Service {

  @Autowired
  private Mapper mapper;

  @Autowired
  private RestTemplate restTemplate;

   @Autowired
  private Profile2Repo profile2Repo;

  @Autowired
  private RedisHelper redisHelper;

  @Value("${api.finnhub.key}")
  private String finnhubkey;

  @Value("${api.finnhub.domain}")
  private String domain;

  @Value("${api.finnhub.path}")
  private String path;

  @Value("${api.finnhub.endpoint.profile2}")
  private String endpoint;

  @Override
  public Profile2 getDataFromApi(String symbol) {
    String FinnhubUrl =
        BcUtil.url(Scheme.HTTPS, domain, path, endpoint, finnhubkey, symbol);
    log.info("FinnhubUrl : " + FinnhubUrl);
    Profile2 profile2 = restTemplate.getForObject(FinnhubUrl, Profile2.class);

    if (profile2.getName() == null) {
      throw new  RestClientException(Code.REST_NOT_AVAILABLE);
    }
    return profile2;
  }

  @Override
  public Profile2 getProfile2(String symbol) throws JsonProcessingException {
    String key = "stock:finnhub:profile2:" + symbol;

     String FinnhubUrl =
        BcUtil.url(Scheme.HTTPS, domain, path, endpoint, finnhubkey, symbol);
    Profile2 profile2 = restTemplate.getForObject(FinnhubUrl, Profile2.class);

    Profile2Entity profile2Entity = mapper.map2(profile2);
    profile2Repo.save(profile2Entity);
    redisHelper.set(key, profile2);

    return profile2;
  }

}


