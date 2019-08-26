package test;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import util.JDBCUtil;

public class Test10_procedure {

	public static void main(String[] args) {
		

		String sql = "{call InsertBook(?,?,?,?) }";
		Connection con = null;
		CallableStatement ps = null; //프로시져호출 statement, prepareStatement는 ?를, statement는 정적인 sql구문을 호출한다.
		
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareCall(sql);
			// ? 세팅
			ps.setInt(1, 1);
			ps.setString(2, "java");
			ps.setString(3, "홍길동");
			ps.setInt(4, 33000);
			
			//실행 및 결과값 핸들링
			ps.execute();
			System.out.println(" call InsertBook 수행 ");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(con, ps, null);
		}
		
		
	}

}
