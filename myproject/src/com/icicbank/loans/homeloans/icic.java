package com.icicbank.loans.homeloans;

public class icic implements Rbi
{

	public static void main(String[] args) 
	{
		icic obj=new icic();
		obj.withdrawal();
		obj.deposit();
	}

	@Override
	public void withdrawal() 
	{
			System.out.println("I am overriden withdrawn from ICIC");
	}

	@Override
	public void deposit() 
	{
			System.out.println("I am overriden deposit from ICIC");		
	}

}
