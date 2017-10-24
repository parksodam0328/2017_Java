package textbook;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JLabelExam extends JFrame{
	public JLabelExam(){
		super("Label");
		JPanel p = new JPanel();
		JLabel label1 = new JLabel("레이블1");
		JLabel label2 = new JLabel("레이블2",JLabel.CENTER);
		
		label1.setForeground(Color.yellow);
		label2.setOpaque(true); //jlabel에서는  setbackground에서는 지원하지 않음
		label2.setBackground(Color.blue);
		p.add(label1);
		p.add(label2);
		add(p);
		setSize(300,100);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JLabelExam();
	}

}
