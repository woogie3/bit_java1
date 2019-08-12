package day07;
import java.util.Arrays;
public class Sort1 {
	public static int[] sort(int[] nums) {
	
			//배열원본은 변경이 되지 않도록 하고
			//오름차순으로 정렬된 int[]를 리턴한다.
			int[] bk = Arrays.copyOf(nums, nums.length);
			//.copyOf(배열변수, 배열길이)
			
			for(int i = 0; i < bk.length-1; i++) {
				int min = i;
				for(int j = i+1; j < bk.length; j++)
				{
					if (bk[j]<bk[min]) {
						min=j;
					}
				
				}
				if(bk[i] > bk[min]) {
					int temp = bk[i];
					bk[i] = bk[min];
					bk[min] = temp;
									
				}
			}
			return bk;

}
}
