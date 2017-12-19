package event;

import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class KeyAdapterTest extends JFrame{
	JTextField jumin1=new JTextField(10);
	JLabel lb = new JLabel("-", JLabel.CENTER);
	JTextField jumin2 = new JTextField(10);
	JPanel p = new JPanel();
	public KeyAdapterTest() {
		super("KeyAdapterTest");
		p.add(jumin1);
		p.add(lb);
		p.add(jumin2);
		add(p);
		setSize(300,100);
		setVisible(true);
		jumin1.addKeyListener(new KeyAdapterExam(jumin1,jumin2));
		jumin2.addKeyListener(new KeyAdapterExam(jumin2));
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KeyAdapterTest();
	}
}


class KeyAdapterExam extends KeyAdapter{
//	JTextField jumin1;
//	JTextField jumin2;
//	public KeyAdapterExam(JTextField jumin1, JTextField jumin2){
//		this.jumin1 = new JTextField(jumin1.getText());
//		System.out.println(jumin1.getText());
//		this.jumin2 = new JTextField(jumin2.getText());
//	}
//	public KeyAdapterExam(JTextField jumin2){
//		System.out.println(jumin2.getText());
//		jumin2 = new JTextField(jumin2.getText());
//	}
	public void keyReleased(KeyEvent ke) {
		if(ke.getSource()==jumin1 && jumin1.getText().trim().length()==6) {
			jumin2.requestFocus(); //´ÙÀ½Ä­ Ä¿¼­ ¿Å±è
		}
	}
	public void keyPressed(KeyEvent ke) {
		if(ke.getKeyCode()==ke.VK_LEFT) {
			jumin2.setText("left ´­¸²");
		}
		
	}
}