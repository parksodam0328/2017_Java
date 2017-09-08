package bank_2;


class Account{
	int balance;

	public Account() {
		super();
		balance = 0;
	}
	public int getBalance() {
		return balance;
	}
	public synchronized void deposit(int amount){ //입금
		balance += amount;
	}
	public synchronized void withdraw(int amount){ //출금
		balance -= amount;
	}
	
}
public class Transaction implements Runnable{
	private Account acc;
	public Transaction(Account acc) {
		super();
		this.acc = acc;
	}
	public static void main(String[] args) throws InterruptedException {
		Account acc = new Account();
		System.out.println("입금 전 잔액 : "+acc.getBalance());
		Transaction tr = new Transaction(acc);
		Thread th1 = new Thread(tr);
		th1.start(); //10000원 입금 -> 스레드 동작
		tr.run(); //10000원 입금 -> main 스레드 동작
		th1.join(1000);
		System.out.println("입금 후 잔액 : "+acc.getBalance());
		
	}
	
	public void run() {
		deposit(10000);
	}
	private void deposit(int amount) {
		for(int i=0;i<amount;i++) {
			acc.deposit(1);
		}
	}
}

