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
	public synchronized void deposit(int amount){ //�Ա�
		balance += amount;
	}
	public synchronized void withdraw(int amount){ //���
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
		System.out.println("�Ա� �� �ܾ� : "+acc.getBalance());
		Transaction tr = new Transaction(acc);
		Thread th1 = new Thread(tr);
		th1.start(); //10000�� �Ա� -> ������ ����
		tr.run(); //10000�� �Ա� -> main ������ ����
		th1.join(1000);
		System.out.println("�Ա� �� �ܾ� : "+acc.getBalance());
		
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

