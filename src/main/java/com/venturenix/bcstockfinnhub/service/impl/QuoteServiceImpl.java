package com.venturenix.bcstockfinnhub.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.venturenix.bcstockfinnhub.entity.QuoteEntity;
import com.venturenix.bcstockfinnhub.exception.Code;
import com.venturenix.bcstockfinnhub.exception.RestClientException;
import com.venturenix.bcstockfinnhub.infra.BcUtil;
import com.venturenix.bcstockfinnhub.infra.Mapper;
import com.venturenix.bcstockfinnhub.infra.RedisHelper;
import com.venturenix.bcstockfinnhub.infra.Scheme;
import com.venturenix.bcstockfinnhub.model.Quote;
import com.venturenix.bcstockfinnhub.repository.QuoteRepo;
import com.venturenix.bcstockfinnhub.service.QuoteService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class QuoteServiceImpl implements QuoteService {

  @Autowired
  private Mapper mapper;

  @Autowired
  private RestTemplate restTemplate;

  @Autowired
  private QuoteRepo quoteRepo;

  @Autowired
  private RedisHelper redisHelper;

  @Value("${api.finnhub.key}")
  private String finnhubkey;

  @Value("${api.finnhub.domain}")
  private String domain;

  @Value("${api.finnhub.path}")
  private String path;

  @Value("${api.finnhub.endpoint.quote}")
  private String endpoint;

  @Override
  public Quote getDataFromApi(String symbol) {
    String FinnhubUrl =
        BcUtil.url(Scheme.HTTPS, domain, path, endpoint, finnhubkey, symbol);
    log.info("FinnhubUrl : " + FinnhubUrl);
    Quote quote = restTemplate.getForObject(FinnhubUrl, Quote.class);

    if (quote.getT() == 0) {
      throw new RestClientException(Code.REST_NOT_AVAILABLE);
    }
    return quote;
  }

  @Override
  public Quote getQuote(String symbol) throws JsonProcessingException {
    String key = "stock:finnhub:quote:" + symbol;

    String FinnhubUrl =
        BcUtil.url(Scheme.HTTPS, domain, path, endpoint, finnhubkey, symbol);
    Quote quote = restTemplate.getForObject(FinnhubUrl, Quote.class);

    QuoteEntity quoteEntity = mapper.map2(quote);
    quoteRepo.save(quoteEntity);
    redisHelper.set(key, quote);

    return quote;
  }

}
