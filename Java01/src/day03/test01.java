package day03;

public class test01 {

	public static void main(String[] args) {
		// == : 기본형의 값이 같은지 비교 , 
		// eaquals() : 참조형 데이터가 같은지 비교
		
		int num1 = 99;
		int num2 = 99;
		
		String name1 = "홍길동";
		String name2 = "홍길동";
		
		String msg1 = new String("Hello");
		String msg2 = new String("Hello java");
		
		System.out.println("num1==num2 => " +(num1==num2));
		//에러가 나는 이유는 num은 타입이 int타입이라 산술연산이 먼저되버림.그래서 ()처리하면됨
		System.out.println("name1==name2 => " +name1.equals(name2));
		System.out.println("msg1==msg2 => " +msg1.equals(msg2));
		//주소연산도 마찬가지이다, 그렇다면 어떻게 해야하냐면 equals메소드 사용
		//참조형은 equals메소드를 사용해야함
		msg1 = msg2;

	}

}
