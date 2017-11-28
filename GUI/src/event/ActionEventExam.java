package event;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEventExam extends Frame implements ActionListener { // 1단계, 2단계 이벤트 발생 객체(버튼)와 관련 이벤트 클래스의 종류 선택
	
	Button b1 = new Button("버튼"); // b1과 p 컴포넌트를 모든 메소드에 공유하기 위해서 위에 선언함
	Panel p = new Panel();
	public ActionEventExam(){
		super("ActionEvent");
		p.add(b1);
		add(p);
		setSize(300,150);
		setVisible(true);
		b1.addActionListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ActionEventExam(); // 이벤트 발생 객체(b1)에 이벤트 핸들러를 연결한다.
	}

	@Override
	public void actionPerformed(ActionEvent ae) { //4단계 actionPerformed 메소드에 이벤트 기능을 구현한다.
		// TODO Auto-generated method stub
		if(ae.getSource()==b1) //b1이 눌리면 창을 닫기
			System.exit(0); 
	}

}
