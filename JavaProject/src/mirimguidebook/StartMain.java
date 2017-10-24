package mirimguidebook;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class StartMain extends JFrame implements ActionListener{
	private JPanel contentPane;
	//private JLabel label;
	private JButton mbutton;
	
	public StartMain() {
		setTitle("�̸����̵��");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1280, 750);
		setLocationRelativeTo(null); //â �߾ӿ� ����
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.setLayout(null);
		getContentPane().add(contentPane);
		
		mbutton = new JButton("");
		Image img = new ImageIcon(this.getClass().getResource("/MainImage.png")).getImage();
		mbutton.setSize(1280,720);
		
		contentPane.add(mbutton);
		mbutton.setIcon(new ImageIcon(img));
		mbutton.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) { //��ư Ŭ���� �޴� ȭ������ �̵�
		mbutton.setVisible(false);
		SelectMenu sm = new SelectMenu();
		sm.setVisible(true);
		setVisible(false);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartMain frame = new StartMain();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

}
