package com.cg.multithreading;

class Thread3 extends Thread
{
	public void run()
	{
		try
		{
			Thread.sleep(10000);
			System.out.println("work");		
		}
		catch(InterruptedException e)
		{
			throw new RuntimeException("Thread interrupted"+e);		
		}	
	}
}
public class InterruptPredictOutputCode1 
{
	public static void main(String[] args) 
	{
		Thread3 t1=new Thread3();
		t1.start();
		try
		{
			t1.interrupt();		
		}
		catch(Exception e)
		{
			System.out.println("Exception handled "+e);		
		}
	}
}