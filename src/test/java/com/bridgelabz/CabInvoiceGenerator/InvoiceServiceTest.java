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
	public void MinFare() {
		double distance = 0.4;
		int time = 1;
		InvoiceGenerator cabServiceGenerator = new InvoiceGenerator();
		double fare = cabServiceGenerator.calculate(distance, time);
		Assert.assertEquals(5.0, fare);
	}
	@Test
	public void TotalFare() {
		InvoiceGenerator cabServiceGenerator = new InvoiceGenerator();
		Ride[] rides = { new Ride(2.0,5),
				         new Ride(0.1,1),
						};
		double fare = cabServiceGenerator.calculate(rides);
		System.out.println(fare);
		Assert.assertEquals(30.0, fare);
	}
	
	@Test
	public void FarePerRide() {
		InvoiceGenerator cabServiceGenerator = new InvoiceGenerator();
		Ride[] rides = { new Ride(2.0,5),
				         new Ride(0.1,1),
						};
		double fare = cabServiceGenerator.calculate(rides);
		int count = cabServiceGenerator.count(rides);
		double average = cabServiceGenerator.Average(fare, count);
		System.out.println(average);
		Assert.assertEquals(15.0, average);
		
	}
	@Test
	public void Summary() {
		InvoiceGenerator cabServiceGenerator = new InvoiceGenerator();
		
		Ride[] rides = { new Ride(2.0,5),
				         new Ride(0.1,1),
						};
		double fare = cabServiceGenerator.calculate(rides);
		int count = cabServiceGenerator.count(rides);
		double average = cabServiceGenerator.Average(fare, count);
		Summary invoiceSummary = new Summary(fare,count,average);
		Assert.assertEquals(15.0, average);
		System.out.println(invoiceSummary);
		
	}
	@Test
	public void premium_ShouldReturnTotalFare() {
		double distance = 2.0;
		int time = 5;
		InvoiceGenerator cabServiceGenerator = new InvoiceGenerator();
		double fare = cabServiceGenerator.premium(distance, time);
		Assert.assertEquals(40.0, fare);

	}

	@Test
	public void lessDistancePremium_MiniumumFare() {
		double distance = 0.1;
		int time = 2;
		InvoiceGenerator cabServiceGenerator = new InvoiceGenerator();
		double fare = cabServiceGenerator.premium(distance, time);
		Assert.assertEquals(20.0, fare);
	}

	
}
