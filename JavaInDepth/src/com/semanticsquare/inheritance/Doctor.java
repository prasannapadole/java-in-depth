package com.semanticsquare.inheritance;

public class Doctor extends Staff {
	String specialization;

	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
}
