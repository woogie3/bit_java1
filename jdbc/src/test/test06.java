package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import util.JDBCUtil;

public class test06 {

	public static void main(String[] args) {
		Emp6.searchEname("s");
		System.out.println("--------------------------------");
		Emp6.searchEname("S");
		
		
	}

}
class Emp6{
	public static void searchEname(String ename) { //이곳에서 dB연동
//		String sql = "select * from emp where lower(ename) like ?";//%name%을 대소문자처리
		String sql = "select * from emp where lower(ename) like lower('%'||?||'%')";//%name%을 대소문자처리
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int result = 0;
		
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			// ? 세팅
//			ps.setString(1, "%"+ename.toLowerCase()+"%");
			ps.setString(1, ename);
			
			//실행 및 결과값 핸들링
			rs = ps.executeQuery();
//			ps.executeUpdate(); --dml구문에서만
			while (rs.next()) {
				System.out.print(rs.getInt("empno")+"  ");
				System.out.print(rs.getString("ename")+"  ");
				System.out.print(rs.getString("job")+"  ");
				System.out.print(rs.getInt("sal")+"  ");
				System.out.print(rs.getInt("comm")+"  ");
				System.out.print(rs.getDate("hiredate")+"  ");
				System.out.print(rs.getInt("deptno")+"  ");
				System.out.println();
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(con, ps, rs);
		}
		
		
	}
}
