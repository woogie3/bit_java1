package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import util.JDBCUtil;
import vo.Department;
import vo.Employee;

public class Test09_DeptDao {

	public static void main(String[] args) {
		
		Emp9 emp = new Emp9();
		Department d = new Department();
		d.setDeptno(50);
		d.setDname("기술부");
		d.setLoc("제주도");
		int count = emp.updateDept(d);
		System.out.println(count+" = >  갱신");
		
	}

}

class Emp9{
	public int updateDept(Department dept){

		String sql = "update dept set dname = ?, loc =? where deptno = ?";
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			// ? 세팅
			ps.setString(1, dept.getDname());
			ps.setString(2, dept.getLoc());
			ps.setInt(3, dept.getDeptno());
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
