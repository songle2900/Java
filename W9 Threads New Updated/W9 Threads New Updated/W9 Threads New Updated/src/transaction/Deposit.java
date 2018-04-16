package transaction;

public class Deposit extends Thread {
	private Account acc;
	private double amount[];
	private String bill[];
	int index = 0;
	int f = 0;

	// Three arguments constructor
	public Deposit(Account account, double[] amt, String[] currency) {
		acc = account;
		amount = amt;
		bill = currency;
	}

	// Override run() method of Runnable to execute a new thread
	public void run() {

		while (f == 0) {
			
			// Using synchronized to lock the thread when the last statement is executed
			synchronized (acc) {
				while (acc.getBalance() != 0) {
					try {
						acc.wait();
					} catch (InterruptedException e) {

					}
				}
				
				// If the balance is 0 and the index is less than 3,
				if (acc.getBalance() == 0 && index < 3) {
					
					// Adding the money that specified in amount[index]
					acc.addMoney(amount[index]);
					
					System.out.println("Balance = 0");
					System.out.println("Adding Amount = " + acc.getBalance());
					acc.setCurrency(bill[index]);
					System.out.println("Setting New Currency = " + acc.getCurrency());
					
					// Increment of index for keep looping
					index++;
					System.out.println("\n" + acc.toString() + "\n");
					acc.notify();
				} else {
					System.out.println("END");
					Thread.currentThread().interrupt();
					f = -1;
				}
			}

		}
		Thread.currentThread().interrupt();
	}
}

