package day11_ex;

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
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public void print() {
		super.printA();//부모쪽 메소드를 호출
		System.out.printf("학번  : %s %n", id);
	}

}
