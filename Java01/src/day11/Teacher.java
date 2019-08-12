package day11;

import day10.Person;

public class Teacher extends Person{
	private String name;
	private int age;
	private String subject;

	public Teacher() {
		super();
	}
	public Teacher(String name, int age, String subject) {
		super();
		this.name = name;
		this.age = age;
		this.subject = subject;
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
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public void print() {
		System.out.printf("[이름:%10s 나이:%10d 담당과목:%10s]%n",this.name,this.age,this.subject);
	}

}
