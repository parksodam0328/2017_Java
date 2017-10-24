package textbook;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

import javax.swing.JFrame;

public class JPanelExam extends JFrame{

	public JPanelExam(){
		Panel Jp = new Panel();
		Jp.setBackground(Color.BLUE);
		Jp.setSize(300,200);
		add(Jp);
		setSize(500,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JPanelExam();
	}

}
