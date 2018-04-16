package transaction;

public class Account {
	private double balance;
	private String currency;

	// Two arguments constructor 
	Account(double bal, String cur) {
		setCurrency(cur);
		this.balance = bal;
	}

	// Getter Function for Balance
	public double getBalance() {
		return balance;

	}

	// Add specific balance to current balance
	public void addMoney(double add) {
		this.balance = this.balance + add;
	}

	// Subtract specific balance to current balance
	public void subtractMoney(double subtract) {
		this.balance = this.balance - subtract;
	}

	@Override
	
	// Print out string
	public String toString() {
		return "After modifiying currency " + balance + " " + currency;
	}

	// Setter Function for currency
	public void setCurrency(String cur) {
		this.currency = cur;
	}

	// Getter function for currency
	public String getCurrency() {
		return currency;
	}
}
