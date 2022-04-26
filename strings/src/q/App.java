package q;

import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class App {

	public static void main(String[] args) {
		
		//Creating an ArrayBlockingQueue which has a limited number of spots in the queue. 
		Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3);
		
		//Adding elements to the queue. 
		q1.add(10);
		q1.add(20);
		q1.add(30);
		
		// Throws no such elements exception if no elements in the queue when you call element method. 
		System.out.println("Head of queue is: " + q1.element());
		
		try {
			q1.add(40);
		} catch (IllegalStateException e) {
			System.out.println("Tried to add too many items to the queue.");
		}
		
		// Iterating through the queue to confirm that we added the 3 values. 
		for(Integer val: q1) {
			System.out.println("Queue value: " + val);
		}
		
		// Removing an element from the head with the remove method. 
		
		System.out.println("Removed from queue: " + q1.remove());
		System.out.println("Removed from queue: " + q1.remove());
		System.out.println("Removed from queue: " + q1.remove());
		
		
		try {
			System.out.println("Removed from queue: " + q1.remove());
		} catch (NoSuchElementException e) {
			System.out.println("Tried to remove to many items from the queue....");
		}
		
		
		
		//Iterating through the queue to confirm that the first value was removed as per the above 3 lines. 
		for(Integer val: q1) {
			System.out.println(val);
		}
		
		///////////////////////////////////////////////
		
		Queue<Integer> q2 = new ArrayBlockingQueue<Integer>(2);
		
		System.out.println("Queue 2 peek: " + q2.peek());
		q2.offer(10);
		q2.offer(20);
		if (q2.offer(30) == false) {
			System.out.println("Offer failed to add the third item.");
		}
		
		for(Integer val: q2) {
			System.out.println("Queue value: " + val);
		}
		
		System.out.println("Queue 2 poll: " + q2.poll());
		System.out.println("Queue 2 poll: " + q2.poll());
		System.out.println("Queue 2 poll: " + q2.poll());

	}

}
