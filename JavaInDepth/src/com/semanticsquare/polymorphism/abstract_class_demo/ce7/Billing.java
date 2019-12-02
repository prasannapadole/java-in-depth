package com.semanticsquare.polymorphism.ce7;

import com.semanticsquare.inheritance.Doctor;
import com.semanticsquare.inheritance.Patient;
import com.semanticsquare.inheritance.User;

public class Billing {
	   
    public static double[] computePaymentAmount(User user, double amount) {
        double[] payments = new double[2];
        
        HealthInsurancePlan insurancePlan = user.getInsurancePlan();

        // your logic 
        if (insurancePlan != null && (insurancePlan instanceof PlatinumPlan || insurancePlan instanceof GoldPlan || insurancePlan instanceof SilverPlan || insurancePlan instanceof BronzePlan)) {
        	double paymentByInsuranceCompany = amount * insurancePlan.getCoverage();
            double paymentByUser = amount - paymentByInsuranceCompany - insurancePlan.getDiscount();
            
            payments[0] = paymentByInsuranceCompany;
            payments[1] = paymentByUser;
        }
        
        return payments;
    }
    
    private static void showBilling() {
    	
    	HealthInsurancePlan insurancePlan = new GoldPlan(0.8, 40.0, 0.070);
    	User user = new Doctor();
    	user.setInsurancePlan(insurancePlan);
    	
    	double[] payments = Billing.computePaymentAmount(user, 1000.0);
    	double monthlyPremium = insurancePlan.computeMonthlyPremium(10000.0);
    	
    	System.out.println("Payment By Insurance Company: " + payments[0] + "\n Payments By Patient: " + payments[1]);
    	System.out.println("Premium by employee: " + monthlyPremium);
    }
    
    public static void main(String args[]) {
    	
    	showBilling();
    	
    }

}