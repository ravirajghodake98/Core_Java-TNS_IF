package com.cg.queue;
import java.util.*;

public class DequeExample {

	public static void main(String[] args) {
		Deque<Object>d=new ArrayDeque<Object>();   //Deque is an interface and we cannot create object for interface
		//thats why deque is in left hand side
		
		//adding elements on front and rear end
		d.add(11);
		d.add(12);
		d.addFirst(13);    //it will print at first
		d.addLast(19);     //it will print at last
		d.add(17);
		d.add(20);
		System.out.println(d);
		
		//removing elements from front and rear end
		d.removeFirst();
		d.removeLast();
		System.out.println(d);
	}
}