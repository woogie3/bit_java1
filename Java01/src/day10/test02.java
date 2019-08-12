package day10;

import java.util.Arrays;

public class test02 {//배열복사 워밍업~~~

	public static void main(String[] args) {
		char[] c ="ABCDEF".toCharArray();//"ABCDEF"를 배열화함 
		int count = 6; //분자열 길이
		int d = 0; //문자열 배열위치주소
		System.out.println(Arrays.toString(c));
		System.arraycopy(c, d+1, c, d, count -d -1);
		c[--count]=' ';
		System.out.println(Arrays.toString(c));

	}

}
