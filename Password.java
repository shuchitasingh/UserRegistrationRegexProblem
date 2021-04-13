package user.register;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Password {
	public void checkPatternPassword() {
		String passwordPattern =  "^(?=.*\\d)([a-z])*(?=.*[A-Z]).{8,}$";
		Scanner userInput = new Scanner(System.in);
		System.out.println("enter the Password: ");
		String checkPattern = userInput.next();

		if (Pattern.matches(passwordPattern, checkPattern))
			System.out.println("Pattern match.");
		else
			System.out.println("patern match fail.. please try again");
	}


}
