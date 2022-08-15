package com.cg.queue;
import java.util.*;

public class QueueIteratorExample 
{
	public static void main(String[] args) 
	{
		Queue<Integer>q=new ArrayDeque<Integer>();
		for(int i=11;i<15;i++)
		{
			q.add(i); 
		}
		System.out.println(q);
		boolean isadded=q.offer(25);
		System.out.println("IsAdded: "+isadded);
		//Iterator--> to return single elements separately
		Iterator<Integer>itr=q.iterator();
		System.out.println("The elemnts are: ");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}