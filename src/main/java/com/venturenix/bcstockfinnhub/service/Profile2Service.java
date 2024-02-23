package com.venturenix.bcstockfinnhub.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.venturenix.bcstockfinnhub.model.Profile2;

public interface Profile2Service {

   Profile2 getDataFromApi(String symbol);
  
   Profile2 getProfile2(String symbol) throws JsonProcessingException;
}
