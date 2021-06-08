package com.cg.demo.ex;

class InvalidProductException extends Exception
{
    public InvalidProductException(String s)
    {
        
        super(s);
    }
}
 
public class UserDefined
{
  public static void productCheck(int weight) throws InvalidProductException{
	if(weight<100){
		throw new InvalidProductException("Product Invalid");
	}
   }
   
    public static void main(String args[])
    {
    	UserDefined obj = new UserDefined();
        try
        {
            obj.productCheck(60);
        }
        catch (InvalidProductException ex)
        {
            System.out.println("Caught the exception");
            System.out.println(ex.getMessage());
        }
    }
}