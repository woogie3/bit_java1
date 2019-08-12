package day20;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import day19.Employee;

public class test01 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(15);
		list.add(20);
		list.add(25);

		
		list.forEach(i -> System.out.println(i+"  "));
		System.out.println();
		list.removeIf(i->i%2==0);//람다로 표현한 간단한 삭제 조건식
		list.forEach(i -> System.out.println(i+"  "));
		System.out.println("\n----------------------------------------\n");
		
		List<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee(2017001,"홍길동","영업부"));
		emp.add(new Employee(2017002,"김길동","재무부"));
		emp.add(new Employee(2018001,"최길동","경영부"));
		emp.add(new Employee(2018031,"이길동","회계부"));
		emp.add(new Employee(2019101,"나길동","개발부"));
		
		System.out.println(emp.stream().filter(i->i.getNumber() > 2018001).count());//모든 컬렉션은 스트림화가능하다.
		emp.stream()
		.filter(i -> i.getNumber() > 2018001)
		.forEach(i->System.out.println(i));
		
		Employee[] e = {
				new Employee(2019101,"나길동","개발부"),
				new Employee(2017001,"홍길동","영업부"),
				new Employee(2017002,"김길동","재무부"),
				new Employee(2018031,"이길동","회계부"),
				new Employee(2017001,"홍길동","영업부"),
				
		};
		System.out.println("========Array stream 처리========");
		Stream.of(e)
		.filter(i -> i.getDept().equals("재무부"))
		.forEach(i->System.out.println(i+"\n"));
		// => 배열을 stream으로 변환후 인사부 사원만 추출하여 출력
		
		
		System.out.println("========Array stream 정렬화=======");
		Stream.of(e).sorted().forEach(i -> System.out.println(i));//sort로 정렬화시킴
		
		
		Stream.of(e).sorted(new Comparator<Employee>() {//comparator 공부!!!
		@Override
		public int compare(Employee o1, Employee o2) {
			return o1.getName().compareTo(o2.getName());
		}
		}
		).forEach(i->System.out.println(i)); 
		System.out.println("-----------------------------");
		Stream.of(e)
		.sorted((o1,o2) -> o1.getName().compareTo(o2.getName()))
		.forEach(i->System.out.println(i));
	}

}
