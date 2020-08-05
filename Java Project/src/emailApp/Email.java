package emailApp;

import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailBoxCapacity = 500;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	private String companySuffix = "khalid.com";
	
	//constructor to receive firstname and lastname
	public Email(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
		
		//call a method  asking for the department  -return the department
		this.department = setDepartment();
		
		//call a method that return random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your Password is: " + this.password);
		
		//combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department +"."+ companySuffix;
		
	}
	
	//Ask for the department
	private String setDepartment(){
		System.out.print("New Worker: "+ firstName + "\nDepartment Code\n1 for Sales \n2 Development \n3 for Accounting \n4 None \nEnter Department Code");
		Scanner in = new Scanner(System.in);
		int deptChoice = in.nextInt();
		if (deptChoice == 1){
			return "Sales" ;
		}
		else if (deptChoice == 2){
			return "development" ;
	}
		else if (deptChoice == 3){
			return "Accounting" ;
	}
		else {
			return "None" ;
	}
	

	}
	
	
	//Generate a random password
	private String randomPassword(int length){
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password = new char[length];
		
		for (int i=0; i<length; i++){
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
		
	}
	

	//Set the mailbox Capacity
	public void setMailboxCapacity(int capacity){
		this.mailBoxCapacity = capacity;
	}
	
	//Set the alternate email
	public void setAlternateEmail(String altEmail){
		this.alternateEmail = altEmail;
	}
	
	//Change the password
	
	public void changePassword(String password){
		this.password = password;
	}
	
	public int getMailboxCapacity(){
		return mailBoxCapacity;
	}
	
	public String getAlternateEmail(){
		return alternateEmail;
	}
	
	public String getPassword(){
		return password;
	}
	
	public String showInfo(){
		return "Display Name:" + firstName + " " + lastName + "\nCompany Email: " + email + "\nMailbox Capcity" +mailBoxCapacity +"mb"; 
	}
	
	
	
	
	
}
