package com.cg.multithreading;

class ThreadEg extends Thread
{
	public void run()
	{
		for(int i=1;i<=3;i++)
		{
			System.out.println("doing task "+i);		
		}	
	}
}
public class InterruptPredictOutputCode3 
{
	public static void main(String[] args) throws InterruptedException
	{
		ThreadEg t1=new ThreadEg();

		t1.start();
		System.out.println("is thread interrupted "+t1.isInterrupted());

        t1.interrupt();
		System.out.println("is thread interrupted " +t1.isInterrupted());
		
		//System.out.println("is thread interrupted " +t1.interrupted());
	}
}