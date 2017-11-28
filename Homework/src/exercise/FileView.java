package exercise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class FileView {
	//의존해야 하는 것 : 버튼  - jfram(붙는 제일 큰 판)

	public static void main(String[] args) {
		JFrame window = new JFrame("파일 뷰어"); //윈도우를 생성
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//윈도우를 close할 경우 : system exit (윈도의 상단의 x 버튼)
		window.setContentPane(new ViewFileGUI());
		//속성 초기화 : 일반적으로 생성자메서드와 함께 사용
		window.pack(); //자동으로 윈도우 사이즈 셋팅, or 가장 최근의 사이즈로
		window.setVisible(true); //화면에 보이기

	}
}

class ViewFileGUI extends JPanel{ //안에의 판을 붙이는 것(JPanel)
JTextArea ta = new JTextArea(25,80); //가로 25, 세로 80
JFileChooser fc = new JFileChooser();

public ViewFileGUI(){
	JButton openButton = new JButton("열기");
	openButton.addActionListener((ActionListener) new OpenAction());
	//버튼에 이벤트 리스너 달기
	
	this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS)); //this = ViewFileGUI 생성자 함수
	//패널에 버튼과 텍스트에어리어의 배치와 모양잡기
	
	this.add(openButton);
	this.add(new JScrollPane(ta));
	
}//end of ViewFileGUI 생성자 함수
class OpenAction implements ActionListener{ 
	//acrionListener은 actionPerformed를 반드시 오버라이딩 해야한다
	public void actionPerformed(ActionEvent ae){
		int retval = fc.showOpenDialog(ViewFileGUI.this);
		//open file 명령창 열기
		if(retval == JFileChooser.APPROVE_OPTION){
			//선택여부(true, false값 리턴)
			File file = fc.getSelectedFile();
			//중복선택을 허용하면서 선택값을 리턴
			try{
Scanner scan = new Scanner(file);
String line;
ta.setText("");

while(scan.hasNextLine()){
	line = scan.nextLine();
	ta.append(line); //텍스트에어리어에 보여주기
}

}catch(FileNotFoundException e){
	System.out.println("파일 없음");
}
}//end of if
}//end of actionPerformed
}//end of OpenAction
}//end of ViewFileGUI