package com.venturenix.bcstockfinnhub.exception;

import lombok.Getter;

@Getter
public class BusinessRuntimeException extends RuntimeException{
  
  private String code;

  public BusinessRuntimeException(Code code) {
    super(code.getMessage());
    this.code = code.getCode();
  }
}
