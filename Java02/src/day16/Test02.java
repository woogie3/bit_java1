package day16;

public class Test02 {

	public static void main(String[] args) {
		System.out.println("main start");
		String msg = null;
		msg = "xmlsfd";
				
		
		try {
			System.out.println(msg.charAt(3));
			int num = Integer.parseInt(msg);
			
		}catch(NullPointerException n) {
			System.out.println("예외발생"+n.getMessage()); //null
			
		}catch(StringIndexOutOfBoundsException s) {
			System.out.println("예외발생"+s.getMessage()); //index
		}catch(Exception e) {
			System.out.println("예외발생 : 정수로 입력해주세요"); // all problem
		}finally {
			System.out.println("finally { 자원반납코드 }");
		}
		
		
		System.out.println("main end");

	}

}
