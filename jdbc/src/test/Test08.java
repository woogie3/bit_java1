package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import util.JDBCUtil;

public class Test08 {

	public static void main(String[] args) {
		
		Emp8 emp = new Emp8();
		int count = emp.deleteEmp(9999);
		System.out.println(count==1?"9999:삭제":"삭제데이터없음");//삼항식
		
		
		
	}

}
class Emp8{
	public int deleteEmp(int empno) {
		String sql = "delete from emp where empno = ? ";
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			// ? 세팅
			ps.setInt(1, empno);
			//실행 및 결과값 핸들링
			result = ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(con, ps, null);
		}
		return result;
		
	}
}
