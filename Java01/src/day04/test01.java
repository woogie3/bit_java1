package day04;
import java.util.*;
public class test01 {

	public static void main(String[] args) {
		System.out.println("알파벳 아스키 코드값확인");
		char a = 'a';
		char A = 'A';
		for(int i = 0; i<26; i++) {//for루프로 반복
		System.out.println(a+" : "+(int)a++ +","+A+" : "+(int)A++);//아스키코드(소문자)입력
		
		}
 	for(int i = 0; i<26; i++) {//for루프로 반복
			System.out.println(A+" : "+(int)A++);//아스키코드(대문자)입력
			
		}

		
		//변수 ch에 저장된 문자가 대문자인 경우에만 소문자로 변경하는 코드를 완성
		/*
		Scanner scanner = new Scanner(System.in);
		System.out.println("문자를 입력해주세요  : ");
		String ch = scanner.nextLine();
		String result;
		switch(ch) {
		case "A":
		     result = "a";
		     break;
		case "B":
			 result = "b";
			 break;
		 */
		
		//변수 ch에 저장된 문자가 대문자인 경우에만 소문자로 변경하는 코드를 완성
/*		Scanner scanner = new Scanner(System.in);
		System.out.println("문자를 입력해주세요  : ");
		String msg = scanner.nextLine();
		for(int i=0; i < msg.length() ;i++) {// i를 넣어 배열주소를 자동으로 넣어 자동으로 입력되게함
			char ch = msg.charAt(i);
			char s =(ch>='A' && ch<='Z') ? (char)(ch+32) : ch; //(ch+32)는 int타입이다. 그래서 char타입으로 캐스팅하기위해 앞에(char)를 넣는다
			System.out.print(s);
		}
*/		
		//System.out.print(ch+ " => "+s);
		
		
		
		
		//오늘의 과제 소문자를 대문자로, 대문자를 소문자로
		
	}

}

