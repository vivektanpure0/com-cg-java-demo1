package com.cg.demo.abs;


interface CentralGovtRules {
	public abstract void payIntrest();
	
}
interface StateGovtRules {
	public abstract void giveLoan();
	
}

abstract class RBI {
	public abstract void doKyc();
	public void openAccount () {
		System.out.println("Open account..");
	}
	
		
}
