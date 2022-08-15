package com.cg.queue;
import java.util.*;

public class QueueExample 
{
	public static void main(String[] args) 
	{
		//Deque<Object>q=new ArrayDeque<Object>();
		//PriorityQueue will print the elements using Priority of the elements
		Queue<Object>q=new PriorityQueue<Object>();  //JVM takes the responsibility of this priority queue 
		q.add(8);
		q.add(55);
		q.add(22);
		q.add(11);
		q.add(9);
		q.add(21);
		System.out.println(q);
		System.out.println(q.peek());
		//this priority which we are getting in output is set by JVM according to their natural ordering
		
		//ArrayDeque will print the element of a queue in same insertion order
		Queue<Object>q1=new ArrayDeque<Object>();
		q1.offer(11);   //offer and add is same. offer is an additional method which is used only in queue concept
		q1.add(12);
		q1.add(10);
		System.out.println(q1);
		System.out.println(q1.element());  //same as peek method
		System.out.println(q1.remove());
		System.out.println(q1); 
	}
}