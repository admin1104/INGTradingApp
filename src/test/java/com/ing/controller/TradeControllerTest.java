package com.ing.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.ing.AbstractTest;
import com.ing.dto.DailyStockAnalyticsResponse;
import com.ing.model.Stock;
import com.ing.model.StockDetails;
import com.ing.model.User;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TradeControllerTest extends AbstractTest {

	@Override
	   @Before
	   public void setUp() {
	      super.setUp();
	   }

	@Test
	public void getUsersListTest() throws Exception {
	      String uri = "/trades/users";
	      MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
	         .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
	      
	      int status = mvcResult.getResponse().getStatus();
	      assertEquals(200, status);
	      String content = mvcResult.getResponse().getContentAsString();
	      User[] users = super.mapFromJson(content, User[].class);
	      assertNotNull(users);
	      assertEquals(4, users.length);
	   }

	@Test
	public void getStocksListTest() throws Exception {
	      String uri = "/trades/stocks";
	      MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
	         .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
	      
	      int status = mvcResult.getResponse().getStatus();
	      assertEquals(200, status);
	      String content = mvcResult.getResponse().getContentAsString();
	      Stock[] stocks = super.mapFromJson(content, Stock[].class);
	      assertNotNull(stocks);
	      assertEquals(5, stocks.length);
	   }
	

	@Test
	public void saveStockDetailsTest() throws Exception {
	   String uri = "/trades/buyStocks";
	   StockDetails stockDetails = new StockDetails();
	   stockDetails.setUserId(1L);
	   stockDetails.setStockName("HCL");
	   stockDetails.setUnits(100);
	   stockDetails.setPurchaseDate(new Date());
	   stockDetails.setStockPrice(1000);
	   stockDetails.setBrokerageFee(100);
	   stockDetails.setTotalPrice(1010);
	   
	   String inputJson = super.mapToJson(stockDetails);
	   MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.post(uri)
	      .contentType(MediaType.APPLICATION_JSON_VALUE)
	      .content(inputJson)).andReturn();
	   
	   int status = mvcResult.getResponse().getStatus();
	   assertEquals(200, status);
	   String content = mvcResult.getResponse().getContentAsString();
	   StockDetails sd = super.mapFromJson(content, StockDetails.class);
	   assertNotNull(sd);
	   assertNotNull(sd.getStockDetailsId());
	}

	
	//@Test
	public void loadPurchaseHistoryTest() throws Exception {
	      String uri = "/trades/purchaseHistory/1L";
	      MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
	         .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
	      
	      int status = mvcResult.getResponse().getStatus();
	      assertEquals(200, status);
	      String content = mvcResult.getResponse().getContentAsString();
	      StockDetails[] stockDetails = super.mapFromJson(content, StockDetails[].class);
	      assertNotNull(stockDetails);
	      assertTrue(stockDetails.length > 0);
	      assertEquals((long)1, (long)stockDetails[0].getUserId());
	   }
	
	@Test
	public void getDailyStockAnalyticsTest() throws Exception {
	      String uri = "/trades/dailyStockAnalytics";
	      MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
	         .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
	      
	      int status = mvcResult.getResponse().getStatus();
	      assertEquals(200, status);
	      String content = mvcResult.getResponse().getContentAsString();
	      DailyStockAnalyticsResponse[] stockAnalytics = super.mapFromJson(content, DailyStockAnalyticsResponse[].class);
	      assertNotNull(stockAnalytics);
	      assertTrue(stockAnalytics.length > 0);
	   }
	
	@Test
	public void test() {
		System.out.println("test");
	}

}
