package com.cg.demo.abs;

public class BankingDemo {
	public static void main(String[] args) {
		
		HDFC hdfc = new HDFC();
		hdfc.doKyc();
		hdfc.openAccount();
		hdfc.payIntrest();
		hdfc.giveLoan();
		
		ICICI icici = new ICICI();
		icici.doKyc();
		icici.openAccount();
		icici.payIntrest();
		icici.giveLoan();
		
		

	}
		
		
	}


