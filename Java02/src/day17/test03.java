package day17;

import java.util.List;
import java.util.Vector;
import java.util.ArrayList;
import java.util.Date;

public class test03 {

	public static void main(String[] args) {

//		List list = new ArrayList();// Object[]의 배열로 관리됨
		List list = new Vector();// Object[]의 배열로 관리됨
		list.add("hello");
		list.add("java");
		list.add(200);
		list.add(new Date());
		list.add(new Book("Spring",9000));
		
		System.out.println(list);
		
		for(int i=0; i < list.size();i++) {
		System.out.println(list.get(0));// Object
		System.out.println(list.get(1));// Object
		System.out.println(list.get(2));// Object
		System.out.println(list.get(3));// Object
		System.out.println(list.get(4));// Object
		}
		
		
	}

}
