package exercise;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DivideByThree extends JFrame{
	private JLabel prompt;
	private JTextField number;
	private JButton check;
	public DivideByThree() {
		super("������ ȭ��");
		setSize(200,100);
		Container cont = getContentPane();
		prompt = new JLabel("���� ���� �Է��ϼ���.");
		cont.add(prompt);
		number = new JTextField(7);
		cont.add(number);
		check = new JButton("�˻�");
		cont.add(check);
		cont.setLayout(new FlowLayout());
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DivideByThree();
	}

}
