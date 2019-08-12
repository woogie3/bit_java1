package day07;

import java.util.Arrays;

public class P141 {

	public void increase(int[] n) { //instance 메소드이기에 별도로 주소설정필요
		for(int i=0; i<n.length;i++) {
			n[i]++;
		}
	}
	
	public static void main(String[] args) {
		P141 p = new P141();
		int[] data = {10,100,1000};
		System.out.println(Arrays.toString(data));
		p.increase(data);
		System.out.println(Arrays.toString(data));

	}

}

