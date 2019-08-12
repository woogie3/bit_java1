package day06;

public class test03 {

	public static void main(String[] args) {
		int num;
		String name;
		Employee emp1 = new Employee();//객체생성, 즉 어떤클래스 속성을 갖는것을 하나 만드는것
		//System.out.println(emp1.age+":"+emp1.name+":"+emp1.dept);
		emp1.display(); //여기서 Employee 클래스에서 display라는 기능을 호출한것이다. 별도로 생성한 기능이므로, 앞으로 다른패키지에서 사용하려면 public을 적절하게 사용하여야한다.
		//emp1은 주소를 의미한다.
		Employee emp2 = new Employee();
		emp2.setAge(31);
		emp2.setName("홍길동");
		emp2.setDept("인사부");
		emp2.setSingle(true);
		//emp2.age = 201901;
		//emp2.name = "홍길동";
		//dept = "인사부";
		//System.out.println(emp2.age+":"+emp2.name+":"+emp2.dept);
		emp2.display();

		Employee emp3 = new Employee();
		emp3.setAge(27);
		emp3.setName("고길동");
		emp3.setDept("영업부");
		emp3.setSingle(true);
		//emp3.age = 201902;
		//emp3.name = "고길동";
		//emp3.dept = "영업부";
		//System.out.println(emp3.age+":"+emp3.name+":"+emp3.dept);
		emp3.display();

					  // 새로운 데이타입을 생성하려면 별도로 동일한이름의 객체를 생성하면된다
					  // new키워드를 통해 힙 영역에 클래스에 메모리에 올림
					  // 즉 클래스는 설계도, 틀과 같다. 그리고 variable instance는 object와 같다. 
					  // '.'는 참조형, 즉 인스턴스자원을 끌어다 사용가능하다.
					  // 하지만 그냥 클래스를 별도로 지정하지않고 임시로 사용하는 자원들을 temporary 자원이라고한다. 즉 휘발성 지원이라는 뜻이다.
					  // this라는 키워드는 나의 멤버들 사이를 접근할때, 즉 특정 variable 자원영역내에 접근할때 this.를 사용한다. 즉 힙영역에서만 사용가능
					  /* 다른패키지에서 이 영역들은 사용하려면 public이 선언되야만 사용할수있다.
					   * Employee emp3 = new Employee();
						 emp3.number = 201902;
					     emp3.name = "고길동";
					     emp3.dept = "영업부";
					   */
						// 즉 간단하게 비유하면 return은 출금(출금후엔 돈이) , void는 입금(입금후엔 아무것도없음)이다.
						// math.random는 즉 static한 자원인것이다. 메모리영역에 생성되지않게 설계되었기 때문이다. 제약없이 어디서든 공유할수있기 때문이다.
					    // refactor를 사용해 클래스를 다른패키지로 이동가능하며, 특정 클래스 변수명을 바꿀수있다.
		
		
	}

}

