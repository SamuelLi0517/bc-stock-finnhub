package com.venturenix.bcstockfinnhub.infra;

import org.springframework.web.util.UriComponentsBuilder;

public class BcUtil {

  public static String url(Scheme https, String domain, String path,
      String endpoint, String finnhubkey, String symbol) {
    return UriComponentsBuilder.newInstance() //
        .scheme(https.lowercaseName())//
        .host(domain)//
        .path(path) // /stock/profile2 -> [stock, profile] -> pathSegment -> /stock/profile
        .path(endpoint)//
        .queryParam("token", finnhubkey)//
        .queryParam("symbol", symbol)//
        .toUriString();

  }
}
