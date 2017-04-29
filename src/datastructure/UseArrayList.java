package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

import databases.ConnectDB;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes
		 * add,peek,remove,retrieve elements. Use For Each loop and while loop
		 * with Iterator to retrieve data. Store all the sorted data into one of
		 * the databases.
		 * 
		 */
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("CNSS");
		arrayList.add("SDLC");
		arrayList.add("SQL");
		Iterator ir = arrayList.iterator();
		while (ir.hasNext()) {
			System.out.println(ir.next());
		}
		arrayList.remove(0);
		System.out.println("****After removing the 0 index, the value left with ****");
		for (String s : arrayList) {
			System.out.println(s);
		}
	}
}
