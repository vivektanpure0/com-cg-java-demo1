package com.cg.demo.ex;

public class OwnException extends Exception {


   OwnException(){
    
 }


public static void main(String[] args)
{
try
{ 
// Create an object of user defined exception and throw it using throw keyword.
   OwnException obj = new OwnException();
   throw obj; 
 } 
catch (OwnException ex) 
{ 
  System.out.println("Caught a user defined exception"); 
 } 	


 }

}