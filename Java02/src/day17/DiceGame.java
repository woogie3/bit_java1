package day17;

public class DiceGame {
	public static void main(String[] args) throws Exception {
		DiceGame game = new DiceGame();
		
		int result1 = 0;
		int result2 = 0;
		try {
			result1 = game.countSameEye(10);			
		} catch (DiceException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("면의 개수가 8개인 주사위 2개를 던져 같은 눈이 나온 횟수" 
				+result1);
	
		try {
			result2 = game.countSameEye(-10);			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("면의 개수가 8개인 주사위 2개를 던져 같은 눈이 나온 횟수" 
		+result2);
	}
	int countSameEye(int n) throws DiceException {
		//(2^3*2) * n 총경우의수
		//n번 던졌을때 나오는 수중에서 같은눈의경우의수
		//음수가 들어오면 예외시켜버림
		Dice d1 = new Dice(8);
		Dice d2 = new Dice(8);
		int count = 0;
		if(n < 0) throw new DiceException();
		
		for(int i=0;i<n ; i++) {
			int a = d1.play();
			int b = d2.play();
			
			if(a == b) {
				System.out.print(a);
				System.out.println(b);
				count++;
			}			
		}
		return count;
		
		
		
	}
}
class DiceException extends Exception{
	public DiceException() {
		super("DiceException : 음수 허용 안됨");
	}

}