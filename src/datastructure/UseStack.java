package datastructure;

import java.util.Iterator;
import java.util.Stack;

public class UseStack {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Stack<Integer> success =new Stack<Integer>();
		success.push(100);
		success.push(200);
		success.push(500);
		success.push(700);
		success.push(50);
		System.out.println("Peek value:  "+success.peek());//Looks at the object at the top of this stack without removing it from the stack.
		System.out.println("Pop Value: "+success.pop()+"\n");//Removes the object at the top of this stack and returns that object as the value of this function.		
		System.out.println("Search value = 200 position in the stack is :  " +success.search(200));
		System.out.println("Search value for 60 should return -1 as a false statement :  " +success.search(60)+"\n");
	
		Iterator getValue= success.iterator();	
		while(getValue.hasNext()){
				System.out.println("After using peek and pop method the stack value left with :  " + getValue.next());
		}							
		for (Integer in : success){
				System.out.println("Get the value of the stack using for each loop :   "+in);
	}
	}
}