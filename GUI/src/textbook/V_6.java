package textbook;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;

public class V_6 extends Frame{
	public V_6() {
		super("달력 프로그램");
		Panel p = new Panel();
		Choice ch_month = new Choice();
		Choice ch_day = new Choice();
		for(int a=1;a<=12;a++){
			ch_month.addItem(Integer.toString(a));
		}
		for(int a=1;a<=31;a++){
			ch_day.addItem(Integer.toString(a));
		}
		
		Label label1 = new Label("월");
		
		Label label2 = new Label("일");
		p.add(ch_month);
		p.add(label1);
		p.add(ch_day);
		p.add(label2);
		add(p);
		setSize(300,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new V_6();
	}

}
