package day10;

public class Prob10 {

	public static void main(String[] args) {
	/*	일반적인 방식
	 * Student a = new Student ("홍길동",20,2012001);
		a.print();
		Teacher b = new Teacher ("이순신",30,"JAVA");
		b.print();
		Employee c = new Employee ("유관순",40,"교무과");
		c.print();
	*/
		//is방식
		Person a = new Student ("홍길동",20,2012001);//모든객체의 타입을 부모로 바꿀수있다.
		
		Person b = new Teacher ("이순신",30,"JAVA");
		
		Person c = new Employee ("유관순",40,"교무과");
		
		// is a
		Person p= null;//Person에 p라는 변수선언을해주고 초기화한다.
		p=a;//부모는 자식을 받을수있다.
		//p.printA
		
		((Student)p).print();//즉, 타입별로 캐스팅을 해줘야함
		
		p=b;
		((Teacher)p).print();
		
		p=c;
		((Employee)p).print();
	}

}
