package day14;

public class TVTest {
	//LOW COUPLING 예제
	public static void main(String[] args) {
		
//		TV user = new STV();
//TV인터페이스를 이용해 STV,LTV 두클래스 모두 구현가능
		
//		user.poweron();
//		user.poweroff();
//		
//		user = new LTV();
//		user.poweron();
//		user.poweroff();
//		//low coupling
		
//		user = new ITV();
		play(new STV());
		play(new LTV());
		play(new ITV());
		
		
		
	}
	public static void play(TV tv){
		tv.poweron();
		tv.poweroff();
		
	}


}
