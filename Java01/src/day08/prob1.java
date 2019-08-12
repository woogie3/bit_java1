package day08;
import day07.Prob1;

public class prob1 {

	public String rightPad(String str, int size, char padChar) {
		if(str.length() > size) {
			return null;
		}
		int count = size - str.length();
		for(int i = 0; i< count; i++) {
			str = str + padChar;
		}
		return str;
	}
	
	public String leftPad(String str, int size, char padChar) {
		if(str.length() > size) {
			return null;
		}
		int count = size - str.length();
		for(int i = 0; i< count; i++) {
			str = padChar+str;
		}
		return str;
	}
	
	
	public static void main(String[] args) {
		Prob1 prob1 = new Prob1();
		System.out.println( prob1.leftPad("bit", 6, '#') );
		System.out.println( prob1.leftPad("bit", 5, '$') ); 
		System.out.println( prob1.leftPad("bit", 2, '&') );
		
		/*Prob2 prob2 = new Prob2();
		System.out.println( prob1.rightPad("bit", 6, '#') );
		System.out.println( prob1.rightPad("bit", 5, '$') ); 
		System.out.println( prob1.rightPad("bit", 2, '&') ); 

		*/
	}

}