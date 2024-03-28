package com.venturenix.bcstockfinnhub.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import com.venturenix.bcstockfinnhub.infra.ApiResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {

  @ExceptionHandler(InvalidStockSymbolException.class)
  @ResponseStatus(value = HttpStatus.BAD_REQUEST)
  public ApiResponse<Void> InvalidStockSymbolExceptionHandler(
      InvalidStockSymbolException ex) {
    return ApiResponse.<Void>builder() //
        .code(Code.INVALID_STOCK_SYMBOL.getCode()) //
        .message(Code.INVALID_STOCK_SYMBOL.getMessage()) //
        .data(null) //
        .build();
  }

  
   @ExceptionHandler(RestClientException.class) // catch
  @ResponseStatus(value = HttpStatus.REQUEST_TIMEOUT)
  public ApiResponse<Void> RestClientExceptionHandler(RestClientException e) {
    return ApiResponse.<Void>builder() //
        .code(e.getCode()) //
        .message(e.getMessage()) //
        .data(null) //
        .build();
  }

  @ExceptionHandler(ResourceNotFound.class)
  @ResponseStatus(value = HttpStatus.OK)
  public ApiResponse<Void> npeExceptionHandler(ResourceNotFound e) {
    return ApiResponse.<Void>builder() //
        .code(Code.NOTFOUND.getCode()) //
        .message(Code.NOTFOUND.getMessage()) //
        .data(null) //
        .build();
  }

  @ExceptionHandler(NullPointerException.class)
  @ResponseStatus(value = HttpStatus.REQUEST_TIMEOUT)
  public ApiResponse<Void> npeExceptionHandler(NullPointerException e) {
    return ApiResponse.<Void>builder() //
        .code(Code.NPE_EXCEPTION.getCode()) //
        .message(Code.NPE_EXCEPTION.getMessage()) //
        .data(null) //
        .build();
  }

  @ExceptionHandler(Exception.class)
  @ResponseStatus(value = HttpStatus.REQUEST_TIMEOUT)
  public ApiResponse<Void> npeExceptionHandler(Exception e) {
    return ApiResponse.<Void>builder() //
        .code(Code.GENERAL_EXCEPTION.getCode()) //
        .message(Code.GENERAL_EXCEPTION.getMessage()) //
        .data(null) //
        .build();
  }
}
