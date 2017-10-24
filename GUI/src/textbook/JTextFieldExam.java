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
		super("텍스트");
		JPanel p = new JPanel();
		JTextField tf1 = new JTextField("주민등록번호앞자리");
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
