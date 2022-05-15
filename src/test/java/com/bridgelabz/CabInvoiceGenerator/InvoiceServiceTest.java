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
		double fare = cabServiceGenerator.calculate(distance, time);
		Assert.assertEquals(25.0, fare);
	}
	@Test
	public void givenDistanceAndTime_ShouldReturnMinFare() {
		double distance = 0.4;
		int time = 1;
		InvoiceGenerator cabServiceGenerator = new InvoiceGenerator();
		double fare = cabServiceGenerator.calculate(distance, time);
		Assert.assertEquals(5.0, fare);
	}
	@Test
	public void givenMultipleRides_ShouldReturnAggregateTotalFare() {
		InvoiceGenerator cabServiceGenerator = new InvoiceGenerator();
		Ride[] rides = { new Ride(2.0,5),
				         new Ride(0.1,1),
						};
		double fare = cabServiceGenerator.calculate(rides);
		System.out.println(fare);
		Assert.assertEquals(30.0, fare);
	}
}
