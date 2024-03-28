package com.venturenix.bcstockfinnhub.model;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Profile2DTO {
  
  public String country;
  public String currency;
  public String estimateCurrency;
  public String exchange;
  public String finnhubIndustry;
  public LocalDate ipo;
  public String logo;
  public double marketCapitalization;
  public String name;
  public String phone;
  public double shareOutstanding;
  public String ticker;
  public String weburl;
}
