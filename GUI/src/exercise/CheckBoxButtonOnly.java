package exercise;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBoxButtonOnly extends JFrame{
	private JCheckBox bold, italic;
	private JButton ok, cancel;
	public CheckBoxButtonOnly() {
		super("������ ȭ��");
		setSize(200,100);
		Container cont = getContentPane();
		bold = new JCheckBox("���ü");
		cont.add(bold);
		italic = new JCheckBox("���ڸ�ü");
		cont.add(italic);
		ok = new JButton("Ȯ��");
		cont.add(ok);
		cancel = new JButton("���");
		cont.add(cancel);
		cont.setLayout(new FlowLayout());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckBoxButtonOnly fr = new CheckBoxButtonOnly();
		fr.setVisible(true);
	}

}
