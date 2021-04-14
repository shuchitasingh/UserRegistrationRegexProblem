package user.register;

import java.util.Scanner;
import java.util.regex.Pattern;


public class FirstName {

	public void checkPatternFirstName() {
		String firstNamePattern = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
		Scanner userInput = new Scanner(System.in);
		System.out.println("enter the First Name: ");
		String checkPattern = userInput.next();

		if (Pattern.matches(firstNamePattern, checkPattern))
			System.out.println("Pattern matching.");
		else
			System.out.println("patern matching fail..");
	}
}
