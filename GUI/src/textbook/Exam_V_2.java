package textbook;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Exam_V_2 extends JFrame{

	public Exam_V_2() {
		super("��ư");
		JPanel Jp = new JPanel();
		JButton Jb1 = new JButton("Ȯ��");
		JButton Jb2 = new JButton();
		JButton Jb3 = new JButton("����");
		Jb2.setLabel("���");
		
		Jp.add(Jb1);
		Jp.add(Jb2);
		Jp.add(Jb3);
		add(Jp);
		
		setSize(400,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Exam_V_2(); 


	}

}
