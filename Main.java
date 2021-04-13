package user.register;

import java. util.regex.*;

public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome to user registration file.");
		
		FirstName firstName = new FirstName();
		LastName lastName =new LastName();
		Email_Id email_Id = new Email_Id();
		PhoneNumber phoneNumber = new PhoneNumber();
		
		
		firstName.checkPatternFirstName();
		lastName.checkPatternLastName();
		email_Id.checkPatternEmailId();
		phoneNumber.checkPatternPhoneNumber();
	}
	

}
