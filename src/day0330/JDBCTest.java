package day0330;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCTest {
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String user = "scott";
	String pwd = "tiger";
	
	//�������ݿ�
	public Connection getConnection() throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(url,user,pwd);
		return conn;
	}
	
	// ��ѯ����
	public ResultSet select(Connection conn, String sql) throws Exception{
		ResultSet rs = null;  //ִ�в�ѯ��Ľ��
		if(conn != null && !conn.isClosed()){
			Statement stm = conn.createStatement();
			rs = stm.executeQuery(sql);
		}
		return rs;
	}
	
	
	//��������
	public int update(Connection conn, String sql) throws Exception{
		int count = 0;
		if(conn != null && !conn.isClosed()){
			Statement stm = conn.createStatement();
			count = stm.executeUpdate(sql);
		}
		return count;
	}
	
	// �ر����ݿ�
	public void close(Connection conn, String sql) throws Exception{
		if(conn != null && !conn.isClosed()){
			conn.close();
			conn = null;
		}
	}
}
