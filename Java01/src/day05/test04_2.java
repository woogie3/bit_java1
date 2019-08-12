package day05;
//과제3:난수배열(1~45)  1)중복데이터 제거  2)그리고 정렬한다
import java.util.Arrays;

public class test04_2 {

	public static void main(String[] args) {
		int[] nums = new int[Integer.parseInt(args[0])];
		
		for(int i=0; i < nums.length ;i++) {
			nums[i] = (int)((Math.random()*45)+1);
			for(int j=0; j < i ;j++) {
				if(nums[i] == nums[j]) {
					i--;
				}
				
			}
		} System.out.println(Arrays.toString(nums));
	
	 	for(int i = 0; i < nums.length-1; i++) {
	 		int temp;
	 		for(int j = i+1; j < nums.length; j++)
	 		{
	 			if(nums[i] > nums[j]) {
	 				temp = nums[i];
	 				nums[i] = nums[j];
	 				nums[j] = temp;
	 				
	}
}
}
	 	System.out.println("-------정렬후-------");
	 	System.out.println(Arrays.toString(nums));
}
}

