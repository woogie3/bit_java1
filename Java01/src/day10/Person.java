package day10;

public class Person {
	private String name;
	private int age;
		
	public Person() {
		super();
	}	//기본생성자를 만들어야함. 그래야 다른클래스에서 에러가 발생하지않는다.
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

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
	public void printA() {
		System.out.printf("이름 : %s, 나이 : %2d ",this.name,this.age);
	}

}
