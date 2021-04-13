package user.register;

import java. util.regex.*;

public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome to user registration file.");
		
		FirstName firstName = new FirstName();
		LastName lastName =new LastName();
		
		
		
		firstName.checkPatternFirstName();
		lastName.checkPatternLastName();
		email_Id.checkPatternEmailId();
	}
	

}
