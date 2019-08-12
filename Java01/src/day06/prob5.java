package day06;

import java.util.Arrays;

public class prob5 {
	public static void main(String[] args) {
		int[] num = null;
		num = new int[6];
		//System.out.println(num.length); //디폴트값은 항상 0이나 null로 초기화;
		
		for(int i = 0; i < num.length; i++ ){
			num[i] = (int)(Math.random()*45)+1;//난수생성(1~45)
			for(int j=0; i>j; j++) {
				if(num[j] == num[i]) {//중복제거하는 if문
					i--;
					break;
				}
				
			}
			//System.out.println(Arrays.toString(num));
		}
		System.out.println(Arrays.toString(num));
		//정렬
		
		System.out.println("=========== sort ============");
		//정렬하기
		
		int count=0;
		for(int i=0; i < num.length-1; i++) {
			int min = i;
			
		for(int j=i+1; j<num.length; j++) {
			if(num[i]>num[j]) {
				min = j; // 가장작은 위치인덱스가 들어감. 즉, 최소값 설정							
			}
			//System.out.println(i+" "+count);
		
		if(i != min) {//여기서 이제 최솟값이 정해지고 나면 정렬 스왑이 일어난다.
		int temp = num[i];
		num[i] = num[j];
		num[j] = temp;
		count++ ;
		}
	
	}
		
	}
		System.out.println(count);
		System.out.println(Arrays.toString(num));
}
}