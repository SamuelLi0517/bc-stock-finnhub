package com.venturenix.bcstockfinnhub.exception;

import lombok.Getter;

@Getter
public enum Code {
  OK("000000", "OK."), //
  NOTFOUND("000001", "Not Found."), //
  NPE_EXCEPTION("000002", "Runtime Exception"),
  GENERAL_EXCEPTION("999999", "General Exception."),
  REST_NOT_AVAILABLE("900000", "Finnhub Service is unavailable."),
  ;
  

  private String code;
  private String message;

  private Code (String code, String message){
    this.code = code;
    this.message = message;
  }
}
