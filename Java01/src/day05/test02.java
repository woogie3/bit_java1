package day05;

import java.util.Arrays;

public class test02 {

	public static void main(String[] args) {

		int[] scores = {77,99,100,85,91};
		int[] sc = new int[scores.length*2];//scores배열의 길이를  2배로 한다.
		System.out.println(Arrays.toString(scores));
		System.out.println(Arrays.toString(sc));
		
		System.out.println("===========================================");
		System.arraycopy(scores, 0, sc, 0, scores.length);
		System.out.println(Arrays.toString(scores));
		System.out.println(Arrays.toString(sc));
		//주소는 object라고 한다. arraycopy(소스, 소스위치, 목적지, 목적지 위치, 수량) 
		
		String[] names = {"홍기동", "박길동", "고길동", "최길동"};
		String[] nms = new String [names.length*3];
		System.arraycopy(names, 0, nms, nms.length-names.length, names.length);
		System.out.println(Arrays.toString(names));
		System.out.println(Arrays.toString(nms));
	}

}
