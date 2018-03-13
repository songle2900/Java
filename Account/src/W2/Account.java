package W2;

import java.io.Serializable;

import java.util.Scanner;

public class Account implements Serializable {
	private int account;
	private double balance;
	private String firstName;
	private String lastName;
	private static int num;
	
	Account(int account, double balance, String firstName, String lastName) {
		this.account = account;
		this.balance = balance;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public static void main(String[] args) {
		System.out.println("----- Task 1 -----");
		do {
			System.out.println("Select the Option");
			System.out.println("1. Register Account information");
			System.out.println("2. Display the Account information");
			System.out.println("0. Exit");
			System.out.println("Enter the number: ");
			Scanner r = new Scanner(System.in);
			num = r.nextInt();
			
			if(num == 1) {
				NewAccount.enterDetails();
			} else if(num == 2) {
				DisplayInfo.display();
			}
			
		} while(num != 0);
	}
	
	public int getAccount() {
		return this.account;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public String getFullName() {
		String fullName = firstName + " " + lastName;
		return fullName;
	}
}
