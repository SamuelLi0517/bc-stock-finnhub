package com.venturenix.bcstockfinnhub.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Profile2DTO {
  
  public String country;
  public String currency;
  public String estimateCurrency;
  public String exchange;
  public String finnhubIndustry;
  public String ipo;
  public String logo;
  public double marketCapitalization;
  public String name;
  public String phone;
  public double shareOutstanding;
  public String ticker;
  public String weburl;
}
