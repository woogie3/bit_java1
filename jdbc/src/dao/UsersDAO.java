package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import util.JDBCUtil;
import vo.UsersVO;

public class UsersDAO {
	public List<UsersVO> getUsersRec(){
		UsersVO vo = new UsersVO();
		String sql = 
						"select id, name, role "+
						"from users";
		List<UsersVO> list = new ArrayList<UsersVO>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			// ? 세팅
			
			//실행 및 결과값 핸들링
			rs = ps.executeQuery();
			while (rs.next()) {
				vo.setId(rs.getString("id"));
				vo.setName(rs.getString("name"));
				vo.setRole(rs.getString("role"));
				
				list.add(vo);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(con, ps, rs);
		}
		
		return null;
		
	}
	
	public int insertUsers(UsersVO vo) {
		String sql = "INSERT INTO Users(id, password, name, role) "+
				 	 "VALUES(?,?,?,?)";
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			// ? 세팅
			ps.setString(1, vo.getId());
			ps.setString(2, vo.getPassword());
			ps.setString(3, vo.getName());
			ps.setString(4, vo.getRole());
			
			//실행 및 결과값 핸들링
			result = ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(con, ps, null);
		}
		
		return result;
	}
	
	
	public int updateUsers(UsersVO vo) {
		String sql = "UPDATE Users SET password = ? WHERE id = ?";
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			// ? 세팅
			ps.setString(1, vo.getId());
			ps.setString(2, vo.getPassword());
			ps.setString(3, vo.getName());
			ps.setString(4, vo.getRole());
			//실행 및 결과값 핸들링
			result = ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			JDBCUtil.close(con, ps, null);
		}
		
		return result;
	}
	
	public int deleteUsers(String id, String password) {
		String sql = "delete from users where id = ? and password = ?";
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			// ? 세팅
			ps.setString(1, id);
			ps.setString(2, password);
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
