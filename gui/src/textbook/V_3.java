package textbook;

import java.awt.Panel;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class V_3 extends JFrame {
	
	public V_3(){
		super("üũ�ڽ���");
		Panel p = new Panel();
		JCheckBox ck1 = new JCheckBox("��");
		JCheckBox ck2 = new JCheckBox("����");
		JCheckBox ck3 = new JCheckBox("����");
		JCheckBox ck4 = new JCheckBox("�ܿ�",true);
		p.add(ck1);
		p.add(ck2);
		p.add(ck3);
		p.add(ck4);
		add(p);
		setSize(400,100);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new V_3();
	}

}
