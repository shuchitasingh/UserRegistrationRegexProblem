package user.register;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PhoneNumber {
	public void checkPatternPhoneNumber() {
		String phoneNumberPattern = "^(91\\\\s)[0-9]{10}$";
		Scanner userInput = new Scanner(System.in);
		System.out.println("enter the PhoneNo: ");
		String checkPattern = userInput.next();

		if (Pattern.matches(phoneNumberPattern, checkPattern))
			System.out.println("Pattern match.");
		else
			System.out.println("patern match fail.. please try again");
	}

}
