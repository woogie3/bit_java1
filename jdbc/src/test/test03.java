package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import util.JDBCUtil;

public class test03 {

	public static void main(String[] args) {
		int deptno = 20;
		if(args.length != 0) {
		 deptno = Integer.parseInt(args[0]); //args[0]은 스트링타입이라 int형으로 변환
		}
		String sql = "select * from emp where deptno = "+ deptno;
		
		
		
		System.out.println("************** JDBC_TEST **************");
		Connection con = null; //연결객체
		Statement st = null; //sql구문 객체
		ResultSet rs = null; //select의 결과값을 받을 객체-resultset은 인터페이스라서 직접 객체생성 불가능 
		int result = 0; //dml의 결과값을 저장하는 객체
		
		
		//기존방식->new oracle.jdbc.OracleDriver();
		  try {
			//1.jdbc driver 설치 : ojdbc6.jar classpath에 추가해야함!!
				
			//2.driver loading 작업

			//3.DB connect
			
			con = JDBCUtil.getConnection();
			
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
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			//7.자원 반납
			JDBCUtil.close(con, st, rs);//Util패키지에 있는 JDBCUtil사용 
			
		}
		  
		
		
		
		
		
		
		
		System.out.println("**************  END  **************");

	}

}
