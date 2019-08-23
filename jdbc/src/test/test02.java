package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class test02 {

	public static void main(String[] args) {
//		executeQuery("select~"); //select구문사용시
								 //결곽값 테이블을 자바에서는 resultSet이라고 부름, 결과값이 rs에 들어가서 rs가 참조, 결국 결과값을 가리키는 구조!
								 //select에는 커서가 있는데 select name의 메타정보(컬럼명)를 가름킴, 정보를 .getMetaData로 출력!
								 //rs.next를 실행하면 커서가 밑으로 내려가면 행이있고, 없다면 정보가 없는것
								 //
//		 executeUpdate("DML");//DML구문 사용시, 결과값이 int타입이므로 0은 삭제,수정이 안됨
//		*stateless protocol : 이전 상태를 기억 못함   (HTTP 등)
//       				    . 상태없는 서버 모델 : 서버가 클라이언트 내 어플리케이션 상태를 관리하지 않는 모델
//      				   .. 例) 웹(World Wide Web) 
//       				   .. (단, 쿠키 기능에 의해 서버측에서 클라이언트 상태를 관리 가능)
//							-> 즉, 창을 띄우면 창만 띄어주고 연결을 자동으로 바로 끊어버림 상태유지기술을 통해 마치 계속 커넥팅 된거 같이구현되는데,
//							   반대로 DB는 그런 기술이 없기에 할일 을 다하면 빨리 끊어줘야함
//							   끝단에서 직접 DB와 연동하게되면 보안에 안좋고 유지보수도 힘들다
//							  그래서 끝단에서 DB사이에 DB를 관리하는 드라이버를 두고 통신해야한다. 그게 소켓이된다.
//							 eejb -> 코바 -> spring 즉 모두 분산환경 시스템 구축을 위해 만들어짐
		
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "SCOTT";//madang, hr 가능
		String pw = "TIGER";//madang, hr 가능||위 4가지는 db연동시 꼭 필요!!!!
		
//		String sql = "select * from dept";
//		String sql = "select * from emp";
		String sql =
				//*상사보다 급여가 많은 사원목록
				"select e.ename as \"사원명\", e.sal as \"e급여\", m.ename as \"상사명\", m.sal as \"m급여\" "+ //오라클에서 ''만 사용해 문자를 인식함 
				"from emp e "+
					"join emp m "+ 
					"on e.mgr=m.empno "+ 
				"where e.sal > m.sal"; //sql구문을 직접 따오는것은 성능에 안좋고 가독성도떨어짐
		
		
		
		
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
//				System.out.print(rs.getInt("empno")+"\t");
//				System.out.print(rs.getString("ename")+"\t");
//				System.out.print(rs.getString("job")+"\t");
//				System.out.print(rs.getString("mgr")+"\t");
//				System.out.print(rs.getDate("hiredate")+"\t");
//				System.out.print(rs.getString("sal")+"\t");
//				System.out.print(rs.getString("comm")+"\t");
//				System.out.print(rs.getInt("deptno")+"\n");
				System.out.print(rs.getString("사원명")+"\t");
				System.out.print(rs.getString("e급여명")+"\t");
				System.out.print(rs.getString("상사명")+"\t");
				System.out.print(rs.getString("m급영명")+"\n");
				
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
