package day06;
/*
public class Employee { 
	//데이터(변수)+기능(메소드)
	public String name;
	public String dept;
	public int age; //201901
    	/* 다른패키지에서 이 영역들은 사용하려면 public이 선언되야만 사용할수있다.
	       Employee emp3 = new Employee();
		   emp3.number = 201902;
	       emp3.name = "고길동";
	       emp3.dept = "영업부";
	   */
/*
	public void display() {//새로운 함수생성
						   //void란 그냥 돌아가는것 즉, return했을때 값을 가지고 돌아가면 안된다.
		System.out.printf("[나이:%10s,이름:%-10s,부서:%10s]%n" ,this.age, this.name, this.dept); 
		return;
		
	}
}
*/



  /**
 * @author user
 *
 */
public class Employee { 
	//데이터(변수)+기능(메소드)
	private String name;    //private는 데이터 히든, 즉 데이터를 보호, 즉 접근영역이 가장 작음
	private String dept;
	private int age; //201901
	private boolean single;
	
    	/* 다른패키지에서 이 영역들은 사용하려면 public이 선언되야만 사용할수있다.
	       Employee emp3 = new Employee();
		   emp3.number = 201902;
	       emp3.name = "고길동";
	       emp3.dept = "영업부";
	   */
	
	public void display() {//새로운 함수생성
						   //void란 그냥 돌아가는것 즉, return했을때 값을 가지고 돌아가면 안된다.
		System.out.printf("[나이:%10s,이름:%-10s,부서:%10s,결혼유무:%b]%n" ,this.age, this.name, this.dept, this.single); 
		return;
		
	}

  
  	public void setAge(int age) {
  		if(age<0 && age <=100) {
  			System.out.println("age(나이) 정보가 올바르지 X");
  			return;
  		}
  		this.age = age;
  		return;
  	}
  	public int getAge() {
  		return age;
  	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDept() {
		return dept;
	}


	public void setDept(String dept) {
		this.dept = dept;
	}


	public boolean isSingle() {//boolean형은 get형태대신 is형태로 생성된다
		return single;
	}


	public void setSingle(boolean single) {
		this.single = single;
	}
	
	
  }
//private사용시 무조건 setter와 getter 무조건 사용하자~~~
  	
  /*	public void setDept(String dept) {
  		if(dept == null) {
  			System.out.println("dept(부서) 정보가 올바르지 X");
  			return;
  		
  	}
  		this.dept = dept;
  		return;
  		
  	}
  	public String getDept() {
  		return dept;
  	}

  }
  */

/*
 * encapsulation이란, 관련있는 자료, 동작들을 하나로 묶어 요약하고 사용자에게 내부적인 접근을 허용하지 않는 대신 편의성 제공
 * set,get 기능 설정
 * 
 */

