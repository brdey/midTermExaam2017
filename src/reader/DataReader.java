package reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DataReader {
	static String textFile = "C:\\Users\\BELEE\\workspace\\ExamMarch2017\\src\\data\\self-driving-car.txt";
	public static void main(String[] args) {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */
		try (BufferedReader br = new BufferedReader(new FileReader(textFile))) {
			String realFile;
			while ((realFile = br.readLine()) != null) {
				System.out.println(realFile);
			}

		} catch (IOException e) {
			System.out.println("Could not find the file. Please ensure the source address to read the file correctly.");
		}

	}			
}
