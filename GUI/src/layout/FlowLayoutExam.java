package layout;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutExam extends JFrame {
	public FlowLayoutExam(){
		super("FlowLayout");
		Container cont = getContentPane(); // 각종 스타일(CSS와 같이) -> 속성 값들을 얻어오는 역할
		cont.setLayout(new FlowLayout());
		cont.add(new JButton("버튼1"));
		cont.add(new JButton("버튼2"));
		cont.add(new JButton("버튼3"));
		//setSize(300,200);
		pack(); //컴포넌트에 맞게 사이즈 조절
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new FlowLayoutExam();
	}

}
