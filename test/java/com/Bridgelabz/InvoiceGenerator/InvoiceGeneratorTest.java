package com.Bridgelabz.InvoiceGenerator;
import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

import com.Bridgelabz.InvoiceGenerator.InvoiceGenerator;
import com.Bridgelabz.InvoiceGenerator.InvoiceSummary;
import com.Bridgelabz.InvoiceGenerator.Ride;

public class InvoiceGeneratorTest {
	@Test
	public void testInvoicegivenDistanceAndTime_shouldEqualToFare() {
		InvoiceGenerator invoiceGenerator =new InvoiceGenerator();
		double distance=7.8;
		int time=10;
		double fare=invoiceGenerator.calculatrFare(distance, time);
		double expected=88;
		double delta=0.0;
		Assert.assertEquals(expected, fare, delta);
	}

	@Test
	public void testInvoicegivenDistanceAndTime_zshouldEqualToMinumumFare() {

		InvoiceGenerator invoiceGenerator=new InvoiceGenerator();
		double distance=0.1;
		int time=1;
		double fare=invoiceGenerator.calculatrFare(distance, time);
		Assert.assertEquals(5, fare, 0.0);
	}
	@Test
	public void givenMultipleRides_ShouldReturnTotalFare() {
		InvoiceGenerator invoiceGenerator=new InvoiceGenerator();
		Ride[] rides = { new Ride(2.0, 5),new Ride(0.1, 1)};
		InvoiceSummary summary = invoiceGenerator.calculateFare(rides);
		InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(2, 30.0);
		assertEquals(expectedInvoiceSummary, summary);
	}
	
	}

