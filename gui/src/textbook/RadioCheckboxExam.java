package textbook;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.Panel;

import javax.swing.JFrame;

public class RadioCheckboxExam extends Frame {
	
	public RadioCheckboxExam(){
		super("라디오버튼형");
		Panel p = new Panel();
		// Checkbox를 그룹으로 묵음, 그룹 내에서는 하나의 항목만 선택가능
		CheckboxGroup g = new CheckboxGroup();
		Checkbox ra1 = new Checkbox("여자",g,true);
		Checkbox ra2 = new Checkbox("남자",g,true);
		Checkbox ra3 = new Checkbox("어린이",g,true);
	
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
