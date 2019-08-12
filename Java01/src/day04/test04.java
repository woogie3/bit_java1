package day04;
import java.util.*;
public class test04 {

	public static void main(String[] args) {
		/* Array : ※배열은 항상 위치 인덱스가 따라다닌다. 
		    배열의 순서는 선언-생성-초기화 과정을 가진다
		   
		*/
		//Scanner input = new Scanner(System.in);
		int[] scores;//[]는 배열 설정한다. 즉, 배열선언
		scores = new int[5]; //배열생성
		//int i = input.nextInt();
		for(int i = 0; i<=4; i++) {
		System.out.print(scores[i] + "      ");
		}
		System.out.println();
		
		String[] names = new String[5];
		for(int i=0; i<5; i++) {
		System.out.print(names[i]+"   ");
		}
		
		System.out.printf("\n===================================\n");
		
		scores[0] = 99;
		scores[1] = 100;
		scores[2] = 69;
		scores[3] = 79;
		scores[4] = 89;
		
		names[0] = "홍길동";
		names[1] = "고길동";
		names[2] = "박길동";
		names[3] = "김길동";
		names[4] = "최길동";
		
		double avg = 0.0;
		int sum = 0;
		for(int i=0; i < scores.length; i++){
			sum += scores[i];
		}
		avg = sum/scores.length;
		System.out.println(Arrays.toString(scores));
		System.out.println(Arrays.toString(names));
		
		System.out.println("평균 : "+avg);
		for(int i=0; i<names.length; i++){
			System.out.println(names[i].charAt(0)+"**"+" "+scores[i]+//배열변수명.charAt(0)은 배열의 첫번째를 제외한 나머지를 표시하지않음, 뒤에는 "**"를 두어 표시함.
					(scores[i] > avg ? " 평균이상" : " 평균미달" ));
			
		}
		
		System.out.printf("===================================\n");
		//홍** 99 평균이상

	}

}
