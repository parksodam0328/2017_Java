package textbook;

import java.awt.Frame;
import java.awt.List;
import java.awt.Panel;

public class V_7 extends Frame{
		V_7() {
		super("����Ʈ");
		Panel p = new Panel();
		List list1= new List(7,false);
		list1.add("��");
		list1.add("ȭ");
		list1.add("��");
		list1.add("��");
		list1.add("��");
		list1.add("��");
		list1.add("��");
		p.add(list1);
		add(p);
		setSize(300,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new V_7();
	}

}
