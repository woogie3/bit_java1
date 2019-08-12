package day04;

import java.util.Scanner;

public class report01 {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
		System.out.println("문자를 입력해주세요  : ");
		String msg = scanner.nextLine();
		for(int j=0; j < msg.length() ;j++) {// i를 넣어 배열주소를 자동으로 넣어 자동으로 입력되게함
			char ch = msg.charAt(j);
			char s =(ch>='A' && ch<='Z') ? (char)(ch+32) : (ch>='a' && ch<='z') ? (char)(ch-32) : ch; 
			System.out.print(s);
			
		}
		
		msg=null;
		
		
		}
	

	}
