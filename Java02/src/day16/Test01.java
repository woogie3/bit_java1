package day16;

public class Test01 {

	public static void main(String[] args) {
		
		System.out.println(" main start");
		int a = 10, b = 0;
		
		try {
			
		System.out.println(1);
		System.out.println(a/b); //ArithmenticException연산예외에러발생
								//throw new ArithmeticException()예외발생
		System.out.println(2);
		}catch (ArithmeticException e) { //적절한상황에 맞는 예외처리 catch구문 사용
			System.out.println("예외발생 :"+ e.getMessage());
			e.printStackTrace();//예외발생시 좀더 자세히 출력됨
			System.out.println(3);
			
		}
		finally {//예외발생여부를 무시하고 출력
			System.out.println("finally { 항상수행  }");
		}
//		System.out.println("------------------------------------------");
//		
//		if(b != 0) {
//			System.out.println(a / b);
//		}
		
		System.out.println(" main end ");

	}

}

//		
//		ArithmeticException ss;
//		NullPointerException nn;
//		IndexOutOfBoundsException ii; //이 3가지는 runtimeException의 자식이다.