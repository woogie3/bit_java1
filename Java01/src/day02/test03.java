package day02;

public class test03 {
	public static void main(String[] args) {
		int x = 600;
		int y = 700;
		System.out.println("x="+x+", y="+y);
		System.out.printf("x=%d, y=%d \n",x,y); //printf는 jdk1.5부터 지원된기능,f는 포맷을 의미;'
		
		int temp = x;                                        //\n,%n 줄바꿈		
		x=y;
		y=temp;//간단한 알고리즘 적용, temp라는 공간에 x의 값을 저장후 연산실행.
		
		System.out.printf("x=%d, y=%d \n",x,y);
		System.out.println("----------------------------");
		
		double d1 = 99.15689, d2=77.34677;
		System.out.printf("d1=%f, d2=%f %n", d1, d2);
		double temp2 = d1;
		d1 = d2;
		d2 = temp2;	
		System.out.printf("d1=%5.2f, d2=%5.2f %n", d1, d2);
		
		
	}
}