package day04;

public class report2_sum {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
		for(int j=1; j<=i; j++ ) {
				sum+=j;
			}
		}
		System.out.println("1+(1+2)+(1+2+3)+...+(1+...+10)의 합계는: "+ sum);

	}

}
