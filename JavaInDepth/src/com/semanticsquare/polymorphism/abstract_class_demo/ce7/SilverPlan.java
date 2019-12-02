package com.semanticsquare.polymorphism.ce7;

public class SilverPlan extends HealthInsurancePlan {
	
	public SilverPlan(double coverage, double discount, double monthlyPremium) {
		setCoverage(coverage);
		setDiscount(discount);
		setMonthlyPremium(monthlyPremium);
	}

	@Override
	public double computeMonthlyPremium(double salary) {
		// TODO Auto-generated method stub
		double premium = salary * getMonthlyPremium();
		return premium;
	}
	
}
