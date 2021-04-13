package user.register;

import java.util.Scanner;
import java.util.regex.Pattern;

public class LastName {
	public void checkPatternLastName() {
		String lastNamePattern = "^[A-Z]{1}[a-z]{2,}$";
		Scanner userInput = new Scanner(System.in);
		System.out.println("enter the Last Name: ");
		String checkPattern = userInput.next();

		if (Pattern.matches(lastNamePattern, checkPattern))
			System.out.println("Pattern match.");
		else
			System.out.println("patern match fail! please try again!!!");
	}
}
