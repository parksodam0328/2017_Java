package textbook;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.Panel;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class JRadioCheckboxExam extends JFrame {
	
	public JRadioCheckboxExam(){
		super("������ư��");
		Panel p = new Panel();
		// Checkbox�� �׷����� ����, �׷� �������� �ϳ��� �׸� ���ð���
		ButtonGroup g = new ButtonGroup();
		JRadioButton ra1 = new JRadioButton("����");
		JRadioButton ra2 = new JRadioButton("����");
		JRadioButton ra3 = new JRadioButton("���");
		
		g.add(ra1);
		g.add(ra2);
		g.add(ra3);
		
		p.add(ra1);
		p.add(ra2);
		p.add(ra3);
		add(p);
		setSize(400,100);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RadioCheckboxExam();
	}

}
