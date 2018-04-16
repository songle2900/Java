package transaction;

public class Withdraw extends Thread {
	private Account acc;
	int f = 0;
	int c = 0;
	double money = 0;

	public Withdraw(Account account) {
		acc = account;
	}

	// Override run() method of Runnable to execute a new thread
	public void run() {
		while (f == 0) {
			synchronized (acc) {
				while (acc.getBalance() != 0) {
					
					// Calling subtractMoney to subtract the specific amount to current balance
					acc.subtractMoney(0.5);
					
					// Print out the balance after withdrawl
					System.out.println("After Withdrawl Balance Left = " + acc.getBalance() + "\n");
					acc.notify();
				}
			}
		}
	}
}
