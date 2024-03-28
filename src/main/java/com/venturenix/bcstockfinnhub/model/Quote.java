package com.venturenix.bcstockfinnhub.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
public class Quote {
  
  public double c;
  public Double d;
  public Double dp;
  public double h;
  public double l;
  public double o;
  public double pc;
  public int t;
}
