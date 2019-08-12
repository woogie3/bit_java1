package day02;

public class test06 {

	public static void main(String[] args) {

		int num = 100;
		
		System.out.println(num++);
		System.out.println(num);
		System.out.println(6%4);//나머지구하는 연산자 nmg함수
		
		int x = 100, y = 100;
		System.out.println(x!=y);
		
		
		
		int score = 9999999;
	    boolean result = 0 <= score && score <= 100;
	    System.out.println("score 유효성 검증 결과 : " +result);
	  //논리연산시 &&사용 and연산을 두번하는게 더 낫다.
	    
	    System.out.println(3&4);
	    //00011
	    //00100
	    //00000
		
	    System.out.println(4<<2); //00000100 -> 0010000 4 -> 16
	    System.out.println(16>>2); //0010000 -> 0000100 16 -> 4
	    //>>shift연산자 잔수변환하여 서수표시
	    
	    //연산자

	    
	    
	    
	}

}

