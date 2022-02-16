package com.Bridgelabz.InvoiceGenerator;
public class InvoiceGenerator {
	private static final int MINUMUM_COST_PER_KILOMETER = 10;
	private static final int COST_PER_MINUTE = 1;
	private static final int MINIMUM_FARE = 5;


	public static double calculatrFare(double distance, int time) {
		double totalFare=distance*MINUMUM_COST_PER_KILOMETER+time*COST_PER_MINUTE;
		if (totalFare<MINIMUM_FARE)
			return MINIMUM_FARE;
		return totalFare;
	}


	public InvoiceSummary calculateFare(Ride[] rides) {
		double totalFare=0;
		for(Ride ride : rides) {
			totalFare+=this.calculatrFare(ride.distance, ride.time);
		}
		return new InvoiceSummary(rides.length, totalFare);
	}
	
	}

