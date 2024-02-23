package com.venturenix.bcstockfinnhub.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.venturenix.bcstockfinnhub.infra.ApiResponse;
import com.venturenix.bcstockfinnhub.model.Profile2;

public interface Profile2Operation {
  
  @GetMapping("/profile2")
  public ApiResponse<Profile2> getAllData(@RequestParam String symbol);

  @GetMapping(value = "/getProfile2")
    Profile2 getProfile2(@RequestParam String key) throws JsonProcessingException;
}
