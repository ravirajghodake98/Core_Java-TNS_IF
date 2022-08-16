package com.cg.multithreading;

class ThreadEx extends Thread
{
	public void run()
	{
		try
		{
			Thread.sleep(1000);
			System.out.println("work");
		}
		catch(InterruptedException e)
		{
			System.out.println("Exception handled "+e);
		}
		System.out.println("thread is running");	
	}
}
public class InterruptPredictOutputCode2 {

	public static void main(String[] args) {
		ThreadEx t1=new ThreadEx();
		t1.start();
		t1.interrupt();
	}
}