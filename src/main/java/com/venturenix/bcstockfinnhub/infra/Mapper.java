package com.venturenix.bcstockfinnhub.infra;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.venturenix.bcstockfinnhub.entity.Profile2Entity;
import com.venturenix.bcstockfinnhub.entity.QuoteEntity;
import com.venturenix.bcstockfinnhub.model.Profile2;
import com.venturenix.bcstockfinnhub.model.Profile2DTO;
import com.venturenix.bcstockfinnhub.model.Quote;
import com.venturenix.bcstockfinnhub.model.QuoteDTO;

@Component
public class Mapper {
  
   @Autowired
  ModelMapper modelMapper;

  public QuoteDTO map(Quote quote) {
    QuoteDTO builder = QuoteDTO.builder()//
  .c(quote.getC())
  .d(quote.getD())
  .dp(quote.getDp())
  .h(quote.getH())
  .l(quote.getL())
  .o(quote.getO())
  .pc(quote.getPc())
  .t(quote.getT())
  .build();

  return builder;
}

public Profile2DTO map(Profile2 profile2) {
  Profile2DTO builder = Profile2DTO.builder()//
.country(profile2.getCountry())
.currency(profile2.getCurrency())
.estimateCurrency(profile2.getEstimateCurrency())
.exchange(profile2.getExchange())
.finnhubIndustry(profile2.getFinnhubIndustry())
.ipo(profile2.getIpo())
.logo(profile2.getLogo())
.marketCapitalization(profile2.getMarketCapitalization())
.name(profile2.getName())
.phone(profile2.getPhone())
.shareOutstanding(profile2.getShareOutstanding())
.ticker(profile2.getTicker())
.weburl(profile2.getWeburl())
.build();

return builder;
}

public QuoteEntity map2(Quote quote){
 QuoteEntity builder = QuoteEntity.builder()
 .c(quote.getC())
 .d(quote.getD())
 .dp(quote.getDp())
 .h(quote.getH())
 .l(quote.getL())
 .o(quote.getO())
 .pc(quote.getPc())
 .t(quote.getT())
 .build();

 return builder;
}

public Profile2Entity map2(Profile2 profile2){
  Profile2Entity builder = Profile2Entity.builder()
  .country(profile2.getCountry())
  .currency(profile2.getCurrency())
  .estimateCurrency(profile2.getEstimateCurrency())
  .exchange(profile2.getExchange())
  .finnhubIndustry(profile2.getFinnhubIndustry())
  .ipo(profile2.getIpo())
  .logo(profile2.getLogo())
  .marketCapitalization(profile2.getMarketCapitalization())
  .name(profile2.getName())
  .phone(profile2.getPhone())
  .shareOutstanding(profile2.getShareOutstanding())
  .ticker(profile2.getTicker())
  .weburl(profile2.getWeburl())
  .build();
  
  return builder;
}
}