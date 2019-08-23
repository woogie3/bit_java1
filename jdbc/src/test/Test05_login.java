package test;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import util.JDBCUtil;

public class Test05_login {

	public static void main(String[] args) {
		System.out.println("  로그인 처리   ");
		
		Connection con =  null;
		Statement st = null; //?처리x
		PreparedStatement ps = null; //?을  처리할수 있는 객체 
		ResultSet rs = null;
		
		String id = "java01";
		String pw = "1234";
//		
//		String sql = "select * from users where id='"+id+"' and password ='"+pw+"'";
		//위의 코드는 매우 보안에 취약하다.
		String sql = "select * from users where id= ? and password = ?";
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, pw);
			
//			rs = ps.executeQuery(sql);//27행에서 sql을 받아서 썼기 때문에 에러발생
			rs = ps.executeQuery();
			
			if(rs.next()) {
				System.out.println(rs.getString("id")+"님 로그인 되었습니다. ");
				System.out.printf("%s / %s",rs.getString("id"),rs.getString("name"));
			}else {
				System.out.println(" ※ login failed ※ ");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			JDBCUtil.close(con, st, rs);
		}
		
		
	}

}
