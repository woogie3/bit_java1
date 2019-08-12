package day05;

public class Prob3 {
	public static void main(String[] args) {
		String sourceString = 
		"everyday we have is one more than we deserve wxyz";
		String encodedString = "";
		String decodedString = "";
		/*
		  암호화된 문장은 아스키코드로 +3된것을 확인할수있다.
		   hyhubgdb zh kdyh lv rqh pruh wkdq zh ghvhuyh
		 */
		// 프로그램을 구현부 시작.	
		// 참고 : 문자 'a'의 정수값은 97이며, 'z'는 122입니다. 
		
		// 프로그램 구현부 끝.
		for(int i = 0; i < sourceString.length(); i++) {
			char c = sourceString.charAt(i);
			if(c=='x'| c=='y'| c=='z') {
				encodedString += (char)(c-23);
			}else if(c == ' '){
				encodedString += c;				
			}else {
				encodedString += (char)(c+3);
			}
		}
		
		System.out.println("암호화할 문자열 : " + sourceString);
		System.out.println("암화된 문자열 : " + encodedString);
		for(int i = 0; i < encodedString.length(); i++) {
			char c = encodedString.charAt(i);
			if(c=='x'| c=='y'| c=='z') {
				decodedString += (char)(c+23);
			}else if(c == ' '){
				decodedString += c;				
			}else {
				decodedString += (char)(c-3);
			}
		}
		System.out.println("복호화할 문자열 : " + encodedString);
		System.out.println("복호화된 문자열 : " + decodedString);
	}
}
