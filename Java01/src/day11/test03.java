package day11;
import day10.*;
public class test03 {
	public static void main(String[] args) {
		//is a관계 Student, Employee, Teacher는 Person이다
		Person p = new Person("고길동",22);//p는 downcasting 불가능
		
		Person s = new Student("홍길동", 20, 2019001);//s는 Student에 Person(부모)가 있어서 다운캐스팅가능
		Employee e = new Employee("유관순", 20, "교무과");
		Object o = new Teacher("이순신", 20, "JAVA");
		Object msg = new String("hello java");
		
		
	}

}
