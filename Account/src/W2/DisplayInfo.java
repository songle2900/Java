package W2;

import java.io.FileInputStream;

import java.io.ObjectInputStream;

public class DisplayInfo {
	public static void display() {
		Account displayAccount = null;
		
		try {
			FileInputStream fInput = new FileInputStream("text.txt");
			ObjectInputStream oInput = new ObjectInputStream(fInput);
			displayAccount = (Account) oInput.readObject();
			fInput.close();
		} catch (Throwable e) {
			System.err.println(e);
		}
		System.out.println("Account Number: " + displayAccount.getAccount());
		System.out.println("Full Name : " + displayAccount.getFullName());
		System.out.println("Balance : " + displayAccount.getBalance());
	}
}
