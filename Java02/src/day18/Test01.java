package day18;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;




public class Test01 {

	public static void main(String[] args) {
		String[] names1 = {"이순신","김순신","박순신","강순신"};
		System.out.println(Arrays.toString(names1));
		Arrays.sort(names1); // 배열 sort
		System.out.println(Arrays.toString(names1));
		
//		String[] names1 = new String[100];
		int index = 0;
		
		
		System.out.println("============================");
		List<String> list = new ArrayList<String>();
		list.add("김길동");
		list.add("고길동");
		list.add("홍길동");
		list.add("최길동");
		list.add("박길동");
		list.add("이길동");
		
		System.out.println(list);
		Collections.sort(list);//Collect sort 수행
		System.out.println(list);
		List<String> list2 = new ArrayList<String>(list.subList(1,4));
		System.out.println(list2);
		
		
		//=> List -> Array
		Object[] obj = list.toArray();
		System.out.println("obj => "+Arrays.toString(obj));//object[] type
		
		String[] obj2 = new String[list.size()];
		list.toArray(obj2);
		System.out.println("obj2 => "+Arrays.toString(obj2));//string[] type
		
		String[] sss = {"111","9999","777","333"};
		List<String> sslist = new ArrayList<String>(Arrays.asList(sss));//ArrayList로 전환
		System.out.println(sslist);
		
		System.out.println("=== list 다루기 ===");
		System.out.println(list);
		System.out.println(list.contains("이길동"));//내용포함되있는지 확인하는법(T/F)
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).charAt(0)+"**");//전통적인 순회방식
		}//set타입에는 부적절함
		for(String data : list) {
			System.out.print(data+"  ");
			
		}
		System.out.println();
		
		
		
		Iterator<String> it = list.iterator();//iterator를 사용해서 원하는 데이터를 삭제, 즉 배열의 위치를 별도로 받아오지않고 간단하게 삭제가 가능하다.
		while(it.hasNext()) {
			String data = it.next();
			if(data.equals("홍길동")){
				System.out.println("홍길동이 삭제되었습니다.");
				it.remove();
			}
		}
		System.out.println(list);
		
	}

}

















