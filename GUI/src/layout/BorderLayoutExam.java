package layout;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutExam extends JFrame {
	public BorderLayoutExam(){
		super("BorderLayout");
		Container cont = getContentPane(); // 각종 스타일(CSS와 같이) -> 속성 값들을 얻어오는 역할
		cont.setLayout(new BorderLayout());
		cont.add(new JButton("위"), BorderLayout.NORTH);
		cont.add(new JButton("아래"), BorderLayout.SOUTH);
		cont.add(new JButton("왼쪽"), BorderLayout.WEST);
		cont.add(new JButton("가운데"), BorderLayout.CENTER);
		cont.add(new JButton("오른쪽"), BorderLayout.EAST);
		setSize(300,150);
		//pack(); //컴포넌트에 맞게 사이즈 조절
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new BorderLayoutExam();
	}

}
