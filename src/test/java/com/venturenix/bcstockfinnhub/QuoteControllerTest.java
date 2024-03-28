package com.venturenix.bcstockfinnhub;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import com.venturenix.bcstockfinnhub.controller.impl.QuoteController;
import com.venturenix.bcstockfinnhub.exception.Code;
import com.venturenix.bcstockfinnhub.exception.InvalidStockSymbolException;
import com.venturenix.bcstockfinnhub.model.Quote;
import com.venturenix.bcstockfinnhub.service.QuoteService;

@WebMvcTest(QuoteController.class)
public class QuoteControllerTest {
  
//    @Autowired
//   private MockMvc mockMvc;

//   @MockBean
//   QuoteService quoteService;

//    @Test
//   void testGetQuote() throws Exception {

//  Quote quote = Quote.builder() //
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

//     Mockito.when(quoteService.getQuote(symbol)).thenReturn(quote);

//     mockMvc.perform(get("/stock/finnhub/api/v1/quote") //
//     .param("symbol", "AAPL")) //
//     .andExpect(status().isOk()) //
//     .andExpect(content().contentType(MediaType.APPLICATION_JSON)) //
//     .andExpect(jsonPath("$.code").value("000000")) //
//     .andExpect(jsonPath("$.message").value("OK.")) //
//     .andExpect(jsonPath("$.data.c").value(182.31)) //
//     .andExpect(jsonPath("$.data.d").value(-1.55)) //
//     .andExpect(jsonPath("$.data.h").value(184.85)) //
//     .andExpect(jsonPath("$.data.l").value(181.665)) //
//     .andExpect(jsonPath("$.data.pc").value(183.86)) //
//     .andExpect(jsonPath("$.data.t").value(1708117200)) //
//     .andDo(print());

//   }

//   @Test
//   void testGetQuoteInvalidSymbol() throws Exception {

//     String symbol = "ZZ";

//     Mockito.when(quoteService.getQuote(symbol)).thenThrow(InvalidStockSymbolException.class);

//     mockMvc.perform(get("/stock/finnhub/api/v1/quote") //
//         .param("symbol", "ZZ")) //
//         .andExpect(status().isBadRequest()) //
//         .andExpect(content().contentType(MediaType.APPLICATION_JSON)) //
//         .andExpect(jsonPath("$.code").value(Code.INVALID_STOCK_SYMBOL.getCode())) //
//         .andExpect(jsonPath("$.message").value(Code.INVALID_STOCK_SYMBOL.getMessage())) //
//         .andExpect(jsonPath("$.data").isEmpty()) //
//         .andDo(print());
//   }

 }
