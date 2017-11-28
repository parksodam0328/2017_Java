package test;

import java.awt.Color;
import java.awt.List;
import java.awt.TextField;
import java.util.Vector;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;

public class Test1 extends JFrame{
	public Test1(){
		super("suhang");
		JPanel p = new JPanel();
		JLabel label1 = new JLabel("아이디",JLabel.CENTER);
		JLabel label2 = new JLabel("패스워드",JLabel.CENTER);
		JLabel label3 = new JLabel("1. 당신의 관심분야는?(여러개 선택가능)");
		JLabel label4 = new JLabel("2. 얼마나 자주극장에 가십니까?");
		JLabel label5 = new JLabel("3. 좋아하는 계절은?");
		JLabel label6 = new JLabel("4. 하고싶은 말을 남기세요");
		JTextArea ta1 = new JTextArea("입력 : ",6,10);//스크롤바 없는 것이 디폴트
		String sea[] = {"봄","여름","가을","겨울"};
		JList list1= new JList(sea);
		JScrollPane sp = new JScrollPane();
	
		TextField tf1 = new TextField(15);
		JPasswordField tf2 = new JPasswordField(15);
		
		JCheckBox fav1 = new JCheckBox("news");
		JCheckBox fav2 = new JCheckBox("sports");
		JCheckBox fav3 = new JCheckBox("movies");
		JCheckBox fav4 = new JCheckBox("music");
		
		ButtonGroup check = new ButtonGroup();
		JRadioButton mon = new JRadioButton("한달에 한번");
		JRadioButton week = new JRadioButton("일주일에 한번");
		JRadioButton no = new JRadioButton("거의 없다",true);
		
		tf1.selectAll();
		tf2.setEchoChar('*');
		
		p.add(label1);
		p.add(label2);
		
		p.add(tf1);
		p.add(tf2);
		
		label1.setOpaque(true); //jlabel에서는  setbackground에서는 지원하지 않음
		label1.setBackground(Color.blue);
		label2.setOpaque(true); //jlabel에서는  setbackground에서는 지원하지 않음
		label2.setBackground(Color.blue);
		
		p.add(label3);
		
		p.add(fav1);
		p.add(fav2);
		p.add(fav3);
		p.add(fav4);
		
		p.add(label4);
		
		check.add(mon);
		check.add(week);
		check.add(no);
		p.add(mon);
		p.add(week);
		p.add(no);
		
		p.add(label5);
		
		p.add(list1);
		sp.setViewportView(list1);
		sp.createVerticalScrollBar();
		p.add(sp);
		
		p.add(label6);
		p.add(ta1);
		add(p);
		setSize(500,500);
		setVisible(true);
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			new Test1();
		}

}
