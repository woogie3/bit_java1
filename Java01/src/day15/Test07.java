package day15;

public class Test07 {

	public static void main(String[] args) {

//		AAA a = new AAA();//미완성코드라 new키워드 사용불가
		
		AAA a = new AAA() {//extends 키워드가 생략되어있음,
			
			@Override
			void exec() {// 강제성 ㅇ
				
				
			}
		};
		III i = new III() {//implements 키워드가 생략되어있음,
			
			@Override
			public void exec() {// 강제성 ㅇ
				
				
			}
		};
		
		CCC c = new CCC() {//익명클래스에서도 부모호출가능, 
			void exec() {//강제성 x
				
			}
		};

	}

}

abstract class AAA{
	abstract void exec();
}

interface III{
	void exec();
}

class CCC{
	void exec() {}
}




