package PS3;

public class InsufficientFundsException extends Exception {
	
	private double amount;
	
	public InsufficientFundsException(double amount) {
		super("Not enough funds");
		this.amount = amount;
	}
	
	public double getAmount() {
		return amount;
	}

}
