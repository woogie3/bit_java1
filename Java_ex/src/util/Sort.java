package util;
/**
 * sort 정렬
 */
import java.util.Arrays;

public class Sort {
	public static int[] sort(int[] nums) {
		
				int[] copy = new int[nums.length];
		System.arraycopy(nums, 0, copy, 0, nums.length);
		
		int temp = 0;
		int min = 0;
		for(int i=0; i<copy.length;i++) {
			min=i;
			for(int j = i+1; j<copy.length; j++) {
				if(copy[min]>copy[j]) {
					min=j;
				}
			
			}
			temp = copy[min];
			copy[min]=copy[i];
			copy[i]=temp;
			
		}
		return copy;
				
	
	
	
	
	}
	

}
