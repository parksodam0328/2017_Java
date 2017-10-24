package layout;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutExam extends JFrame {
	public GridLayoutExam(){
		super("GridLayout");
		Container cont = getContentPane(); // 각종 스타일(CSS와 같이) -> 속성 값들을 얻어오는 역할
		cont.setLayout(new GridLayout(2,3));
		cont.add(new JButton("버튼1"));
		cont.add(new JButton("버튼2"));
		cont.add(new JButton("버튼3"));
		cont.add(new JButton("버튼4"));
		cont.add(new JButton("버튼5"));
		cont.add(new JButton("버튼6"));
		setSize(150,150);
		//pack(); //컴포넌트에 맞게 사이즈 조절
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new GridLayoutExam();
	}

}
