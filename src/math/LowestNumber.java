package math;

import databases.ConnectDB;

import java.util.ArrayList;
import java.util.List;

public class LowestNumber {

	public static void main(String[] args) {
		/*
		 * Write java solution to find the lowest number from this array.
		 * Use one of the databases from mysql or mongodb to store and to retrieve.
		 */
		int  array[] = new int[]{211,110,99,34,67,89,67,456,321,456,78,90,45,32,56,78,90,54,32,123,67,5,679,54,32,65};
		int lowest = getLow(array);
		System.out.println("The lowest value in this array is : "+ lowest);
	}
	public static int getLow(int[] arrayValue){ 
		int lowest = arrayValue[0]; 
		for(int i=1;i<arrayValue.length;i++){ 
			if(arrayValue[i] < lowest){ 
				lowest = arrayValue[i]; 
			} 
		}
		return lowest; 
	} 

	/*	ConnectDB connectDB = new ConnectDB();
		List<String> lowestValue = new ArrayList<String>();{
		try {
			connectDB.InsertDataFromArryToMySqlLowestData(arrayValue,"tbl_lowestNumber", "column_lowestNumber");
			lowestValue = connectDB.readDataBase("tbl_lowestNumber", "column_lowestNumber");

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Data is reading from the Table (tbl_primenumber) and displaying to the console");
		for(String st:lowestValue){
			System.out.println(st);
		}*/

}