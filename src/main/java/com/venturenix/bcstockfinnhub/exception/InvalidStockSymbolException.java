package com.venturenix.bcstockfinnhub.exception;

public class InvalidStockSymbolException extends IllegalArgumentException{
  
  public InvalidStockSymbolException(Code code) {
    super(code.getMessage());
  }
}
