package day15;

public class test02 {

	public static void main(String[] args) {
		
//		A a = new A(); //아우터클래스에 A객체 생성
//		a.p(); //객체생성 프린트 메소드실행
		
		A.B b = new A("AAAAAAA"). new B();
		b.print();
		
//		A.C c = new A().new C();
//		c.print();
		
		A.C.print();
		
	}

}

class A {
	String name = "A";
	public A() {
		super();
	}

	public A(String name) {
		super();
		this.name = name;
	}

	void p() {
		System.out.println("A에서 호출");
		new B().print(); //inner클래스안에 outer클래스의 메소드 삽입
	}

	class B {

		void print() {
			String name = "B";
//			System.out.println("B  "+name);
//			System.out.println(this.name);
			System.out.println(A.this.name);
			System.out.println(A.this.name); //this.자원은 사용불가하다.

		}
		
	}
	static class C{ //inner클래스앞에 static 허용
		static void print() {
			System.out.println("~~~~~~~~~~~~~~");
//			System.out.println("~~~~~~~~~~~~~~"+name); // static하기에 인스턴스 자원 사용불가
		}
		
	}
	class D{
		void p() {
			class E{//local inner class
				
				
			}
		}
	}
	
}
//class B {
////	A a;//has a관계
//	void print() {
//		System.out.println("B  "+name);
////		System.out.println("B  "+a.name);
//	}
//	
//}