package user.register;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmaiId {

	
	public void checkPatternEmailId() {
		String EmailIdPattern = "^(?:(?:\\+|0{0,2})91(\\s*[\\-]\\s*)?|[0]?)?[789]\\d{9}$";
		Scanner userInput = new Scanner(System.in);
		System.out.println("enter the Email address: ");
		String checkPattern = userInput.next();

		if (Pattern.matches(EmailIdPattern, checkPattern))
			System.out.println("Pattern match.");
		else
			System.out.println("patern match fail please try again");
    }
}
