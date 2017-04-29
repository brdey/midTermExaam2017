package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<Integer>queue = new LinkedList<Integer>();
		queue.add(20);
		queue.add(30);
		queue.add(40);
		queue.add(50);
		queue.add(60);
		queue.add(70);
		queue.add(80);
		queue.add(90);
		System.out.println("It will remove the top value  from the queue whic is :  "+queue.remove());//in Queue works in FIFO system
		System.out.println("It will pick the second value as top value from the queue"
				+ " after removing the first value which is : "+queue.peek());
		System.out.println("\nThe number has been pulled/deleted was : "+queue.poll()+"\n");
		Iterator use = queue.iterator();
		while(use.hasNext()){
			System.out.println("Printing the value from queue using iterator "+use.next());
		}
		System.out.println("\nThe number has been pulled/deleted was : "+queue.poll()+"\n");
		for(Integer ge : queue){
			System.out.println("printing the value from the queue using for each loop : " + ge);	
}
	}

}
