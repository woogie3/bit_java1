package day07;

public class Animal {
	private boolean live;
	private int age;
	private String name;
	
	
	public boolean isLive() {
		return live;
	}
	public void setLive(boolean live) {
		this.live = live;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void print() {
		System.out.printf("이름 : %s, 나이 : %s, 생존여부 : %b %n",name, age, live);
	}
	
}
//private 처리하고 setter,getter메소드 처리하는 것을 캡슐화라고 한다.
