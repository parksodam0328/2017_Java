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
	//�����ؾ� �ϴ� �� : ��ư  - jfram(�ٴ� ���� ū ��)

	public static void main(String[] args) {
		JFrame window = new JFrame("���� ���"); //�����츦 ����
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//�����츦 close�� ��� : system exit (������ ����� x ��ư)
		window.setContentPane(new ViewFileGUI());
		//�Ӽ� �ʱ�ȭ : �Ϲ������� �����ڸ޼���� �Բ� ���
		window.pack(); //�ڵ����� ������ ������ ����, or ���� �ֱ��� �������
		window.setVisible(true); //ȭ�鿡 ���̱�

	}
}

class ViewFileGUI extends JPanel{ //�ȿ��� ���� ���̴� ��(JPanel)
JTextArea ta = new JTextArea(25,80); //���� 25, ���� 80
JFileChooser fc = new JFileChooser();

public ViewFileGUI(){
	JButton openButton = new JButton("����");
	openButton.addActionListener((ActionListener) new OpenAction());
	//��ư�� �̺�Ʈ ������ �ޱ�
	
	this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS)); //this = ViewFileGUI ������ �Լ�
	//�гο� ��ư�� �ؽ�Ʈ������� ��ġ�� ������
	
	this.add(openButton);
	this.add(new JScrollPane(ta));
	
}//end of ViewFileGUI ������ �Լ�
class OpenAction implements ActionListener{ 
	//acrionListener�� actionPerformed�� �ݵ�� �������̵� �ؾ��Ѵ�
	public void actionPerformed(ActionEvent ae){
		int retval = fc.showOpenDialog(ViewFileGUI.this);
		//open file ���â ����
		if(retval == JFileChooser.APPROVE_OPTION){
			//���ÿ���(true, false�� ����)
			File file = fc.getSelectedFile();
			//�ߺ������� ����ϸ鼭 ���ð��� ����
			try{
Scanner scan = new Scanner(file);
String line;
ta.setText("");

while(scan.hasNextLine()){
	line = scan.nextLine();
	ta.append(line); //�ؽ�Ʈ���� �����ֱ�
}

}catch(FileNotFoundException e){
	System.out.println("���� ����");
}
}//end of if
}//end of actionPerformed
}//end of OpenAction
}//end of ViewFileGUI