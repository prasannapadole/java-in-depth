package com.semanticsquare.polymorphism.ce7;

public class BlueCrossBlueShield implements InsuranceBrand {
	private long id;
	private String name;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public double computeMonthlyPremium(HealthInsurancePlan insuracePlan, int age, boolean isSmoking) {
		// TODO Auto-generated method stub
		double extraPremium = 0.0;	
		
		if (insuracePlan instanceof PlatinumPlan) {
			extraPremium = conditionPremium(age, isSmoking, 200, 100);
		}
		else if (insuracePlan instanceof GoldPlan) {
			extraPremium = conditionPremium(age, isSmoking, 150, 90);
		}
		else if (insuracePlan instanceof SilverPlan) {
			extraPremium = conditionPremium(age, isSmoking, 100, 80);
		}
		else if (insuracePlan instanceof BronzePlan) {
			extraPremium = conditionPremium(age, isSmoking, 50, 70);
		}
				
		return extraPremium;
	}
	
	private double conditionPremium(int age, boolean isSmoking, double ageSurcharge, double smokeSurcharge) {
		double extraPremium = 0.0;
		
		if(age > 55) {
			extraPremium += ageSurcharge;
		}
		
		if(isSmoking) {
			extraPremium += smokeSurcharge;
		}
		return extraPremium;
	}
}
