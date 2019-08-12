package day03;

public class test06 {

	public static void main(String[] args) {
		//1~100합
//(1+100)*100/2
		int i;
		int sum = 0;
		for(i=1; i<=100; i++) {
			sum = sum+i;
			//sum += i;로 해도 같은 값이 나온다.		
		}
		System.out.println("1~100합계"+sum);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}

	/*
	 * int j; int sumx = 0; //4 8 6 12 16 20 ~~~100까지 for(j=1; j<=100; j++) { sumx =
	 * sumx + j; if(j%4==0) System.out.println("1~100 4의 배수 합계 : "+sumx); } }
	 */
}
