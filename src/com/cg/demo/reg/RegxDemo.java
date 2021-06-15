package com.cg.demo.reg;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegxDemo {
    public static void main(String[] args) {
    	String regex = "[a-zA-Z0-9]";
    	
    Pattern pattern = Pattern.compile(regex);
    
    for (int i = 1; i < 256; i++) {
    	String input = Character.toString((char) i);
    	Matcher matcher = pattern.matcher(input);
    	
    }
	
}
}
