package com.example.cts.polaris.cg.microservices.currencyexchangeservice;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {
	@Autowired 
	private Environment environment;
@GetMapping("/exchange/from/{from}/to/{to}")
	public ExchangeDemo getExchangeInfo(@PathVariable String from,@PathVariable String to)
	{
		//return new ExchangeDemo(1000L,from,to,BigDecimal.valueOf(1));
	// for getting port No
	ExchangeDemo exchange = new ExchangeDemo(1000L,from,to,BigDecimal.valueOf(1));
	exchange.setPort(environment.getProperty("local.server.port"));
	return exchange;
	
	}
}
