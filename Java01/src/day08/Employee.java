package day08;
//생성자함수 사용시 제한됨
public class Employee {
	
	static String cName = "BIT"; //static처리함
	private String name;
	private String dept;
	private boolean single;
	public Employee() {
		//초기화작업을 주로한다.
		
		//System.out.println("Employee() call");
		//객체생성호출시 출력됨
		//name = "사원이름";
		//dept = "oo부서";
		//single = true;
		this("사원이름","000 부서", true);//나와또다른 생성자함수를 호출
		
	}
	
	public Employee(String name, String dept) {//생성자함수는 리턴타입에대한 값을 묻지않음
		//System.out.printf("Employee(%s,%s) call%n",name, dept);
		//this.name = name;
		//this.dept = dept;
		
		this(name, dept, false);
		
	}
	
	public Employee(String name, String dept, Boolean single) {//생성자함수!!
		//System.out.printf("Employee(%s,%s, %s) call%n",name, dept, single);
		
		this.name = name;
		this.dept = dept;
		this.single = single;
		
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
	public boolean isSingle() {
		return single;
	}
	
	/**
	 * 
	 * @param single 미혼인지?
	 */
	public void setSingle(boolean single) {
		this.single = single;
	}
	/**
	 * 
	 * Employee 정보출력
	 */
	public void print() {
		System.out.println("회사명: "+cName);
		System.out.printf("[이름: %s,부서 %s, 결혼유무: %b]%n",name,dept,single);
	}
	
}
