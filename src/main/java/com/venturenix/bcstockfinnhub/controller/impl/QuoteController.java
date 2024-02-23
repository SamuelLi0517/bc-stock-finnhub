package com.venturenix.bcstockfinnhub.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.venturenix.bcstockfinnhub.controller.QuoteOperation;
import com.venturenix.bcstockfinnhub.exception.Code;
import com.venturenix.bcstockfinnhub.infra.ApiResponse;
import com.venturenix.bcstockfinnhub.model.Quote;
import com.venturenix.bcstockfinnhub.service.QuoteService;

@RestController
@RequestMapping(value = "/stock/finnhub/api/v1")
public class QuoteController implements QuoteOperation{

  @Autowired
  QuoteService quoteService;

  @Override
  public ApiResponse<Quote> getAllData(String symbol) {
  Quote data = quoteService.getDataFromApi(symbol);
    return ApiResponse.<Quote>builder()//
        .code(Code.OK.getCode())//
        .message(Code.OK.getMessage())//
        .data(data)//
        .build();//
  }

  @Override
  public Quote getQuote(String key) throws JsonProcessingException {
    return quoteService.getQuote(key);
  }
  

  }
