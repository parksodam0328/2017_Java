package bank1;

class Account{
	private int balance;

	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public Account() {
		super();
		balance = 0;
	}
	public void deposit(int amount){ //입금
		balance += amount;
	}
	public void withdraw(int amount){ //출금
		balance -= amount;
	}
	
}
public class Transation implements Runnable{
	
	private Account acc;
	
	public Transation(Account acc) {
		super();
		this.acc = acc;
	}

	public static void main(String[] args) {
		Account acc = new Account();
		System.out.println("입금전 잔액 : "+acc.getBalance());
	}
	@Override
	public void run() {
		deposit(10000);	
	}

	private void deposit(int i) {
		acc.deposit(i);
	}

}
