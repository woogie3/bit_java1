package day17_ex;

public class DiceGame {
	public static void main(String[] args)throws Exception{
		DiceGame game = new DiceGame();
		
		int result1 = game.countSameEye(10);
		System.out.println("면의 개수가 8개인 주사위 2개를 던져 같은 눈이 나온 횟수" 
				+result1);
		int result2 = game.countSameEye(-10);
		System.out.println("면의 개수가 8개인 주사위 2개를 던져 같은 눈이 나온 횟수" 
				+result2);
		
	}
	int countSameEye(int n){
		
		if(n<0)
			try {
				throw new Exception("음수 안됨");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}//에외발생
		
		
		Dice d1 = new Dice(8);
		Dice d2 = new Dice(8); //8면인 주사위 2개 표현
		int count = 0;//횟수
		
		while(n > 0) { //
			if(d1.play() == d2.play()) count++;
			n--;
		}
		
		
		return count;
	}
}
		
		
