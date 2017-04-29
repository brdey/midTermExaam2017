package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class UseLinkedList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use LinkedList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		List<String>days = new LinkedList<String>();
		days.add(0, "Sturday");
		days.add(1, "Sunday");
		days.add(2, "Monday");
		days.add(3, "Tuesday");
		days.add(4, "Wednesday");
		days.add(5, "Thursday");
		days.add(6, " and Friday");
		System.out.println("*** Before removing the value from Linked list ***");
		Iterator val = days.iterator();
		while(val.hasNext()){
			System.out.println("The given value in the list are : "+val.next());		
		}
		days.remove(4);
		System.out.println("\n***After removing a value from list ***");
		for(String val2 : days){
			System.out.println("The given value left with : " + val2);
		}
		
	}

}
