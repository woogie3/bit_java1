package day19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test02 {//맵구조의 장점은 키를 매우 빠르게 찾을수있다.

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();//키와밸류는오브젝트의 영향을받는다.
		map.put("java01", "1234");
		map.put("java02", "1234");
		map.put("admin", "admin");
		map.put("test01", "test");//데이터담기
		for (int i = 0; i<30; i++) {
			map.put("test"+i, (int)(Math.random()*10)+"aa");
			
			
		}
		System.out.println(map);
		System.out.println("admin=>p/W? "+map.get("admin"));//특정key에 대한 value호출
		System.out.println("test01=>p/W? "+map.get("test01"));//특정key에 대한 value호출
		System.out.println("test09=>p/W? "+map.get("test09"));//특정key에 대한 value호출
		System.out.println("java09=>p/W? "+map.get("java09"));//특정key에 대한 value호출
	
		System.out.println("===========================================");
		Set<String> keynames =  map.keySet(); //key이름만 뽑는 메소드
		Iterator<String> it = keynames.iterator();
		while (it.hasNext()) {
			String key = it.next();
			System.out.println("ID : "+key+" ,PW : "+map.get(key));
			
		}

	}

}
