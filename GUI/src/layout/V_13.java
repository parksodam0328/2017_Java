package layout;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class V_13 extends JFrame {
	public V_13(){
			super("친구정보");
			Container cont = getContentPane(); // 각종 스타일(CSS와 같이) -> 속성 값들을 얻어오는 역할
			JPanel p1 = new JPanel();
			JPanel p2 = new JPanel();
			JPanel p3 = new JPanel();
			cont.setLayout(new BorderLayout());
			JLabel name = new JLabel("이름");
			JTextField tf1 = new JTextField(8);
			tf1.selectAll();
			JButton search = new JButton("검색");
			p1.add(name);
			p1.add(tf1);
			p1.add(search);
			cont.add(p1, BorderLayout.NORTH);
			JTextArea ta2 = new JTextArea(8,30);
			
			JScrollPane sp = new JScrollPane(ta2, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
			p2.add(sp);
			cont.add(p2, BorderLayout.CENTER);
			
			JButton save = new JButton("저장");
			JButton delete = new JButton("삭제");
			JButton update = new JButton("수정");
			p3.add(save);
			p3.add(delete);
			p3.add(update);
			cont.add(p3, BorderLayout.SOUTH);
			//setSize(300,300);
			pack(); //컴포넌트에 맞게 사이즈 조절
			setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new V_13();
	}

}
