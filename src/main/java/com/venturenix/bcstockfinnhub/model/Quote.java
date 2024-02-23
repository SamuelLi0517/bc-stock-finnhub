package com.venturenix.bcstockfinnhub.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Quote {
  
  public double c;
  public double d;
  public double dp;
  public double h;
  public double l;
  public double o;
  public double pc;
  public int t;
}
