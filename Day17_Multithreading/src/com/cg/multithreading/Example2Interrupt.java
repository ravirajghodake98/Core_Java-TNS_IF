package com.cg.multithreading;

class ThreadX extends Thread
{
	public void run()
	{
		//System.out.println("Thread Interrupted");
		for(int i=1;i<=5;i++)
		System.out.println(i);
	}
}
public class Example2Interrupt 
{
	public static void main(String[] args) 
	{
		ThreadX x=new ThreadX();
		x.start();
		x.interrupt();   //if thread is not in waiting or sleeping state then thread will not be interrupted
	}
}