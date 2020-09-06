package hbfu.jsp.crud.user;


import java.sql.PreparedStatement;
import jdbc.JDBCHelper;

import hbfu.jsp.bean.UserBean;

public class AddUser {

	public void addUser(UserBean user){
		java.sql.Connection conn = null;
		conn = JDBCHelper.conn();
		PreparedStatement pstm = null;
		
		try {			
			conn = JDBCHelper.conn();
			//添加数据的sql语句
			String sql = "insert into t_user (username,gender,age,birth,pwd) values(?,?,?,?,?)";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1,user.getUsername());
			pstm.setString(2,user.getGender());
			pstm.setString(3,user.getAge());
			pstm.setString(4,user.getBirth());
			pstm.setString(5,user.getPwd());
			
			pstm.executeUpdate(); //提交pstm对象
				
			} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
