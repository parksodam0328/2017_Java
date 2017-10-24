package mirimguidebook;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class SelectMenu extends JFrame implements ActionListener{
	private JLabel label;
	private JPanel jp;
	private JButton[]  menubtn = new JButton[8];
	private String[] btnimg = {"/button_subject.png","/button_subject.png","/button_club.png", "/button_location.png","/button_entrance.png",
		"/button_experience.png","/button_ employment.png","/button_ event.png"
	};
	ImageIcon btnicon[] = new ImageIcon[8];
	
	public SelectMenu() {
		//mbutton.setVisible(false);
		System.out.println("dhkTdma");
		setTitle("�̸����̵��");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1280, 750);
		setLocationRelativeTo(null); //â �߾ӿ� ����
		jp = new JPanel();
		jp.setBorder(new EmptyBorder(0, 0, 0, 0));
		jp.setLayout(null);
		getContentPane().add(jp);
		
		label = new JLabel("");
		for(int i=0;i<8;i++) {
			btnicon[i] =  new ImageIcon();
			menubtn[i] = new JButton(btnicon[i]);
			
		}
		
		
		// ũ�� ����
		label.setSize(1280,720);
		menubtn[0].setBounds(50,85,214,93);
		menubtn[1].setBounds(50,235,214,93);
		menubtn[2].setBounds(50,385,214,93);
		menubtn[3].setBounds(50,535,214,93);
		menubtn[4].setBounds(1000,85,214,93);
		menubtn[5].setBounds(1000,235,214,93);
		menubtn[6].setBounds(1000,385,214,93);
		menubtn[7].setBounds(1000,535,214,93);
		
		//�̹���
		Image lbimg = new ImageIcon(this.getClass().getResource("/MenuSelect.png")).getImage();
		
		for(int i=0;i<8;i++) jp.add(menubtn[i]);
		jp.add(label);
		
		//�̹��� �ֱ�, ��ư ����
		label.setIcon(new ImageIcon(lbimg));
		
		for(int i=0;i<8;i++) {
		menubtn[i].setIcon(new ImageIcon(btnimg[i]));
		menubtn[i].setBorderPainted(false);
		menubtn[i].setContentAreaFilled(false);
		menubtn[i].setFocusPainted(false);
		}
		
	}

	public void actionPerformed(ActionEvent e) { // ��ư Ŭ���� ������� �̵�
		menubtn[0].setVisible(false);
		MirimEmployment me = new MirimEmployment();
		me.setVisible(true);
		setVisible(false);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelectMenu frame = new SelectMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
