package day03;

public class test05 {
	public static void main(String[] args) {
		
		//for(초기값; 조건식; 증감식;)
		int i;
		for(i=1 ; i < 10; i++) {
		System.out.println("Hello Java "+i);
	}
		System.out.println(i);
		//오름차순
		
		
		int j =10;
		while(j>0) {
		System.out.println("while "+j);
		j--;
		
		}
		//내림차순
		
		boolean flag = true;
		while(flag) {
			j++;
			System.out.println("~~~~~~~~~~~~~~~~~"+j);
			if(j==5) flag = !flag;
		}
		System.out.println("j : "+j);
		while(j<5) {
			System.out.println("do while");//동작x
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
			
		}
		do {
			System.out.println("do while");
			
		}while(j>5);
	}

}

