package com.venturenix.bcstockfinnhub.model;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@Builder
@ToString
@EqualsAndHashCode
public class QuoteDTO {
  
  public double c;
  public Double d;
  public Double dp;
  public double h;
  public double l;
  public double o;
  public double pc;
  public int t;
}
