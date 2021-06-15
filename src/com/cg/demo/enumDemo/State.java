package com.cg.demo.enumDemo;

public enum State {

	MAHARASHTRA("MH"), KERALA("KL"), KARNATAKA("KA"), TELANGANA("TS");

	public final String stateCode;

	State(String stateCode) {
		this.stateCode = stateCode;
		System.out.println(stateCode);
		
	
	}
	public String getstateCode() {
		return stateCode;
	
}
}
