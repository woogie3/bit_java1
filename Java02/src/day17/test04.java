package day17;

import java.util.ArrayList;
import java.util.List;

public class test04 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("hello");
		list.add("java");
//		list.add(new Date());//string타입만들어가서 안됨
		
		for(String data : list) {
			System.out.println(data.toUpperCase());
		}
		
		
		
		
		
	}

}
