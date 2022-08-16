package com.cg.multithreading;
class Test extends Thread
{
	public void run()
	{
		System.out.println("Thread is going to run");
	}
}
public class Main 
{
	public static void main(String args[])
	{
		Test create= new Test();
		create.start();
		//create.start();   //once you call start method, you cannot call start method again
	}
}