package com.venturenix.bcstockfinnhub.exception;

public class RestClientException extends BusinessRuntimeException{
  
  public RestClientException(Code code) {
    super(code);
    
  }
}
