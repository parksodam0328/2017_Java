package layout;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class V_13 extends JFrame {
	public V_13(){
			super("ģ������");
			Container cont = getContentPane(); // ���� ��Ÿ��(CSS�� ����) -> �Ӽ� ������ ������ ����
			JPanel p1 = new JPanel();
			JPanel p2 = new JPanel();
			JPanel p3 = new JPanel();
			cont.setLayout(new BorderLayout());
			JLabel name = new JLabel("�̸�");
			JTextField tf1 = new JTextField(8);
			tf1.selectAll();
			JButton search = new JButton("�˻�");
			p1.add(name);
			p1.add(tf1);
			p1.add(search);
			cont.add(p1, BorderLayout.NORTH);
			JTextArea ta2 = new JTextArea(8,30);
			
			JScrollPane sp = new JScrollPane(ta2, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
			p2.add(sp);
			cont.add(p2, BorderLayout.CENTER);
			
			JButton save = new JButton("����");
			JButton delete = new JButton("����");
			JButton update = new JButton("����");
			p3.add(save);
			p3.add(delete);
			p3.add(update);
			cont.add(p3, BorderLayout.SOUTH);
			//setSize(300,300);
			pack(); //������Ʈ�� �°� ������ ����
			setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new V_13();
	}

}
