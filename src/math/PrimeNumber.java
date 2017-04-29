package math;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Collections;

import org.bson.codecs.configuration.CodecRegistry;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

import algorithm.Numbers;
import databases.ConnectDB;

public class PrimeNumber {
	// private static final int number = 0;

	public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException {
		/*
		 * Find list of Prime numbers from number 2 to 1 million. Try the best
		 * solution as possible.Which will take less CPU life cycle. Out put
		 * number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve
		 * data. *
		 */

		{
			ConnectDB connectDB = new ConnectDB();
			connectDB.connectToMySql();
			connectDB.InsertDataIntoArryToMySql("primeNumber", "PrimeNumber");
		}
		int number, primeNumber;
		for (number = 2; number <= Math.sqrt(10000000); number++) {//fastest way to find the prime number
			for (primeNumber = 2; primeNumber <= number; primeNumber++) {
				if (primeNumber == number) {
					System.out.println("  The prime numbers between 2 to 1 million are :   " + number);
				}
				if (number % primeNumber == 0) {
					break;

				}
			}
		}
	}

}
