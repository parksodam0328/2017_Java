package event;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class V_30 extends JFrame implements ActionListener{
	private JLabel name = new JLabel("�̸�");
	private JTextField namefield = new JTextField(15);
	private JButton search = new JButton("�˻�");
	private JPanel p1 = new JPanel();
	private JPanel p2 = new JPanel();
	private JPanel p3 = new JPanel();
	private JLabel birthday = new JLabel("���� : ");
	private String []months = {"1","2","3","4","5","6","7","8","9","10","11","12"};
	private JComboBox monthscb = new JComboBox(months);
	private JLabel months_text = new JLabel("��");
	
	private String []days = {"1","2","3","4","5","6","7","8","9","10","11","12","14"
			,"15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
	private JComboBox dayscb = new JComboBox(days);
	private JLabel days_text = new JLabel("��");
	
	private ButtonGroup g = new ButtonGroup();
	private JRadioButton lift = new JRadioButton("���");
	private JRadioButton lunar = new JRadioButton("����");
	
	private JLabel tel = new JLabel("��ȭ��ȣ : ");
	private JTextField telfield = new JTextField(20);
	
	private JLabel group = new JLabel("�׷� : ");
	private JCheckBox school = new JCheckBox("�б�");
	private JCheckBox academy = new JCheckBox("�п�");
	private JCheckBox town = new JCheckBox("����");
	private JCheckBox ect = new JCheckBox("��Ÿ");
	
	private JTextArea result = new JTextArea(2,20);
	
	private JButton save = new JButton("����");
	private JButton delete = new JButton("����");
	private JButton update = new JButton("����");
	JScrollPane sp = new JScrollPane(result, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		public V_30(){
			super("ģ������");
			setLayout(new BorderLayout());
			add(p1, BorderLayout.NORTH);
			p1.add(name);
			p1.add(namefield);
			p1.add(search);
			add(p2, BorderLayout.CENTER);
			p2.add(birthday);
			p2.add(monthscb);
			p2.add(months_text);
			p2.add(dayscb);
			p2.add(days_text);
			g.add(lift);
			g.add(lunar);
			p2.add(lift);
			p2.add(lunar);
			p2.add(tel);
			p2.add(telfield);
			p2.add(group);
			p2.add(school);
			p2.add(academy);
			p2.add(town);
			p2.add(ect);
			p2.add(sp);
			add(p3, BorderLayout.SOUTH);
			p3.add(save);
			p3.add(delete);
			p3.add(update);
			pack();
			setVisible(true);
			save.addActionListener(this);
			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new V_30();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String str = "/"+name.getText()+":/"+namefield.getText()+"/"+birthday.getText()+"/"
		+monthscb.getSelectedItem().toString()+months_text.getText()+
		dayscb.getSelectedItem().toString()+days_text.getText()+g.getSelection().toString();
		result.setText(str);
	}

}
