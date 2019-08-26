package dao;

import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import util.JDBCUtil;
import vo.Department;

public class DeptDao {
	
	//Department 테이블의 모든 레코드정보
	public List<Department> getAllDeptRec() {
		String sql = "select * from dept order by deptno";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		List<Department> list = new ArrayList<Department>();
		try {
			System.out.println("**********con할당*********");
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			// ? 세팅
			
			//실행 및 결과값 핸들링
			rs = ps.executeQuery();
			while (rs.next()) {
				list.add(new Department(rs.getInt("deptno"), //department안에 정보를 list에 추가해야한다.
							   rs.getString("dname"),
							   rs.getString("loc")));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(con, ps, rs);
			System.out.println("**********con반납*********");
		}
		return list;
	
	
	}
	
	
	//Department 테이블의 업데이트
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
	
//	Department 테이블에 정보삽입
	public int insertDept(Department dept) {

		String sql = "insert into dept(deptno,dname,loc) values(?,?,?)";
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			// ? 세팅
			ps.setInt(1, dept.getDeptno());
			ps.setString(2, dept.getDname());
			ps.setString(3, dept.getLoc());
			
			
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
