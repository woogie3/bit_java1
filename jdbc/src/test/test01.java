package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class test01 {

	public static void main(String[] args) {
		
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "SCOTT";//madang, hr 가능
		String pw = "TIGER";//madang, hr 가능||위 4가지는 db연동시 꼭 필요!!!!
		
//		String sql = "select * from dept";
		String sql = "select * from emp";
		
		
		
		
		System.out.println("************** JDBC_TEST **************");
		Connection con = null; //연결객체
		Statement st = null; //sql구문 객체
		ResultSet rs = null; //select의 결과값을 받을 객체-resultset은 인터페이스라서 직접 객체생성 불가능 
		int result = 0; //dml의 결과값을 저장하는 객체
		
		
		//기존방식->new oracle.jdbc.OracleDriver();
		  try {
			//1.jdbc driver 설치 : ojdbc6.jar classpath에 추가해야함!!
				
			//2.driver loading 작업
			Class.forName(driver);	//드라이버가 런타임에 결정됨

			//3.DB connect
			con = DriverManager.getConnection(url, user, pw);
			System.out.println(con);
			
			//4.SQL 구문 관리 객체(statement)생성
			st = con.createStatement();
			
			//5.SQL 실행
			rs = st.executeQuery(sql);
//			System.out.println(rs.getMetaData().getColumnCount()); //테이블 컬럼갯수 출력
			
			//6.결과 값 핸들링
			while (rs.next()) {
//				System.out.print(rs.getString("deptno")+"\t");//해당 테이블 컬럼 데이터 출력
//				System.out.print(rs.getString("dname")+"\t");//해당 테이블 컬럼 데이터 출력
//				System.out.print(rs.getString("loc")+"\n");//해당 테이블 컬럼 데이터 출력
				System.out.print(rs.getInt("empno")+"\t");
				System.out.print(rs.getString("ename")+"\t");
				System.out.print(rs.getString("job")+"\t");
				System.out.print(rs.getString("mgr")+"\t");
				System.out.print(rs.getDate("hiredate")+"\t");
				System.out.print(rs.getString("sal")+"\t");
				System.out.print(rs.getString("comm")+"\t");
				System.out.print(rs.getInt("deptno")+"\n");
				
				
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC확인 필요");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			//7.자원 반납
			try {
				if(rs != null) rs.close();
				if(st != null) st.close();
				if(con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		  
		
		
		
		
		
		
		
		System.out.println("**************  END  **************");

	}

}
