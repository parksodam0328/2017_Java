package layout;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutExam extends JFrame {
	public FlowLayoutExam(){
		super("FlowLayout");
		Container cont = getContentPane(); // ���� ��Ÿ��(CSS�� ����) -> �Ӽ� ������ ������ ����
		cont.setLayout(new FlowLayout());
		cont.add(new JButton("��ư1"));
		cont.add(new JButton("��ư2"));
		cont.add(new JButton("��ư3"));
		//setSize(300,200);
		pack(); //������Ʈ�� �°� ������ ����
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new FlowLayoutExam();
	}

}
