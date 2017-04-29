package problems;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {
	
	
	public static void main(String[] args) {
		/*
		 * Write a java program to find the duplicate words and their number of  occurrences in the string. 
		 * Also Find the average length of the words.
		 */
		String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";	   
        String[] words = st.split(" ");
        HashMap<String, Integer> duplicateWord = new HashMap<>();

		for (String check : words) {
			if (duplicateWord.containsKey(check)) {
				duplicateWord.put(check, duplicateWord.get(check) + 1);

			} else {
				duplicateWord.put(check, 1);
			}
		}
		Set<String> keys = duplicateWord.keySet();
		for (String key : keys) {
			System.out.print("Repititon of the word "+"("+key+ ")"+"= ");
			System.out.println(duplicateWord.get(key)+" times. ");
		}

	}
}