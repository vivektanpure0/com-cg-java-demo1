package com.cg.demo.enumDemo;

public class App {
	public static void main(String[] args) {
		System.out.println("Start");
		
		Day today = Day.TUESDAY;
		System.out.println(today);
		
		State myState = State.KERALA;
		System.out.println(myState);

		for (State st : State.values()) {
			System.out.println(st);
			
		}
		
		
	}

}
