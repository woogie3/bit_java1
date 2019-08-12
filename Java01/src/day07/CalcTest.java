package day07;

public class CalcTest {

	public static void main(String[] args) {
		//Calc c1 = new Calc();
		//Static하지않은 메소드는 별도로 주소를 정해줘야한다.
		//인스턴스 자원은 스태틱을 사용하면안된다.
		
		Calc.add(11, 99);
		Calc.sub(11, 99);
		Calc.divide(11, 99);
		Calc.multi(11, 99);
		
		System.out.println(Calc.add(11, 99));
		System.out.println(Calc.sub(11, 99));
		System.out.println(Calc.divide(11, 99));
		System.out.println(Calc.multi(11, 99));

	}

}

