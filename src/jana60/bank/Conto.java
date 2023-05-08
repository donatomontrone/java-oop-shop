package jana60.bank;

import java.util.Random;

public class Conto {
	private int accountNumber;
	private String name;
	private int balance = 0;
	
	public Conto(String name) {
		setName(name);
		setAccountNumber();
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	
	public void setAccountNumber() {
		Random  rnd = new Random();
		accountNumber = rnd.nextInt(1,1001);
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getBalance() {
		return balance;
	}
	
//	public void setBalance(double balance) {
//		this.saldo = balance;
//	}
	
	
	public void deposit(int value) {
		balance += value;
	}
	
	public void withdraw(int value) {
		balance -= value;
	}
}
