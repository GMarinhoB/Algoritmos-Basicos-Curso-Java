package account;

public class Account {

	private int number;
	private String name;
	private double balance;
	
	
	public Account (int number, String name, double balance) {
		this.number = number;
		this.name = name;
		this.balance = balance;
	}
	
	public Account (int number, String name) {
		this.number = number;
		this.name = name;
		balance = 0;
	}
		
	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void addValue(double add) {
		balance += add;
	}
	
	public void removeValue(double remove) {
		balance -= (remove+5);
	}
	
}
