package com.quiz.application;

import java.util.Scanner;

public class MainRegistration {
	

	public static void getUserInput() {
		// TODO Auto-generated method stub

		System.out.println("Enter The Information");

		Scanner sc = new Scanner(System.in);
		

		System.out.println("Enter The First Name:");
		 sc.next();

		System.out.println("Enter The Last Name:");
		 sc.next();

		System.out.println("Enter The UserName:");
		 sc.next();

		System.out.println("Enter The Password:");
		 sc.next();

		System.out.println("Enter The City:");
		sc.next();

		System.out.println("Enter The Mail Id:");
		sc.next();

		System.out.println("Mobile Number:");
		sc.nextLong();
		
		StudentRegistration student=new StudentRegistration();
	  
		String firstName = sc.next();
		student.setFirstName(firstName );
		String lastName=sc.next();
		student.setLastName(lastName);
		String userName=sc.next();
		student.setUserName(userName);
		String passWord=sc.next();
		student.setPassWord(passWord);
		String city=sc.next();
		student.setCity(city);
		String mailId = sc.next();
		student.setMailId(mailId);
		long mobileNumber=sc.nextLong();
		student.setMobileNumber(mobileNumber);
		
		
		
	}
	public static void main(String[] args) {
		getUserInput();
		
	
		
	}

}

