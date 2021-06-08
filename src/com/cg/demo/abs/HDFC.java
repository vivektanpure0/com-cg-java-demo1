package com.cg.demo.abs;

class HDFC extends RBI implements CentralGovtRules, StateGovtRules {
	public void doKyc() {
		System.out.println("Adhaar");
	}
	public void giveLoan() {
		System.out.println("HDFC is giving Laon..");
	}
	public void payIntrest() {
		System.out.println("HDFC is paying Intrest..");
	}

}
