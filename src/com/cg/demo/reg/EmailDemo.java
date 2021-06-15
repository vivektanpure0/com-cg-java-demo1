package com.cg.demo.reg;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailDemo {
	public static void main(String[] args) {
		
		String email = "vivektanpure0@gmail.com";	
		String regex = "[^\\d][\\w-.]+[@][^\\d][\\w]+[\\.][^\\d][\\w]+";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		System.out.println(matcher.matches());
	}

}
