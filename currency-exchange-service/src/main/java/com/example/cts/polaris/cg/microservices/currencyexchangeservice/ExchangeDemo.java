package com.example.cts.polaris.cg.microservices.currencyexchangeservice;

import java.math.BigDecimal;

public class ExchangeDemo {
	private long id;
	private String from , to;
	private BigDecimal conversionrate;
	private String port;
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	public ExchangeDemo(long id, String from, String to, BigDecimal conversionrate) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionrate = conversionrate;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public BigDecimal getConversionrate() {
		return conversionrate;
	}
	public void setConversionrate(BigDecimal conversionrate) {
		this.conversionrate = conversionrate;
	}
	

}
