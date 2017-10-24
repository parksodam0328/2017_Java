package textbook;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Exam_V_2 extends JFrame{

	public Exam_V_2() {
		super("버튼");
		JPanel Jp = new JPanel();
		JButton Jb1 = new JButton("확인");
		JButton Jb2 = new JButton();
		JButton Jb3 = new JButton("삭제");
		Jb2.setLabel("취소");
		
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
