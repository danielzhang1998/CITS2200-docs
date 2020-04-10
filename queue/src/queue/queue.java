package queue;

import java.util.LinkedList;
import java.util.Queue;

public class queue {

	public static void main(String[] args) {

		Queue<String>a = new LinkedList<String>();
		//	check the queue is empty or not
		if (a.isEmpty()) {
			System.out.println("it is empty!");
		}
		//	add a new element at the end of the queue 
		a.offer("A");
		a.add("B");
		a.offer("C");
		a.offer("D");
		a.offer("E");
		a.offer("F");
		//	remove the first element
		a.remove();
		//	get the first element from queue and delete it
		System.out.println(a.poll());
		System.out.println(a.remove());
		//	get the first element but not delete it
		System.out.println(a.element());
		System.out.println(a.peek());
		System.out.println(a);
	}


}
