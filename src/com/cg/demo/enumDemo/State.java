package com.cg.demo.enumDemo;

public enum State {

	MAHARASHTRA("MH"), KERALA("KL"), KARNATAKA("KA"), TELANGANA("TS");

	public final String stateCode;

	State(String stateCode) {
		this.stateCode = stateCode;
	}

	public String getStateCode() {
		return stateCode;
	}
}
