package com.venturenix.bcstockfinnhub.entity;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class Profile2Entity implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Long id;
  public String country;
  public String currency;
  public String estimateCurrency;
  public String exchange;
  public String finnhubIndustry;
  public String ipo;
  public String logo;
  public Double marketCapitalization;
  public String name;
  public String phone;
  public Double shareOutstanding;
  public String ticker;
  public String weburl;
}
