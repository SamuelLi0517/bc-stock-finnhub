package com.venturenix.bcstockfinnhub.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.venturenix.bcstockfinnhub.model.Quote;

public interface QuoteService {

  Quote getDataFromApi(String symbol);

  Quote getQuote(String symbol) throws JsonProcessingException;
}
