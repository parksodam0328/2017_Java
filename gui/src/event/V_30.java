package event;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
	private Panel p1 = new Panel();
	private Panel p2 = new Panel();
	private Panel p3 = new Panel();
	private Panel p4 = new Panel();
	private Panel p5 = new Panel();
	private Panel p6 = new Panel();
	private Label lb_name = new Label("이름");
	private TextField tf_name = new TextField(10);
	private Button bt_search = new Button("검색");

	private Label lb_birth = new Label("생일 : ");
	private Choice ch_month = new Choice();
	private Label lb_month = new Label("월");
	private Choice ch_day = new Choice();
	private Label lb_day = new Label("일");
	private CheckboxGroup gr = new CheckboxGroup();
	private Checkbox cb1 = new Checkbox("양력",gr,true);
	private Checkbox cb2 = new Checkbox("음력",gr,false);
	
	private Label lb_phone = new Label("전화번호 : ");
	private TextField tf_phone = new TextField(20);
	
	private Label lb_group = new Label("그룹 : ");
	private Checkbox cb_g1 = new Checkbox("학 교 ",true);
	private Checkbox cb_g2 = new Checkbox("학 원 ",false);
	private Checkbox cb_g3 = new Checkbox("동 네 ",false);
	private Checkbox cb_g4 = new Checkbox("기 타",false);
	
	private TextArea ta = new TextArea(2,40);
	
	private Button bt_save = new Button("저장");
	private Button bt_delete = new Button("삭제");
	private Button bt_modify = new Button("수정");
		public V_30(){
			super("친구정보");
			p1.add(lb_name);
			p1.add(tf_name);
			p1.add(bt_search);
			for(int i=1;i<=12;i++){
				ch_month.addItem(Integer.toString(i));
			}
			for(int i=1;i<=31;i++){
				ch_day.addItem(Integer.toString(i));
			}
			p2.add(lb_birth);
			p2.add(ch_month);
			p2.add(lb_month);
			p2.add(ch_day);
			p2.add(lb_day);
			p2.add(cb1);
			p2.add(cb2);
			p3.add(lb_phone);
			p3.add(tf_phone);
			p4.add(lb_group);
			p4.add(cb_g1);
			p4.add(cb_g2);
			p4.add(cb_g3);
			p4.add(cb_g4);
			p5.add(bt_save);
			p5.add(bt_delete);
			p5.add(bt_modify);
			p6.setLayout(new GridLayout(4,1));
			p6.setBackground(Color.yellow);
			p6.add(p2);
			p6.add(p3);
			p6.add(p4);
			p6.add(ta);
			add(p1, BorderLayout.NORTH);
			add(p6, BorderLayout.CENTER);
			add(p5, BorderLayout.SOUTH);
			setSize(350,250);
			setVisible(true);
			
			addWindowListener(new MyClass());
			bt_save.addActionListener(this);
			bt_search.addActionListener(this);
			bt_modify.addActionListener(this);
			bt_delete.addActionListener(this);
			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new V_30();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String str_name = tf_name.getText();
		String str_month = (String) ch_month.getSelectedItem();
		String str_day = (String) ch_day.getSelectedItem();
		String str_cb = null;
		
		if(cb1.getState())
			str_cb = cb1.getLabel();
		else
			str_cb = cb2.getLabel();
		String str_phone = tf_phone.getText();
		String str_group="";
		
		if(cb_g1.getState())
			str_group = str_group+cb_g1.getLabel();
		if(cb_g2.getState())
			str_group = str_group+cb_g2.getLabel();
		if(cb_g3.getState())
			str_group = str_group+cb_g3.getLabel();
		if(cb_g4.getState())
			str_group = str_group+cb_g4.getLabel();
		
		
		try{
			Class.forName("org.gjt.mm.mysql.Driver");
		}catch(ClassNotFoundException e1){
			System.err.println("DB 연결 드라이버가 없음.");
		}
		Connection conn = null;
		String url="jdbc:mysql://127.0.0.1:3306/test1?useSSL=false";
		String id="root";
		String pw="mirim546";
		try{
			conn = DriverManager.getConnection(url,id,pw);
		}catch(SQLException e1){
			System.err.println("DB 서버 연결 실패.");
		}
		Statement stmt = null;
		try{
			stmt = conn.createStatement();
		}catch(SQLException e1){
			System.err.println("작업 처리 객체 생성 실패");
		}
		ResultSet rs = null;
		if(e.getSource()==bt_search){
			cb1.setState(false); cb2.setState(false);
			cb_g1.setState(false); cb_g2.setState(false);
			cb_g3.setState(false); cb_g4.setState(false);
		try{
			rs = stmt.executeQuery("select * from t1 where name = '"+str_name+"'");
			if (rs.next()){
				ch_month.select(rs.getString("month"));
				ch_day.select(rs.getString("day"));
				if(rs.getString("group1").equals("1")){
					cb_g1.setState(true);
				}
				if(rs.getString("group2").equals("1")){
					cb_g2.setState(true);
				}
				if(rs.getString("group3").equals("1")){
					cb_g3.setState(true);
				}
				if(rs.getString("group4").equals("1")){
					cb_g4.setState(true);
				}
			}
		}catch(SQLException e1){
			System.err.println("명령어 전송 실패 : "+e1.toString());
		}
		}
		
		else if(e.getSource()==bt_save){
		try{
			Statement stmt1 = null;
			rs = stmt1.executeQuery("select * from t1");
				int num = stmt1.executeUpdate("insert into t1 values('"+str_name+"'"
						+","+str_month
						+","+str_day
						+",'"+str_cb
						+"','"+str_phone
						+"'"
						+","+cb_g1.getState()
						+","+cb_g2.getState()
						+","+cb_g3.getState()
						+","+cb_g4.getState()+")");
				ta.setText("삽입완료!");
				System.out.println(num+"개 삽입 성공");
				ch_month.select(rs.getString("month"));
				ch_day.select(rs.getString("day"));
				if(rs.getString("group1").equals("1")){
					cb_g1.setState(true);
				}
				if(rs.getString("group2").equals("1")){
					cb_g2.setState(true);
				}
				if(rs.getString("group3").equals("1")){
					cb_g3.setState(true);
				}
				if(rs.getString("group4").equals("1")){
					cb_g4.setState(true);
				}
		}catch(SQLException e1){
			System.err.println("명령어 전송 실패 : "+e1.toString());
		}
		}
		else if(e.getSource()==bt_delete){
			try{
				Statement stmt2 = null;
				rs = stmt2.executeQuery("select * from t1");
				if (rs.next()){
					int num = stmt2.executeUpdate("delete from t1 where name = '"+str_name+"'");
					
					ta.setText("삭제완료!");
					System.out.println(num+"개 삭제 성공");
					ch_month.select(rs.getString("month"));
					ch_day.select(rs.getString("day"));
					if(rs.getString("group1").equals("1")){
						cb_g1.setState(true);
					}
					if(rs.getString("group2").equals("1")){
						cb_g2.setState(true);
					}
					if(rs.getString("group3").equals("1")){
						cb_g3.setState(true);
					}
					if(rs.getString("group4").equals("1")){
						cb_g4.setState(true);
					}
				}
			}catch(SQLException e1){
				System.err.println("명령어 전송 실패 : "+e1.toString());
			}
			}
		else if(e.getSource()==bt_modify){
			try{
				Statement stmt3 = null;
				rs = stmt3.executeQuery("select * from t1");
				if (rs.next()){
					int num = stmt3.executeUpdate("update t1 set name = "
							+ "'"+str_name+"'"
						+", month = "+str_month
						+", day = "+str_day
						+", birth_option = '"+str_cb
						+"', phone = '"+str_phone
						+"', group1 = "+cb_g1.getState()
						+", group2 = "+cb_g2.getState()
						+", group3 = "+cb_g3.getState()
						+", group4 = "+cb_g4.getState()
						+ " where name = '"+str_name+"'");
					
					ta.setText("수정완료!");
					System.out.println(num+"개 수정 성공");
					ch_month.select(rs.getString("month"));
					ch_day.select(rs.getString("day"));
					if(rs.getString("group1").equals("1")){
						cb_g1.setState(true);
					}
					if(rs.getString("group2").equals("1")){
						cb_g2.setState(true);
					}
					if(rs.getString("group3").equals("1")){
						cb_g3.setState(true);
					}
					if(rs.getString("group4").equals("1")){
						cb_g4.setState(true);
					}
				}
			}catch(SQLException e1){
				System.err.println("명령어 전송 실패 : "+e1.toString());
			}
			}
		try{
			stmt.close();
			conn.close();
		}catch(SQLException ee){
			System.err.println("접속 종료 실패 : "+ee.toString());
		}
	}

}
