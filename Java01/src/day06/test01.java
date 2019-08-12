package day06;

public class test01 {

	public static void main(String[] args) {
		int[] num = {2,4,6,8};
		int[] num2;
		num2 = new int[] {1,2,3,4,5,6,7};//항상 이런식으로 작성 할때는 new 데이터타입[] 이런식으로 붙여서 사용한다.
		
		String[] arr = {"helo", "java", "test"};
		
		for(int data : num) {
			System.out.println(data);
			
		}
		for(String data:arr) {
			System.out.println(data);
		}

	}

}
