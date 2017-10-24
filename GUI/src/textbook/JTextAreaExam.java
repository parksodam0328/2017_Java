package textbook;

import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JTextAreaExam extends JFrame{
	public JTextAreaExam(){
		super("TextArea");
		Panel p = new Panel();
		JTextArea ta1 = new JTextArea("first",3,30);//스크롤바 없는 것이 디폴트
		JTextArea ta2 = new JTextArea("second",6,10);
		JScrollPane sp = new JScrollPane(ta2, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		p.add(ta1);
		p.add(sp);
		add(p);
		setSize(500,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JTextAreaExam();
	}

}
