package com.venturenix.bcstockfinnhub;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import com.venturenix.bcstockfinnhub.controller.impl.Profile2Controller;
import com.venturenix.bcstockfinnhub.exception.Code;
import com.venturenix.bcstockfinnhub.exception.InvalidStockSymbolException;
import com.venturenix.bcstockfinnhub.model.Profile2;
import com.venturenix.bcstockfinnhub.service.Profile2Service;

@WebMvcTest(Profile2Controller.class)
public class Profile2ControllerTest {
  
//    @Autowired
//   private MockMvc mockMvc;

//   @MockBean
//   Profile2Service profile2Service;

//    @Test
//   void testGetProfile2() throws Exception {

//       Profile2 profile2 = Profile2.builder() //
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

//      Mockito.when(profile2Service.getProfile2(symbol)).thenReturn(profile2);

//     mockMvc.perform(get("/stock/finnhub/api/v1/profile2") //
//         .param("symbol", "AAPL")) //
//         .andExpect(status().isOk()) //
//         .andExpect(content().contentType(MediaType.APPLICATION_JSON)) //
//         .andExpect(jsonPath("$.code").value("000000")) //
//         .andExpect(jsonPath("$.message").value("OK.")) //
//         .andExpect(jsonPath("$.data.country").value("US")) //
//         .andExpect(jsonPath("$.data.currency").value("USD")) //
//         .andExpect(jsonPath("$.data.exchange").value("NASDAQ NMS - GLOBAL MARKET")) //
//         .andExpect(jsonPath("$.data.finnhubIndustry").value("Technology")) //
//         .andExpect(jsonPath("$.data.ipo").value("1980-12-12")) //
//         .andExpect(jsonPath("$.data.logo").value("https://static2.finnhub.io/file/publicdatany/finnhubimage/stock_logo/AAPL.svg")) //
//         .andExpect(jsonPath("$.data.marketCapitalization").value(14089961010L)) //
//         .andExpect(jsonPath("$.data.name").value("Apple Inc")) //
//         .andExpect(jsonPath("$.data.phone").value("14089961010")) //
//         .andExpect(jsonPath("$.data.shareOutstanding").value(15441.88)) //
//         .andExpect(jsonPath("$.data.ticker").value("AAPL")) //
//         .andExpect(jsonPath("$.data.weburl").value("https://www.apple.com/")) //
//         .andDo(print());
//   }

//   @Test
//   void testGetProfile2InvalidSymbol() throws Exception {

//      String symbol = "ZZ";

//     Mockito.when(profile2Service.getProfile2(symbol)).thenThrow(InvalidStockSymbolException.class);

//     mockMvc.perform(get("/stock/finnhub/api/v1/profile2") //
//         .param("symbol", "ZZ")) //
//         .andExpect(status().isBadRequest()) //
//         .andExpect(content().contentType(MediaType.APPLICATION_JSON)) //
//         .andExpect(jsonPath("$.code").value(Code.INVALID_STOCK_SYMBOL.getCode())) //
//         .andExpect(jsonPath("$.message").value(Code.INVALID_STOCK_SYMBOL.getMessage())) //
//         .andExpect(jsonPath("$.data").isEmpty()) //
//         .andDo(print());

//   }



 }

