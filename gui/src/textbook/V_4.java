package textbook;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.Panel;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class V_4 extends JFrame {
	
	public V_4(){
		super("라디오버튼형");
		Panel p = new Panel();
		// Checkbox를 그룹으로 묵음, 그룹 내에서는 하나의 항목만 선택가능
		ButtonGroup g = new ButtonGroup();
		JRadioButton ra1 = new JRadioButton("A형",true);
		JRadioButton ra2 = new JRadioButton("B형");
		JRadioButton ra3 = new JRadioButton("O형");
		JRadioButton ra4 = new JRadioButton("AB형");
		
		g.add(ra1);
		g.add(ra2);
		g.add(ra3);
		g.add(ra4);
		
		p.add(ra1);
		p.add(ra2);
		p.add(ra3);
		p.add(ra4);
		add(p);
		setSize(400,100);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new V_4();
	}

}

