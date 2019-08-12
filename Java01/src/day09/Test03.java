package day09;

import java.util.Date;

public class Test03 {
	public static void main(String[] args) {
		String msg = "";
		
		msg = msg+"hello "+new java.util.Date()+"java"+"  test"+'a'+89; //성능이 매우 떨어짐
		System.out.println(msg);
		
		String msg2 = "";
		
		StringBuffer sb = new StringBuffer();//-> StringBuffer는 문자열을 추가하거나 변경 할 때 주로 사용하는 자료형이다.  즉, 이렇게 써야 성능에 좋다.
		//=> StringBuilder sb = new StringBuilder(); 즉, StringBuilder로도 똑같이 사용가능하다.
		
		sb.append("hello  ");//-> StringBuffer의 append 라는 메소드를 이용하여 계속해서 문자열을 추가해 나갈 수 있다.
		sb.append(new Date());
		sb.append("java");
		sb.append("  test");
		sb.append('A');
		sb.append(89);
		
		msg2 = new String(sb);
		//==msg2 = sb.toString();
		System.out.println(msg2);
		
	}

}
