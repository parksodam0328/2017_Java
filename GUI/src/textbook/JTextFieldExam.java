package textbook;

import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class JTextFieldExam extends JFrame {
	JTextFieldExam(){
		super("�ؽ�Ʈ");
		JPanel p = new JPanel();
		JTextField tf1 = new JTextField("�ֹε�Ϲ�ȣ���ڸ�");
		JPasswordField tf2 = new JPasswordField(15);
		tf1.selectAll();
		tf2.setEchoChar('*');
		p.add(tf1);
		p.add(tf2);
		add(p);
		setSize(400,100);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JTextFieldExam();
	}

}
