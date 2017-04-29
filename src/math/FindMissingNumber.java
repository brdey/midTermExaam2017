package math;

/**
 * Created by mrahman on 04/22/17.
 */
public class FindMissingNumber {

	public static void main(String[] args) {
		/*
		 * If n = 10, then array will have 9 elements in the range from 1 to 10.
		 * For example {10,2,1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
		 * Write java code to find the missing number from the array. Write static helper method to find it.
		 */
		FindMissingInput();
	}
	public static void FindMissingInput(){
		int [] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
		System.out.println("Given value in the array are : ");
		for (int i : array) {
			System.out.print(i+", ");	
		}
		int length= array.length; 
		int sum = 0;
		for(int mNumber=0; mNumber<length; mNumber++)
			sum=sum+array[mNumber]; 
		int givenNumber = ((length + 1) * (length + 2)) / 2; //Formula (n(n+1)) to get the total number.
		int missNumber = givenNumber - sum;
		System.out.println("\n And the missing number in this array is :  " + missNumber);

	}
}

