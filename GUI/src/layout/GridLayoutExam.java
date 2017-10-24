package layout;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutExam extends JFrame {
	public GridLayoutExam(){
		super("GridLayout");
		Container cont = getContentPane(); // ���� ��Ÿ��(CSS�� ����) -> �Ӽ� ������ ������ ����
		cont.setLayout(new GridLayout(2,3));
		cont.add(new JButton("��ư1"));
		cont.add(new JButton("��ư2"));
		cont.add(new JButton("��ư3"));
		cont.add(new JButton("��ư4"));
		cont.add(new JButton("��ư5"));
		cont.add(new JButton("��ư6"));
		setSize(150,150);
		//pack(); //������Ʈ�� �°� ������ ����
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new GridLayoutExam();
	}

}
