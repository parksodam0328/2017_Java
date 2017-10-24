package textbook;

import java.awt.Dialog;
import java.awt.Frame;

import javax.swing.JDialog;
import javax.swing.JFrame;

public class JDialogExam extends JFrame{
	
	public JDialogExam() { 
		super("Dialog");
		JDialog Jd = new JDialog();
		setSize(300,100);
		setVisible(true);
		Jd.setSize(200,50);
		Jd.setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JDialogExam();

	}

}
