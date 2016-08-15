package myClass;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CountriesTextFile {
	
	



	public static void readFile(File countriesFile) {
		try {
			FileReader reader = new FileReader(countriesFile);

			BufferedReader bReader = new BufferedReader(reader);

			String newLine = bReader.readLine();

			while (newLine != null) {
				System.out.println(newLine);

				newLine = bReader.readLine();

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (IOException e) {

		}
	}

	public static void writeToFile(File countriesFile) {
		PrintWriter wrt = null;
		try {
			wrt = new PrintWriter(countriesFile);

			//wrt.println("Hello World!");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} finally {
			wrt.close();
		}
	}

	public static void writeToFileAppend(File countriesFile) {

		FileWriter wrt = null;
		
		Scanner scan1 = new Scanner(System.in);
		String choice = scan1.nextLine();

		try {
			wrt = new FileWriter(countriesFile, true);
			wrt.append("\n" + choice);
			wrt.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

		catch (IOException e) {
		}
	}
}
