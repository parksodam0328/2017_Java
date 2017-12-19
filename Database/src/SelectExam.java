import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class SelectExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Class.forName("org.gjt.mm.mysql.Driver");
		}catch(ClassNotFoundException e){
			System.err.println("DB ���� ����̹��� ����.");
		}
		Connection conn = null;
		String url="jdbc:mysql://127.0.0.1:3306/test1?useSSL=false";
		String id="root";
		String pw="mirim546";
		try{
			conn = DriverManager.getConnection(url,id,pw);
		}catch(SQLException e){
			System.err.println("DB ���� ���� ����.");
		}
		Statement stmt = null;
		try{
			stmt = conn.createStatement();
		}catch(SQLException e){
			System.err.println("�۾� ó�� ��ü ���� ����");
		}
		ResultSet rs = null;
		try{
			rs = stmt.executeQuery("select * from t1");
			while (rs.next()){
				System.out.println(rs.getString("name"));
			}
		}catch(SQLException e){
			System.err.println("��ɾ� ���� ���� : "+e.toString());
		}
		try{
			rs.close();
			stmt.close();
			conn.close();
		}catch(SQLException ee){
			System.err.println("���� ���� ���� : "+ee.toString());
		}
	}

}
