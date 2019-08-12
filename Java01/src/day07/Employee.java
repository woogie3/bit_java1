package day07;

public class Employee {

	private String name;
	private String dept;
	private boolean single;
	public Employee() {
		//초기화작업을 주로한다.
		
		System.out.println("Employee() call");
		//객체생성호출시 출력됨
		name = "사원이름";
		dept = "oo부서";
		single = true;
		
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
		System.out.printf("[이름: %s,부서 %s, 결혼유무: %b]%n",name,dept,single);
	}
	
}