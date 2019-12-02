package com.semanticsquare.collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class QueueDemo {

	private static void dequeTest() {
		System.out.println("\nInside deque test ...");
		
		//Queue - FIFO
		//Deque<String> deque = new ArrayDeque<>();
		
		//To implement the statck and queue using linked list comment above line and uncomment below line.
		
		Deque<String> deque = new LinkedList<>();
		deque.add("walden");
		deque.add("harry porter");
		deque.add("head first java");
		
		System.out.println("\nPrinting queue ...");
		System.out.println(deque.remove());		//removeFirst
		System.out.println(deque.remove());
		System.out.println(deque.remove());
		
		//Stack - LIFO
		deque.push("walden");
		deque.push("harry porter");
		deque.push("head first java");
		
		System.out.println("\nPrinting stack ...");
		System.out.println(deque.pop());		
		System.out.println(deque.pop());
		System.out.println(deque.pop());
	}

	public static void main(String[] args) {
		dequeTest();
	}

}
