package textbook;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JButtonExam extends JFrame{

	public JButtonExam() {
		super("��ư");
		JPanel Jp = new JPanel();
		JButton Jb1 = new JButton("��ư1");
		JButton Jb2 = new JButton();
		Jb2.setLabel("��ư2");
		
		Jp.add(Jb1);
		Jp.add(Jb2);
		add(Jp);
		
		setSize(400,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JButtonExam(); 


	}

}
