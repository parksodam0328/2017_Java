package event;

import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEventExam extends Frame implements KeyListener{
	TextField jumin1=new TextField(10);
	Label lb = new Label("-", Label.CENTER);
	TextField jumin2 = new TextField(10);
	Panel p = new Panel();
	
	public KeyEventExam() {
		super("KeyEvent");
		p.add(jumin1);
		p.add(lb);
		p.add(jumin2);
		add(p);
		setSize(300,100);
		setVisible(true);
		jumin1.addKeyListener(this);
	}
	
	public void keyPressed(KeyEvent ke) {
		if(ke.getKeyCode()==ke.VK_LEFT) {
			jumin2.setText("left 눌림");
		}
		
	}
	
	public void keyReleased(KeyEvent ke) {
		if(jumin1.getText().trim().length()==6) {
			
			jumin2.requestFocus(); //다음칸 커서 옮김
		}
		if(jumin2.getText().trim().length()==6) {
			
			 //그만!
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KeyEventExam();
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}