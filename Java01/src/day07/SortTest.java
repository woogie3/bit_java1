package day07;

import java.util.Arrays;

import util.Sort;

public class SortTest {

	public static void main(String[] args) {
		int[] src = {9,10,48,18,36};
		int[] result = Sort.sort(src);
		
		System.out.println(Arrays.toString(src));
		System.out.println(Arrays.toString(result));

	}

}
