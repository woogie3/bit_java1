package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import util.JDBCUtil;
/*
		  	문제 개요 : show() 메소드는 매개변수로 부서번호(DEPARTMENT_ID) 정보를 입력 받아서 해당
			부서에 해당하는 사원의 평균 급여정보를 출력하는 메서드이다. 
			특정 부서에 해당하는 직원정보를 출력하는 show () 메소드를 구현하시오. 
 */
/*
 * 
							<<주의사항>>
			1. mian() 메서드는 수정하지 않고 실행해야 하며,             
   		   	   show() 메소드의 시그니쳐도 변경할 수  없습니다.

			2. PreparedStatement를 사용해야 합니다.
   			   PreparedStatement를 사용하지 않은 경우는 실행
   			      결과가 동일하다 하더라도 부분점수로 처리합니다.

			3. 출력 결과가 <<실행결과>>와 다른 경우 오답으로
    		       처리됩니다.

			4. 컴파일 오류나 Exception 발생 시, 모두 오답으로
   			       처리됩니다.
 */
// 문제 조건에 맞게 구현하시오.
//	public class prob {
//    private static void show(int DEPARTMENT_ID) {
    	
//    	Connection con =  null;
//    	PreparedStatement ps = null;
//    	ResultSet rs = null;
//    	
//    	
//		int department_id = DEPARTMENT_ID;
////		String sql = "select department_id, avg(salary) from employees where department_id = ? group by department_id";
//		String sql = "select department_id, round(avg(salary)) from employees where department_id = ? group by department_id";
//		try {
//			
//			con = JDBCUtil.getConnection();
//			ps = con.prepareStatement(sql);
//			ps.setInt(1, department_id);
//			rs=ps.executeQuery();
//			
//			if(rs.next()) {
//				System.out.print("부서번호 : "+rs.getInt("department_id"));
//				System.out.print(" 부서평균 : "+rs.getInt("avg(salary)")+"\n");
//			}else {
//				
//			}
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}finally {
//			JDBCUtil.close(con, ps, rs);
//		}
//	}
//	public static void main(String[] args) {
//		show(10);
//		System.out.println("============================");
//		show(50);
//	}


//******************   강사님  풀이    **********************
public class prob {
	  
	
	public static void main(String[] args) {
		Emp.show(10);
		System.out.println("============================");
		Emp.show(50);
	}	
}
		
class Emp{
	public static void show(int deptno) {
		String sql = "select round(avg(sal)) as \"부서별 평균 급여\"from emp where deptno = ?";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null; 
		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1,  deptno);
			rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println(deptno+" 부서");
				System.out.println(rs.getString("부서별 평균 급여"));
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			JDBCUtil.close(con, ps, rs);
		}
	}
}
    	
    	
    	
    	
    	
    	
    	

