package com.venturenix.bcstockfinnhub.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Profile2 {
  
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
