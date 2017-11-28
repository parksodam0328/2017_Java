package cashier;
import cashier.QueueEmptyException;
import java.util.Vector;

class Customer{
	public String line;
	String str;
	
	public Customer(String str) {
		super();
		this.str = str;
	}
	public String getName(){
		return str;
	}
}

class Queue{
	Vector q = new Vector(10);
	public boolean isEmpty(){
		return q.isEmpty(); //기본 메서드
	}
	public Object dequeue() throws QueueEmptyException{
		if(isEmpty()==true){
			throw new QueueEmptyException();
		}
		Object obj=q.firstElement();
		q.removeElement(obj); //기본 메서드
		return obj;
	}
	public void enqueue(Object obj){
		q.addElement(obj); //기본 메서드
	}
}

class QueueEmptyException extends Exception{
	public QueueEmptyException(){}
	public QueueEmptyException(String msg){
		super(msg);
	}
}

class Cashier {
	
	Queue customerQueue = new Queue();
	
	public void addCustomer(Customer c){
		customerQueue.enqueue(c);
		}
		public void getNextCustomer() throws QueueEmptyException{
			Customer cust;
			try{
				cust = (Customer)(customerQueue.dequeue());
				System.out.println(cust.getName()+"님이 계산하셨습니다.");
			}catch(QueueEmptyException e){
				System.out.println("기다리는 고객이 없어서 계산할 수 없습니다.");
			}
		}
	}

public class CashierDrvier {  

	public static void main(String[] args) throws QueueEmptyException {
		Cashier cs = new Cashier();
		
		//줄서기
		cs.addCustomer(new Customer("고객1"));
		cs.addCustomer(new Customer("고객2"));
		cs.addCustomer(new Customer("고객3"));
		cs.addCustomer(new Customer("고객4"));
		
		//서비스하기
		cs.getNextCustomer();
		cs.getNextCustomer();
		cs.getNextCustomer();
		cs.getNextCustomer();
		cs.getNextCustomer();
		cs.getNextCustomer();
	}
}