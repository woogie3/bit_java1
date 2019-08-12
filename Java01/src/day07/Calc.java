package day07;

public class Calc { //사칙연산을 메소드로
	//*class변수
	//int data = 0;
	static int data = 0;
	//즉, data변수에 static영역으로 설정하면 된다.
	
	//*class메소드
	public static long add(int a, int b) {
		//static을 사용시 데이터호출을 힙영역이아닌 스태틱영역에서 불러오기에 this를 사용X.
		System.out.println(data);
		return a+b;
	}
	/*
	 * public  long add(int a, int b) {
		System.out.println(Calc.data);
		//static하지않은 메소드로 스태틱한자원은 사용가능하다.
		System.out.println(Math.random());
		return a+b;
	}
	 */
	public static long sub(int a, int b) {
		return a-b;
	}
	
	public static long divide(int a, int b) {
		if(a==0 && b==0)return 0;
		return a/b;
	}
	public static long multi(int a, int b) {
		if(a==0 && b==0)return 0;
		return a*b;
	}
	
	
	
	
}

