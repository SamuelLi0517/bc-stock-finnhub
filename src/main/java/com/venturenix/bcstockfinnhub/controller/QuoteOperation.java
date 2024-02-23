package com.venturenix.bcstockfinnhub.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.venturenix.bcstockfinnhub.infra.ApiResponse;
import com.venturenix.bcstockfinnhub.model.Quote;

public interface QuoteOperation {

  @GetMapping("/quote")
  public ApiResponse<Quote> getAllData(@RequestParam String symbol);

   @GetMapping(value = "/getQuote")
    Quote getQuote(@RequestParam String key) throws JsonProcessingException;
}
