package day02;

import java.util.Scanner;

public class test05 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("학생이름을 입력하세요. : _");
		String name = input.nextLine();
		System.out.println("점수를 입력하세요. : ex)90 ");
		int score = input.nextInt();
		//input기능을 이용해 값을 입력받는다
		System.out.printf("이름 : %s, 점수 : %d %n",name,score);
		//garbage collector사용시 
		input.close();
		input =null;
		//자원값을 돌려주고 초기화한다.
	}

}
