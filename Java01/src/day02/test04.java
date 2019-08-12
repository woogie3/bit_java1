package day02;

public class test04 {

	public static void main(String[] args) {
		
		System.out.println("byte type min value => " +Byte.MIN_VALUE);
		System.out.println("byte type max value => " +Byte.MAX_VALUE);
		System.out.println("int type min value => "+Integer.MIN_VALUE);
		System.out.println("int type max value => "+Integer.MAX_VALUE);
		System.out.println("long type min value => "+Long.MIN_VALUE);
		System.out.println("long type max value => "+Long.MAX_VALUE);
		
		System.out.println(Math.PI);
		//static한 자원들은 name을 대문자로, 클래스 네임으로 연다.
		
		char c = 's';
		System.out.println(c + "숫자니? "+Character.isDigit(c));
		//Character는 클래스, 기능은 isDigit()이다. 
		
		String ss = "1"+"1";
		System.out.println(ss);

		int s1 = Integer.parseInt("1") + Integer.parseInt("1");
		System.out.println(s1);
		//string타입을 int타입으로 캐스팅

		double s2 = Double.parseDouble("1.6") + Double.parseDouble("1.6");
		System.out.println(s2);
	
	}

}
