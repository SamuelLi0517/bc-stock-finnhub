package com.venturenix.bcstockfinnhub;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
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
import com.venturenix.bcstockfinnhub.model.Quote;
import com.venturenix.bcstockfinnhub.service.impl.QuoteServiceImpl;

@ExtendWith(MockitoExtension.class)
public class QuoteServiceImplTest {

//   @Value("${api.finnhub.key}")
//   private String finnhubkey;

//   @Value("${api.finnhub.domain}")
//   private String domain;

//   @Value("${api.finnhub.path}")
//   private String path;

//   @Value("${api.finnhub.endpoint.quote}")
//   private String endpoint;

//   @InjectMocks
//   private QuoteServiceImpl quoteServiceImpl;

//    @Mock
//   private RestTemplate restTemplate;

//  @Test
//   void testGetDataFromApi() {

//     Quote expected = Quote.builder() //
//         .c(182.31) //
//         .d(-1.55) //
//         .dp(-0.843) //
//         .h(184.85) //
//         .l(181.665) //
//         .o(183.42) //
//         .pc(183.86) //
//         .t(1708117200) //
//         .build();

//     String symbol = "AAPL";

//     String urlString = BcUtil.url(Scheme.HTTPS, domain, path,
//         endpoint, finnhubkey, symbol);

//     Mockito.when(restTemplate.getForObject(urlString, Quote.class))
//         .thenReturn(expected);

//     Quote actual = quoteServiceImpl.getDataFromApi(symbol);

//     assertEquals(expected, actual);

//   }

//   @Test
//   void testRestClientException() {

//     Quote expected = Quote.builder() //
//         .c(0) //
//         .d(null) //
//         .dp(null) //
//         .h(0) //
//         .l(0) //
//         .o(0) //
//         .pc(0) //
//         .t(0) //
//         .build();

//     String symbol = "ZZ";

//     String urlString = BcUtil.url(Scheme.HTTPS, domain, path,
//     endpoint, finnhubkey, symbol);

// Mockito.when(restTemplate.getForObject(urlString, Quote.class))
//     .thenReturn(expected);

//     assertThrows(RestClientException.class,
//         () -> quoteServiceImpl.getDataFromApi(symbol));


// }
 }