package textbook;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;

public class ButtonExam extends Frame{

	public ButtonExam() {
		super("��ư");
		Panel p = new Panel();
		Button b1 = new Button("��ư1");
		Button b2 = new Button();
		b2.setLabel("��ư2");
		
		p.add(b1);
		p.add(b2);
		add(p);
		
		setSize(400,500);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ButtonExam(); 


	}

}
