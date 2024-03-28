package com.venturenix.bcstockfinnhub.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.venturenix.bcstockfinnhub.infra.ApiResponse;
import com.venturenix.bcstockfinnhub.model.Quote;

public interface QuoteOperation {

  @GetMapping("/quote")
  public ApiResponse<Quote> getAllData(@RequestParam String symbol);

   @GetMapping(value = "/getQuote")
    @ResponseStatus(value = HttpStatus.OK)
    Quote getQuote(@RequestParam String key) throws JsonProcessingException;
}
