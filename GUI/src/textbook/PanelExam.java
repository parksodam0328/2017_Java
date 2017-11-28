package textbook;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class PanelExam extends Frame{

	public PanelExam(){
		Panel p = new Panel();
		p.setBackground(Color.BLUE);
		p.setSize(300,200);
		add(p);
		setSize(500,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PanelExam();
	}

}
