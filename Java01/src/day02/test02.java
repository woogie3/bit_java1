package day02;

public class test02 {
	public static void main(String[] args) {
		int num = 99; //local variable 지역변수라고함
		System.out.println(num);
		
		short a,b;
		a = b =10;
		int c = a + b;
		//더 큰 자료형으로 변환시
		
		int k = 0;
		short s =10;
		k = (int)(10 + 3.5f);
		//더 작은 자료형으로 변환시 정보손실이 있을 수 있음
		
		String name = "홍길동";
		System.out.println(name.charAt(0)+"**");
		
		String address = new String("비트교육센터");
		System.out.println(address+" : "+address.length());
		//위의 문장과 비교하여 메모리용량을 줄일수있음
		
		long number = 999999999999999999L;
		System.out.println(number);
		
		System.out.println('A'+":"+(int)'A');
		System.out.println('a'+":"+(int)'a');
		System.out.println('Z'+":"+(int)'Z');
		System.out.println('z'+":"+(int)'z');
		System.out.println('0'+":"+(int)'0');
		System.out.println('9'+":"+(int)'9');
		//아스키코드값 표시
	}
}
