package textbook;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.Panel;

import javax.swing.JFrame;

public class RadioCheckboxExam extends Frame {
	
	public RadioCheckboxExam(){
		super("������ư��");
		Panel p = new Panel();
		// Checkbox�� �׷����� ����, �׷� �������� �ϳ��� �׸� ���ð���
		CheckboxGroup g = new CheckboxGroup();
		Checkbox ra1 = new Checkbox("����",g,true);
		Checkbox ra2 = new Checkbox("����",g,true);
		Checkbox ra3 = new Checkbox("���",g,true);
	
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
