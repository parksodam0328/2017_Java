package textbook;

import java.awt.Dialog;
import java.awt.Frame;

public class DialogExam extends Frame{
	
	public DialogExam() { 
		super("Dialog");
		Dialog d = new Dialog(this, "다이얼로그", false);
		setSize(300,100);
		setVisible(true);
		d.setSize(200,50);
		d.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DialogExam();

	}

}
