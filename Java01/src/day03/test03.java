package day03;
import java.util.*;
public class test03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("점수를 입력하세요: "  );
		int jumsu = input.nextInt();
		
		System.out.println("점수 : "+jumsu);
		if(jumsu >= 80) {
			System.out.println("Pass");
				
		}
		else{
			System.out.println("Fail");
		}
	
		//String result = jumsu >= 80 ? "pass" : "no pass";
		//삼항 연산식으로
		//즉 성능상으로 간단한 분기문은 삼항식을 사용하는것이 나음
		
		//System.out.println("점수:" + jumsu + " : " + result);
		jumsu = Integer.parseInt(input.nextLine());
				
		if(!(jumsu >= 0 && jumsu <=100 )) {
			System.out.println("유효하지않은 점수입니다.");
			return; //메소드수행 종료, 즉 호출한 원위치로 돌아가는것
		}else {
			String result = jumsu >= 80 ? "pass" : "no pass";
			System.out.println(jumsu >= 80 ? "pass" : "no pass");
			//이곳에는 리턴함수가 없음
		}
		//유효성 검증시
		String result = jumsu >= 80 ? "pass" : "no pass";
	
		//input.nextLine();//엔터표시제거
		input.close();
		input = null;  //자원반납!!!
		
		//a,b,c,d 등급표시
		String grade = "F";
		if(jumsu >= 90) {
			grade = "A";
		}else if(jumsu >= 80) {
			grade = "B";
		}else if(jumsu >= 70) {
			grade = "C";
		}else if(jumsu >= 60) {
			grade = "D";
		}else {
		//	System.out.println("점수 : " + jumsu + " : " + result + " 등급");
			System.out.printf("점수 :%s : %s : %s 등급 %n", jumsu, result, grade);
		//
		
		return;
	}

	}}

