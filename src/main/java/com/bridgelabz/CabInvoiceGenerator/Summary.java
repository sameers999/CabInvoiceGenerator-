package com.bridgelabz.CabInvoiceGenerator;

public class Summary {
	double totalFare;
	int count;
	double average;

	public Summary(double totalFare, int count, double average) {
		super();
		this.totalFare = totalFare;
		this.count = count;
		this.average = average;
	}
	public Summary() {
		
	}

	public double getTotalFare() {
		return totalFare;
	}

	public void setTotalFare(double totalFare) {
		this.totalFare = totalFare;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public double getAverage() {
		return average;
	}

	public void setAverage(double average) {
		this.average = average;
	}

	@Override
	public String toString() {
		return "InvoiceSummary [totalFare=" + totalFare + ", count=" + count + ", average=" + average + "]";
	}
	}
