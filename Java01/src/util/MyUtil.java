package util;

public class MyUtil {
	public static long add(int a, int b) {
		return a+b;
	}
	//메소드 오버로딩은 동일한 이름의 메소드가 있을경우 발생하는 현상
	//하지만 매개변수(double a, double b같은) 다르다면 알아서 구분가능하다.
	/*	public static double add(double a, double b) {
			return a+b;
	}
		public static double add(double a, double b, double c) {
			return a+b+c;
		}
		public static double add(double a, double b, double c, double d) {
			return a+b+c+d;
		}
*/		
		//가변인자처리 ' ... nums ' 를 처리한다. 즉 알아서 배열처리함
		public static double add(double ... nums) {
			double sum=0;
			for(double data : nums) {
				sum += data;
			}
			return sum;
		}
		//즉 이 기능을 통해 이거 하나로 다 처리가능하다.
		
/*		public static double add(double[] a) {
			double sum=0;
			for(double data : a) {
				sum += data;
			}
			return sum;
		}
		//위와같아보이지만 배열처리해버린다.
*/		
		public String rightPad(String str, int size, char padChar) {
			if(str.length() > size) {
				return null;
			}
			int count = size - str.length();
			for(int i = 0; i< count; i++) {
				str = str + padChar;
			}
			return str;
		}
		
		public String leftPad(String str, int size, char padChar) {
			if(str.length() > size) {
				return null;
			}
			int count = size - str.length();
			for(int i = 0; i< count; i++) {
				str = padChar+str;
			}
			return str;
		}
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
		//숫자를 넘겨받아 그중 가장 큰수를 리턴하는 함수 max
		public static int max(int ... a){
			int max = Integer.MIN_VALUE;
			for(int data : a) {
				if(max < data) max = data;
			}
			return max;

}
		//숫자를 넘겨받아 그중 가장 작은수를 리턴하는 함수 min
		public static int min(int ... a){
			int min = Integer.MAX_VALUE;
			for(int data : a) {
				if(min > data) min = data;
			}
			return min;
}
}