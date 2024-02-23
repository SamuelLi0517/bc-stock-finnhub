package com.venturenix.bcstockfinnhub.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.venturenix.bcstockfinnhub.controller.Profile2Operation;
import com.venturenix.bcstockfinnhub.exception.Code;
import com.venturenix.bcstockfinnhub.infra.ApiResponse;
import com.venturenix.bcstockfinnhub.model.Profile2;
import com.venturenix.bcstockfinnhub.service.Profile2Service;

@RestController
@RequestMapping(value = "/stock/finnhub/api/v1")
public class Profile2Controller implements Profile2Operation {

  @Autowired
  Profile2Service profile2Service;

  @Override
  public ApiResponse<Profile2> getAllData(String symbol) {
Profile2 data = profile2Service.getDataFromApi(symbol);
    return ApiResponse.<Profile2>builder()//
        .code(Code.OK.getCode())//
        .message(Code.OK.getMessage())//
        .data(data)//
        .build();//
  }

  @Override
  public Profile2 getProfile2(String key) throws JsonProcessingException {
    return profile2Service.getProfile2(key);
  }

}
