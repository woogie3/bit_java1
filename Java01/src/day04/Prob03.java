package day04;

public class Prob03 {
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
		for(int i=0; i <sourceString.length(); i++) {// i를 넣어 배열주소를 자동으로 넣어 자동으로 입력되게함
			char ch = sourceString.charAt(i);
			encodedString = encodedString+String.valueOf(ch>='a' && ch<='w' ? 
					(char)(ch+3) : (ch == 32 ? ch = 32: (char)(ch - 23))); //
		}
		
		System.out.println("암호화할 문자열 : " + sourceString);
		System.out.println("암호화된 문자열 : " + encodedString);
	
		for(int i=0; i <encodedString.length(); i++) {
		char ch1 = encodedString.charAt(i);
		decodedString = decodedString+String.valueOf(ch1>='a' && ch1<='w' ? 
				(char)(ch1 -3) : (ch1 == 32 ? ch1 = 32: (char)(ch1 + 23))); //
		
}
	System.out.println("복호화할 문자열 : " + encodedString);
	System.out.println("복호화된 문자열 : " + decodedString);
}
}
