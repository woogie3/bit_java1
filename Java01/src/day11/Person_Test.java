package day11;

import day10.Employee;
import day10.Person;
import day10.Student;

public class Person_Test {

	public static void main(String[] args) {
		Student student = new Student("홍길동 ",20,200201);
		student.print();
		Teacher teacher = new Teacher("이순신",30,"JAVA");
		teacher.print();
		Employee employee = new Employee("유관순",40,"교무과");
		employee.print();
		Person person = new Person();

	}

}
