package com.cg.demo.reg;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PanCardDemo {
public static void main(String[] args) {
		
		String pan = "ABCDE5454F";	
		String regex = "[A-Z]{5}[0-9]{4}[A-Z]{1}";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(pan);
		System.out.println(matcher.matches());
	}

	

}
