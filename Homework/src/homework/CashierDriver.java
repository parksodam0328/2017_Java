package homework;
import homework.NoCustomer;
import java.util.Vector;
class Cashier {
	
	Vector<Customer> line = new Vector<Customer>(10);
	
	public void addCustomer(Customer c){
		if(line.size()<10){
		line.addElement(c);
		System.out.println(c.str +"���� ����ϼ̽��ϴ�.");
		}
		else{
			System.out.println("�� �ٿ� 10�� �� �� �ֽ��ϴ�. ���� ����� �̵��� �ּ���!");
		}
	}
	public void getNextCustomer() throws NoCustomer{
		if(!line.isEmpty()){
			line.removeElement(line.firstElement());
		}
		else{
			throw new NoCustomer();
		}
	}
}

class Customer{
	public String line;
	String str;
	
	public Customer(String str) {
		super();
		this.str = str;
	}
}

class NoCustomer extends Exception{
	Vector<Customer> line = new Vector<Customer>(10);
	public void linesize() {
		if(line.isEmpty()){
			System.out.println("���ܹ߻�");
		}
	}
}
public class CashierDriver {

	public static void main(String[] args) throws NoCustomer {
		Cashier cs = new Cashier();
		
		try{
		//�ټ���
		cs.addCustomer(new Customer("��1"));
		cs.addCustomer(new Customer("��2"));
		cs.addCustomer(new Customer("��3"));
		cs.addCustomer(new Customer("��4"));
		cs.addCustomer(new Customer("��5"));
		cs.addCustomer(new Customer("��6"));
		cs.addCustomer(new Customer("��7"));
		cs.addCustomer(new Customer("��8"));
		cs.addCustomer(new Customer("��9"));
		cs.addCustomer(new Customer("��10"));
		
		//�����ϱ�
		cs.getNextCustomer();
		cs.getNextCustomer();
		cs.getNextCustomer();
		cs.getNextCustomer();
		cs.getNextCustomer();
		cs.getNextCustomer();
		cs.getNextCustomer();
		cs.getNextCustomer();
		cs.getNextCustomer();
		cs.getNextCustomer();
		cs.getNextCustomer();
		cs.getNextCustomer();
		}catch(NoCustomer nc){
			nc.linesize();
		}
	}
}