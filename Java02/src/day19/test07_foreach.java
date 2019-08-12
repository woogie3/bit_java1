package day19;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class test07_foreach {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(2017002,"김씨","마케팅부"));
		list.add(new Employee(2017003,"박씨","경영부"));
		list.add(new Employee(2017004,"고씨","인사부"));
		list.add(new Employee(2017005,"이씨","회계부"));
		list.add(new Employee(2017026,"최씨","기획부"));
		list.add(new Employee(2017017,"박씨","영업부"));
		
		//iterator 기반 목록
		System.out.println("*** iterator 기반 목록 출력 ***");
		Iterator<Employee>it = list.iterator();
		while (it.hasNext()) {
			Employee data =  it.next();
			System.out.println(data);
		}
		System.out.println();
		
		//foreach 기반목록
		System.out.println("*** foreach 기반 목록출력 ***");
		list.forEach(new Consumer<Employee>() {

			@Override
			public void accept(Employee t) {
				System.out.println(t);
				
			}});
		
		//foreach 람다로 표현 1
		System.out.println("**** foreach -> 람다1 ****");
		list.forEach(
				(Employee t) -> {
			    System.out.println(t);
			});
		
		//foreach 람다로 표현 2
				System.out.println("**** foreach -> 람다2 ****");
				list.forEach(t -> System.out.println(t));
		
		//foreach 람다로 표현 3
		System.out.println("**** foreach -> 람다3 ****");
		list.forEach(System.out :: println);
				
				
		
	}

}
