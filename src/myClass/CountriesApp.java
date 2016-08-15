package myClass;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CountriesApp {

	public static void main(String[] args) {

		Scanner scan1 = new Scanner(System.in);

		CountriesTextFile ctf = new CountriesTextFile();

		Path filePath = Paths.get("countries.txt");

		File countriesFile = filePath.toFile();

		System.out.println(
				"Welcome to the Countries Maintenance Application\n1-See the list of countries\n2-Add a country\n3-Exit");
		System.out.println("Enter menu number: ");
		int userInput = scan1.nextInt();

		if (userInput == 1) {

			ctf.readFile(countriesFile);

		}

		else if (userInput == 2) {

			System.out.println("Enter country: ");
			ctf.writeToFileAppend(countriesFile);
			System.out.println("This country has been saved!");

		}

		else if (userInput == 3) {
			System.out.println("Goodbye!");

		}
	}
}
