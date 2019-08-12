package day03;
import java.util.*;

public class test04_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("점수를 입력하세요: "  );
		int jumsu = input.nextInt();
		
		System.out.printf("점수=%s, 등급은=%n ", jumsu);

		char grade =' ';
		switch(jumsu/10)
		{
			case 10:
			case 9:
				grade = 'A';
				break;
			case 8:
				grade = 'B';
				break;
			case 7:
				grade = 'C';
				break;
			case 6:
				grade = 'D';
				break;
			case 5:
				grade = 'E';
				break;
			default :
				grade = 'F';
				break;
		}
	}

}
