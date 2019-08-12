package day10;

public class Student extends Person {
	private String name;
	private int age;
	private int id;
	
	public Student() {	}

	public Student(String name, int age, int id) {
		super(name,age);
		this.id = id;
	}
	
//-----------------생성자함수-------------------------
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void print() {
		super.printA();//부모쪽 메소드를 호출
		System.out.printf("학번  : %s %n", id);
	}

}
