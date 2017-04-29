package problems;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Arrays;

import com.mysql.jdbc.Connection;

import databases.ConnectDB;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

	public static boolean  areAnagram(String word, String anaWord){
		if (word.length()!=anaWord.length()){
			return false;
		}
		char [] string1 = word.toLowerCase().toCharArray();//we can use this (.replaceAll(" ", "")) instead of using if statement
		char[] string2 = anaWord.toLowerCase().toCharArray();
		Arrays.sort(string1);
		Arrays.sort(string2);
		return Arrays.equals(string1, string2);
	}
    public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
    	System.out.println(areAnagram("MARY", " ARMY"));
    	System.out.println(areAnagram("CAT", "ACT"));
    	System.out.println(areAnagram(" CHECK", "THIS "));
    }
    
}
