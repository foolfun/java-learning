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
			//������ݵ�sql���
			String sql = "select * from t_user where username = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1,username);
			rs=pstm.executeQuery(); //����pstm����
			System.out.println("���ݲ�ѯ�ɹ���");
			} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
			return rs;
	}
	
}
