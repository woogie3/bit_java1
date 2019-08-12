package day07_ex;

import java.util.Arrays;

public class SortTest {

	public static void main(String[] args) {
		int[] src = {9,10,48,18,36};
		int[] result = Sort1.sort(src);
		
		System.out.println(Arrays.toString(src));
		System.out.println(Arrays.toString(result));

	}

}
