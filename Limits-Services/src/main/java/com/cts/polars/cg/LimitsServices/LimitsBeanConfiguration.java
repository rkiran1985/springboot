package com.cts.polars.cg.LimitsServices;

public class LimitsBeanConfiguration {
	
private int minimum , maximum;

public LimitsBeanConfiguration(int minimum, int maximum) {
	super();
	this.minimum = minimum;
	this.maximum = maximum;
}

public int getMinimum() {
	return minimum;
}

public void setMinimum(int minimum) {
	this.minimum = minimum;
}

public int getMaximum() {
	return maximum;
}

public void setMaximum(int maximum) {
	this.maximum = maximum;
}

}
