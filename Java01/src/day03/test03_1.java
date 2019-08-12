package day03;
import java.util.*;
public class test03_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("점수를 입력하세요: "  );
		int jumsu;
		jumsu = input.nextInt();
		
		
		//점수에 따른 등급표시
		System.out.println(jumsu >= 90 ? "A" : 
			(jumsu >= 80 ? "B" : 
				(jumsu >= 70 ? "C" : 
					(jumsu >= 60 ? "D" : 
						(jumsu <= 50 ? "F" : "유효하지않은 점수입니다.")))));

	}

}
