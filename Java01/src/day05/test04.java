package day05;

import java.util.Arrays;

public class test04 {

	public static void main(String[] args) {

		 
		
		//System.out.println((int)(Math.random()*10));
		//난수 생성
		//String[] n = {};
		//String[] n = {"5"};
		
		
		
		/*
		 배열길이 : n
	        배열주소 : i
	        비교배열주소 : j
		배열값 : nums[]
 		temp공간에 배열 i주소값을 넣는다.
		i와 i+1, i+2 ,....의 값을 비교후
		i 주소에 제일 작은값을 바꾼다.
		근데 여기서 i+n주소에 있는 값은 i주소 값으로 넣는다.
		즉, 데이터가 교환되는것
		 */
		if(args.length ==0) {
			System.out.println("배열의 사이즈 정보를 실행 매개변수로 넘겨주세요..");
			System.out.println("실행 예) java day05.test04 5");
			return;
		}
		int[] nums = new int[Integer.parseInt(args[0])];
	
		for(int i=0; i < nums.length ;i++) {
			nums[i] = (int)((Math.random()*45)+1);//1~45사이의 정수를 나타냄
			for(int j=0; j < i ;j++) {
				if(nums[i] == nums[j]) {
					i--;
				}
				
			}
		} 
		
		
		System.out.println("---------정렬----------");
		int count = 0; //count는 swap횟수를 확인하는 변수이다.
		System.out.println(Arrays.toString(nums));
		for(int i = 0; i < nums.length-1; i++) {
			int min = i;
			for(int j = i+1; j < nums.length; j++)
			{
				if (nums[j]<nums[min]) {
					min=j;
				}
			
			}
			if(nums[i] > nums[min]) {
				int temp = nums[i];
				nums[i] = nums[min];
				nums[min] = temp;
				count++;
			
			//System.out.println(Arrays.toString(nums));
			
			 }
		}
		System.out.println(Arrays.toString(nums));
		System.out.println("count = >"+count);
		
		//정렬 sort (오름차순, 내림차순, quick, bubble, select, insert, merge...)
		//for루프로 이 반복을 표현한다.
		
		
		
		
	}

}
