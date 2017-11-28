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
		return q.isEmpty(); //�⺻ �޼���
	}
	public Object dequeue() throws QueueEmptyException{
		if(isEmpty()==true){
			throw new QueueEmptyException();
		}
		Object obj=q.firstElement();
		q.removeElement(obj); //�⺻ �޼���
		return obj;
	}
	public void enqueue(Object obj){
		q.addElement(obj); //�⺻ �޼���
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
				System.out.println(cust.getName()+"���� ����ϼ̽��ϴ�.");
			}catch(QueueEmptyException e){
				System.out.println("��ٸ��� ���� ��� ����� �� �����ϴ�.");
			}
		}
	}

public class CashierDrvier {  

	public static void main(String[] args) throws QueueEmptyException {
		Cashier cs = new Cashier();
		
		//�ټ���
		cs.addCustomer(new Customer("��1"));
		cs.addCustomer(new Customer("��2"));
		cs.addCustomer(new Customer("��3"));
		cs.addCustomer(new Customer("��4"));
		
		//�����ϱ�
		cs.getNextCustomer();
		cs.getNextCustomer();
		cs.getNextCustomer();
		cs.getNextCustomer();
		cs.getNextCustomer();
		cs.getNextCustomer();
	}
}