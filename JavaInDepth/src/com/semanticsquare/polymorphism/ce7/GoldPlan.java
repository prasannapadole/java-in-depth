package com.semanticsquare.polymorphism.ce7;

public class GoldPlan extends HealthInsurancePlan {
	
	public GoldPlan(double coverage, double discount, double monthlyPremium) {
		setCoverage(coverage);
		setDiscount(discount);
		setMonthlyPremium(monthlyPremium);
	}

	@Override
	public double computeMonthlyPremium(double salary, int age, boolean isSmoking) {
		// TODO Auto-generated method stub
		setOfferedBy(new BlueCrossBlueShield());
		double premium = salary * getMonthlyPremium() + getOfferedBy().computeMonthlyPremium(this, age, isSmoking);
		return premium;
	}
	
}
