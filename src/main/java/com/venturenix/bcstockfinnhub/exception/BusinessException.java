package com.venturenix.bcstockfinnhub.exception;

import lombok.Getter;

@Getter
public class BusinessException extends Exception{
  
  private String code;

  public BusinessException(Code code) {
    super(code.getMessage());
    this.code = code.getCode();
  }
}
