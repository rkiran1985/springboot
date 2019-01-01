package com.example.demo;

import org.springframework.stereotype.Component;

@Component("lap1")
public class Laptop {
	private int lid;
	private String band;
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getBand() {
		return band;
	}
	public void setBand(String band) {
		this.band = band;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", band=" + band + "]";
	}
	public void compile() {
		System.out.println("in laptop compile");
	}

}
