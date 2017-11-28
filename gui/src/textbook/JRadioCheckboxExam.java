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
		super("라디오버튼형");
		Panel p = new Panel();
		// Checkbox를 그룹으로 묵음, 그룹 내에서는 하나의 항목만 선택가능
		ButtonGroup g = new ButtonGroup();
		JRadioButton ra1 = new JRadioButton("여자");
		JRadioButton ra2 = new JRadioButton("남자");
		JRadioButton ra3 = new JRadioButton("어린이");
		
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
