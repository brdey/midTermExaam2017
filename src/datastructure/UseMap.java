package datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class UseMap {
	HashMap<String, ArrayList<Integer>> list = new HashMap<String, ArrayList<Integer>>();

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving
		 * elements. Add List<String> into a Map. Like, Map<String,List<string>> list = new HashMap<String, List<String>>(); 
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		Map<Integer, String> list = new HashMap<Integer, String>();
		list.put(1, "Hello ");
		list.put(3, "how are you?");
		list.put(2, "there, ");
		list.put(6, "exam going? ");
		list.put(4, " How is ");
		list.put(5, " your java ");
		System.out.println("Unsorted value"+ list+"\n");
		System.out.print("Sorted Values are:  " );
		for (Entry<Integer, String> entry : list.entrySet()) {
			System.out.print(entry.getValue());
		}
		System.out.println("\n");
		System.out.println("Sorted values with the keys are:  ");
		for (Entry<Integer, String> entry : list.entrySet()) {
			System.out.println(entry.getKey()+". "+entry.getValue());
		}
	}

}
