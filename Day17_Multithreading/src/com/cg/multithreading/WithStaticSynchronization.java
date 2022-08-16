package com.cg.multithreading;

class TestExample
{
	public static synchronized void display()
	{
		System.out.println("Current thread " + Thread .currentThread().getName());
		for(int i = 0; i < 5 ; i++)
		{
			System.out.println(Thread.currentThread().getName() + "i - " +i);
			try
			{
				Thread.sleep(50);			
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();			
			}		
		}	
	}
}
//public class WithStaticSynchronization {

//	public static void main(String[] args) 
//	{
//	}