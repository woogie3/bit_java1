package day05;

import java.util.Arrays;

public class test01 {

	public static void main(String[] args) {
		//
		int num1 = 99;
		int num2 = num1;
		System.out.println("num1= "+num1+" num2= "+num2);
		num1=77;
		System.out.println("num1= "+num1+" num2= "+num2);
		
		int[] n1 = {11,22,33,44,55,77,66,99,88};
		int[] n2 = n1;
		int[] n3 = new int[n1.length];
		for(int i=0; i < n1.length; i++) {
			n3[i] =n1[i];
		}
		
		
		System.out.println(Arrays.toString(n1));
		System.out.println(Arrays.toString(n2));
		System.out.println(Arrays.toString(n3));
		n1[2] = 0; //3번째 배열주소값을 0으로 초기화 
		System.out.println(Arrays.toString(n1));
		System.out.println(Arrays.toString(n2));
		System.out.println(Arrays.toString(n3));
		
		
		
	}

}