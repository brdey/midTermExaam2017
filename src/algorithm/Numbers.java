package algorithm;
import java.util.List;
import java.util.Random;

import databases.ConnectDB;

/*
 *Created by PIIT_NYA on 04/22/2017.
 */
public class Numbers {

	/*
	 * Show all the different kind of sorting algorithm by applying into (num array).
	 * Display the execution time for each sorting.Example in below.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 */

	public static void main(String[] args) throws Exception {
		
		int [] num = new int[10000];
		Random rand = new Random();
		for(int i=0; i<num.length; i++){	
		num[i] = rand.nextInt(1000000);
			
		}

		//Selection Sort
		ConnectDB connectDB = new ConnectDB();
		//Selection Sort
		Sort algo = new Sort();
		algo.selectionSort(num);
		long selectionSortExecutionTime = algo.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in Selection Sort take: " + selectionSortExecutionTime + " milli sec");
        connectDB.InsertDataFromArryToMySql(num, "selection_sort", "SortingNumbers");
        List<String> numbers = connectDB.readDataBase("selection_sort", "SortingNumbers");
        for(String st:numbers){
        	System.out.println(st);
        }
		//Insertion Sort
        ConnectDB connectDB1 = new ConnectDB();
		Sort algo1 = new Sort();
		algo1.insertionSort(num);
		long insertionSortExecutionTime = algo1.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in Selection Sort take: " + insertionSortExecutionTime + " milli sec");
        connectDB1.InsertDataFromArryToMySqlInsertionSort(num,"insertion_sort", "SortingNumbers");
        List<String> numbers1 = connectDB1.readDataBase("insertion_sort", "SortingNumbers");
        for(String st:numbers1){
        	System.out.println(st);
        }
        //BubbleSort
		//Continue for rest of the Sorting Algorithm....
        ConnectDB connectDB2 = new ConnectDB();
		Sort algo2 = new Sort();
		algo2.bubbleSort(num);
		long bubbleSortExecutionTime = algo2.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in Selection Sort take: " + bubbleSortExecutionTime + " milli sec");
        connectDB2.InsertDataFromArryToMySqlbubbleSort(num,"bubble_sort", "SortingNumbers");
        List<String> numbers2 = connectDB2.readDataBase("bubble_sort", "SortingNumbers");
        for(String st:numbers2){
        	System.out.println(st);
        }
        //Shell Sort
        ConnectDB connectDB3 = new ConnectDB();
		Sort algo3= new Sort();
		algo2.bubbleSort(num);
		long shellSortExecutionTime = algo3.executionTime;
		System.out.println("Total Execution Time of "+ num.length + " numbers in Selection Sort take: " + shellSortExecutionTime + " milli sec");
        connectDB2.InsertDataFromArryToMySqlshellSort(num,"shell_sort", "SortingNumbers");
        List<String> numbers3 = connectDB3.readDataBase("shell_sort", "SortingNumbers");
        for(String st:numbers3){
        	System.out.println(st);
        }
	}

}
