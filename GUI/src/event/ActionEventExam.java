package event;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEventExam extends Frame implements ActionListener { // 1�ܰ�, 2�ܰ� �̺�Ʈ �߻� ��ü(��ư)�� ���� �̺�Ʈ Ŭ������ ���� ����
	
	Button b1 = new Button("��ư"); // b1�� p ������Ʈ�� ��� �޼ҵ忡 �����ϱ� ���ؼ� ���� ������
	Panel p = new Panel();
	public ActionEventExam(){
		super("ActionEvent");
		p.add(b1);
		add(p);
		setSize(300,150);
		setVisible(true);
		b1.addActionListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ActionEventExam(); // �̺�Ʈ �߻� ��ü(b1)�� �̺�Ʈ �ڵ鷯�� �����Ѵ�.
	}

	@Override
	public void actionPerformed(ActionEvent ae) { //4�ܰ� actionPerformed �޼ҵ忡 �̺�Ʈ ����� �����Ѵ�.
		// TODO Auto-generated method stub
		if(ae.getSource()==b1) //b1�� ������ â�� �ݱ�
			System.exit(0); 
	}

}
