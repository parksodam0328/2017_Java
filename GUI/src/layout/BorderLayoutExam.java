package layout;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutExam extends JFrame {
	public BorderLayoutExam(){
		super("BorderLayout");
		Container cont = getContentPane(); // ���� ��Ÿ��(CSS�� ����) -> �Ӽ� ������ ������ ����
		cont.setLayout(new BorderLayout());
		cont.add(new JButton("��"), BorderLayout.NORTH);
		cont.add(new JButton("�Ʒ�"), BorderLayout.SOUTH);
		cont.add(new JButton("����"), BorderLayout.WEST);
		cont.add(new JButton("���"), BorderLayout.CENTER);
		cont.add(new JButton("������"), BorderLayout.EAST);
		setSize(300,150);
		//pack(); //������Ʈ�� �°� ������ ����
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new BorderLayoutExam();
	}

}
