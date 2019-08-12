package day08;

public class BlockTest {
	public static void main(String[] args) {
		Block b1 = new Block();
		Block b2 = new Block();
		Block b3 = new Block();
		Block b4 = new Block();
		
	}

}

class Block{
		int i;
		int j;
		static String name;
				
		static {
			//System.out.println("static {  }");//한번만 실행됨 -> 즉 이것은, 생성자함수들의 반복되는 구문들을 불러냄
			name = "~~~";
		}
	
	
	{
		//System.out.println("{    }");//static 초기화함수보다 먼저실행됨
		this.j = 99;
	}
	public Block() {
		this.j = 99;
		//System.out.println("생성자");
	}
	public Block(int i ) {
		this.j = 99;
		this.i = i;
	}
	
}