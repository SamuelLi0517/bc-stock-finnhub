package com.venturenix.bcstockfinnhub;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;
import com.venturenix.bcstockfinnhub.exception.RestClientException;
import com.venturenix.bcstockfinnhub.infra.BcUtil;
import com.venturenix.bcstockfinnhub.infra.Scheme;
import com.venturenix.bcstockfinnhub.model.Profile2;
import com.venturenix.bcstockfinnhub.service.impl.Profile2ServiceImpl;

@ExtendWith(MockitoExtension.class)
public class Profile2ServiceImplTest {
  
//     @Value("${api.finnhub.key}")
//   private String finnhubkey;

//   @Value("${api.finnhub.domain}")
//   private String domain;

//   @Value("${api.finnhub.path}")
//   private String path;

//   @Value("${api.finnhub.endpoint.quote}")
//   private String endpoint;

//    @InjectMocks
//   private Profile2ServiceImpl profile2ServiceImpl;

//    @Mock
//   private RestTemplate restTemplate;

// @Test
// void testGetDataFromApi(){

//  Profile2 expected = Profile2.builder() //
//         .country("US") //
//         .currency("USD") //
//         .estimateCurrency("USD") //
//         .exchange("NASDAQ NMS - GLOBAL MARKET") //
//         .finnhubIndustry("Technology") //
//         .ipo(LocalDate.parse("1980-12-12")) //
//         .logo(
//             "https://static2.finnhub.io/file/publicdatany/finnhubimage/stock_logo/AAPL.svg") //
//         .marketCapitalization(14089961010L) //
//         .name("Apple Inc") //
//         .phone("14089961010") //
//         .shareOutstanding(15441.88) //
//         .ticker("AAPL") //
//         .weburl("https://www.apple.com/") //
//         .build();

//     String symbol = "AAPL";

//     String urlString = BcUtil.url(Scheme.HTTPS, domain, path,
//         endpoint, finnhubkey, symbol);

//     Mockito.when(restTemplate.getForObject(urlString, Profile2.class))
//         .thenReturn(expected);

//     Profile2 actual = profile2ServiceImpl.getDataFromApi(symbol);

//     assertEquals(expected, actual);
// }

// @Test
// void testRestClientException(){

//   Profile2 profile2 = Profile2.builder() //
//   .country(null) //
//   .currency(null) //
//   .estimateCurrency(null) //
//   .finnhubIndustry(null) //
//   .ipo(null) //
//   .marketCapitalization(0.0) //
//   .name(null) //
//   .phone(null) //
//   .shareOutstanding(0.0) //
//   .ticker(null) //
//   .weburl(null) //
//   .build();

// String symbol = "ZZ";

// String urlString = BcUtil.url(Scheme.HTTPS, domain, path,
// endpoint, finnhubkey, symbol);

// Mockito.when(restTemplate.getForObject(urlString, Profile2.class))
// .thenReturn(profile2);

//  assertThrows(RestClientException.class,
//         () -> profile2ServiceImpl.getDataFromApi(symbol));

// }
}
