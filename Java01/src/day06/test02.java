package day06;

public class test02 {

	public static void main(String[] args) {
		int num;
		String name;
		Employee emp1 = new Employee();//객체생성, 즉 어떤클래스 속성을 갖는것을 하나 만드는것
/*		System.out.println(emp1.age+":"+emp1.name+":"+emp1.dept);
		
		Employee emp2 = new Employee();
		emp2.age = 201901;
		emp2.name = "홍길동";
		emp2.dept = "인사부";
		
		System.out.println(emp2.age+":"+emp2.name+":"+emp2.dept);
*/
		//Employee emp3 = new Employee();
		//emp3.age = 201902;
		//emp3.name = "고길동";
		//emp3.dept = "영업부";
		
		//System.out.println(emp3.age+":"+emp3.name+":"+emp3.dept);

					  // 새로운 데이타입생성하려면 별도로 동일한이름의 객체를 생성하면된다
					  // new키워드를 통해 힙영역에 클래스에 메모리에 올림
					  // 즉 클래스는 설계도, 틀과 같다. 그리고 variable instance는 object와 같다. 
					  // '.'는 참조형, 즉 인스턴스자원을 끌어다 사용가능하다.
					  // 하지만 그냥 클래스를 별도로 지정하지않고 임시로 사용하는 자원들을 temporary 자원이라고한다. 즉 휘발성 지원이라는 뜻이다.
					  // this라는 키워드는 나의 멤버들 사이를 접근할때, 즉 특정 variable 자원영역내에 접근할때 this.를 사용한다.
					  /* 다른패키지에서 이 영역들은 사용하려면 public이 선언되야만 사용할수있다.
					   * Employee emp3 = new Employee();
						 emp3.number = 201902;
					     emp3.name = "고길동";
					     emp3.dept = "영업부";
					   */
		
		
	}

}