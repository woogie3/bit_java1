package day23;

import java.util.Scanner;

public class ScannerRegEx {

	public static void main(String[] args) {//정규표현식을 이용해 문장을 쪼갠다.
		
		String str ="1 and 2 and animal and lion and tiger";
		Scanner scan = new Scanner(str);
		scan = scan.useDelimiter("\\s*and\\s*");
		int firstToken = scan.nextInt();
		int secondToken = scan.nextInt();
		String thirdToken = scan.next();
		String fourthToken = scan.next();
		String fifthToken = scan.next();
		System.out.printf("%d,%d,%s,%s,%s",firstToken,secondToken,thirdToken,fourthToken,fifthToken);
		
	}

}
