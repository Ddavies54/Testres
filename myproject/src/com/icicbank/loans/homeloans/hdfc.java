package com.icicbank.loans.homeloans;

public class hdfc implements Rbi 
{

	public static void main(String[] args) 
	{
		hdfc obj=new hdfc();
		obj.withdrawal();
		obj.deposit();
	}

	@Override
	public void withdrawal() 
	{
		System.out.println("I am overriden withdrawn from hdfc");	
	}

	@Override
	public void deposit() 
	{
		System.out.println("I am overriden deposit from hdfc");	
	}

}
