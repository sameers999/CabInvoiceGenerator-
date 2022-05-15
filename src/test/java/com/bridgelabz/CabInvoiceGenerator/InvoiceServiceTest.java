package com.bridgelabz.CabInvoiceGenerator;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class InvoiceServiceTest {

	@Test
	public void givenDistanceAndTime_ShouldReturnTotalFare() {
		double distance = 2.0;
		int time = 5;
		InvoiceGenerator cabServiceGenerator = new InvoiceGenerator();
		double fare = cabServiceGenerator.calculateFare(distance, time);
		Assert.assertEquals(25.0, fare);
	}
	@Test
	public void givenDistanceAndTime_ShouldReturnMinFare() {
		double distance = 0.4;
		int time = 1;
		InvoiceGenerator cabServiceGenerator = new InvoiceGenerator();
		double fare = cabServiceGenerator.calculateFare(distance, time);
		Assert.assertEquals(5.0, fare);
	}
}
