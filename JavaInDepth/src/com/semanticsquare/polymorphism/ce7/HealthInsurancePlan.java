package com.semanticsquare.polymorphism.ce7;

public abstract class HealthInsurancePlan {
    // Code for 'coverage' field goes here
    
    // Don't worry about the below code and also the InsuranceBrand class
	private InsuranceBrand offeredBy;
	private double coverage;	
	private double discount;
	private double monthlyPremium;
	
	public abstract double computeMonthlyPremium(double salary, int age, boolean isSmoking);
	
	public InsuranceBrand getOfferedBy() {
		return offeredBy;
	}

	public void setOfferedBy(InsuranceBrand offeredBy) {
		this.offeredBy = offeredBy;
	}
	
	public double getCoverage() {
		return coverage;
	}

	public void setCoverage(double coverage) {
		this.coverage = coverage;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getMonthlyPremium() {
		return monthlyPremium;
	}

	public void setMonthlyPremium(double monthlyPremium) {
		this.monthlyPremium = monthlyPremium;
	}
}
