package day04;

import java.util.Arrays;

public class test05 {

	public static void main(String[] args) {
		//배열선언, 생성, 초기화
		int[] scores = {88,99,100,22,56,88,99};
		String[] names = {"홍길동","김길동","박길동","고길동","최길동","이길동"};
		
		System.out.println(Arrays.toString(scores));
		System.out.println(Arrays.toString(names));

		if(names.length > 6) {
		System.out.println(names[6]);
		System.out.println("=====================================");
		}
		for(String data :names) {//names배열에 각 데이터에 끝자리만 출력하기위해 '변수타입 data :배열변수명'을  for안에 넣는다
			System.out.println("**"+data.charAt(data.length()-1));
			//데이터끝에 자리만 출력하기 위해 data.charAt(data.length()-1)을 사용
		}
		double sum = 0;
		for(int data:scores) {
			sum += data;
		}
		System.out.printf("평균 = %.2f", sum/scores.length);
		
	}
}