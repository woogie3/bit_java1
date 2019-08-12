package day10_ex;

public class Employee extends Person{
	public Employee() {
		super();
	}
	public Employee(String name, int age, String dept) {
		super(name, age);
		this.dept = dept;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	private String dept;
	public void print() {
		super.printA();//부모쪽 메소드를 호출
		System.out.printf("담당부서  : %s %n", dept);
	}

}
