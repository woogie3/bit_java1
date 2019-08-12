package day06;

public class test04 {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.setAge(0);
		emp1.setName(" ");
		emp1.setDept(" ");
		emp1.setSingle(true);
		
		Employee emp2 = new Employee();
		emp2.setAge(31);
		emp2.setName("홍길동");
		emp2.setDept("인사부");
		emp2.setSingle(true);
		
		Employee emp3 = new Employee();
		emp3.setAge(27);
		emp3.setName("고길동");
		emp3.setDept("영업부");
		emp3.setSingle(true);
		
		Employee emp4 = new Employee();
		emp4.setAge(29);
		emp4.setName("김현동");
		emp4.setDept("기획부");
		emp4.setSingle(false);
		
		Employee[] emp = {emp1,emp2,emp3,emp4};
		
		System.out.println("==영업부에 근무하는 사원 목록==");
		int count =0;
		double sum = 0;
		for(int i= 0; i < emp.length; i++) {
			if( emp[i].getDept() != null && emp[i].getDept().equals("영업부"))
				//null항목도 있을수있기에 조건식을 하나 더걸어둔다.
			//if( data.getDept()==null)
			//=System.out.println(data.getDept());
				sum += emp[i].getAge();
				count++;
			emp[i].display();
			//null체크의 경우 비교연산자는 !=, ==만 가능하다.
			
		}
		System.out.printf("영업부 평균 급여 = %.2f", sum/count);
		System.out.println("== single인 사원 목록 ==");
		for(int i=0; i<emp.length; i++) {
			if( emp[i].isSingle()) {
				emp[i].display();
				//System.out.println(emp[i].isSingle());
			}
			
	}

	}
	
}

