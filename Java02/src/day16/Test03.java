package day16;

public class Test03 {

	public static void main(String[] args) {
		System.out.println("main start");
		String msg = null;
		msg = "xmlsfd";
				
		
		try {
			if(msg != null ) {
				System.out.println(msg.charAt(3));
				int num = Integer.parseInt(msg);
			}
			
		}catch(Exception e) {
			System.out.println("예외발생 : 정수로 입력해주세요"); // all problem
		}finally {
			System.out.println("finally { 자원반납코드 }");
		}
		
		
		System.out.println("main end");

	}

}
//try catch구문을 활용해 exception핸들링을 익히자!
