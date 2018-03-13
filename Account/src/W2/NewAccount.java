package W2;

import java.io.*;

import java.util.Scanner;

public class NewAccount {
	public static void enterDetails() {
		int accountNum;
		double balance2;
		String firstName2;
		String lastName2;
		
		try {
			Scanner reader = new Scanner(System.in);
			System.out.println("Enter the Account information");
			
			System.out.println("Account Number: ");
			accountNum = reader.nextInt();
			System.out.println("First Name: ");
			firstName2 = reader.next();
			System.out.println("Last Name: ");
			lastName2 = reader.next();
			System.out.println("Balance : ");
			balance2 = reader.nextDouble();
			Account temp = new Account(accountNum, balance2, firstName2, lastName2);
			
			ObjectOutputStream write = new ObjectOutputStream(new FileOutputStream("text.txt"));
			write.writeObject(temp);
			write.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
