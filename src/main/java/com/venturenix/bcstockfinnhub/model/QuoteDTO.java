package com.venturenix.bcstockfinnhub.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class QuoteDTO {
  
  public double c;
  public double d;
  public double dp;
  public double h;
  public double l;
  public double o;
  public double pc;
  public int t;
}
