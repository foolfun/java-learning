package hbfu.jsp.crud.user;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import jdbc.JDBCHelper;
public class QueryUser {

	public static ResultSet queryUserbyName(String username){
		java.sql.Connection conn = null;
		conn = JDBCHelper.conn();
		PreparedStatement pstm = null;
		ResultSet rs = null;
		
		try {			
			conn = JDBCHelper.conn();
			//添加数据的sql语句
			String sql = "select * from t_user where username = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1,username);
			rs=pstm.executeQuery(); //查找pstm对象
			System.out.println("数据查询成功！");
			} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
			return rs;
	}
	
}
