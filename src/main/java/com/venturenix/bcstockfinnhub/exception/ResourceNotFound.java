package com.venturenix.bcstockfinnhub.exception;

public class ResourceNotFound extends BusinessRuntimeException{
  
  public ResourceNotFound(Code code) {
    super(code);
  }
}
