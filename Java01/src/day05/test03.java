package day05;

import java.util.Arrays;

public class test03 {

	public static void main(String[] args) {
		// char 타입의 배열 메서드
		
		String msg = "hello JAVA ~~~";
		String msg2 = "Hi ~~~~~~~~ sql";
		
		//char[] c = {'h', 'e', '1'};
		char[] c = new char[msg.length()];
		for(int i = 0; i < msg.length(); i++) {
			c[i] = msg.charAt(i);
		}
		char[] cc = msg.toCharArray();
		//char[] cc2 = msg2.toCharArray();
		/* msg.toCharArray()는 
		  	원하는 char배열의 길이와 내용을 복사하여 알아서 넣어주는 기능을 가진다.
		
		*/
		cc[0]='Q';
		//배열의 첫번째 주소를 Q로 바꾼다.
		
		String ne = new String(cc);
		//char 배열은 string배열로 이동이 쉽다. 마찬가지로 string배열도 char배열로 이동이 쉽다.
		
		System.out.println(msg);
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(cc));
		System.out.println(ne);
		//System.out.println(Arrays.toString(cc2));
		
		
	}

}
