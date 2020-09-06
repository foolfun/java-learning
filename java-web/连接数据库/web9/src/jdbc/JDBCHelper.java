package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCHelper {
	static String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";
	static String sqlURI="jdbc:sqlserver://127.0.0.1:1433;DatabaseName=user";
	static String username="sa";
	static String pwd="sa";
	static Connection connection;
	public static Connection conn(){
		try{
			Class.forName(driverName).newInstance();//创建驱动
			connection = DriverManager.getConnection(sqlURI, username, pwd);
		}catch(Exception e){
			System.out.println("连接数据库失败："+e.getMessage());
		}
		return connection;
	}

}
