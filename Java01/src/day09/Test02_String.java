package day09;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Test02_String {

	public static void main(String[] args) {
		String msg = "Java programming/23000";
		System.out.println(msg.indexOf("/"));
		
		String d1 = msg.substring(0,msg.indexOf("/"));//Java programming
		String d2 = msg.substring(msg.indexOf("/")+1);//23000
		
		System.out.println(msg.substring(msg.indexOf("/")+1));
		
		System.out.println(d1);
		System.out.println(d2);
		
		String url = "http://127.0.0.1:8080/web1/list.do";
		System.out.println(url.indexOf('/'));
		System.out.println(url.lastIndexOf('/'));
		System.out.println(url.substring(url.lastIndexOf('/')));
		//url.substring(url.indexOf('/'));
		
		System.out.println(url.contains("web1"));
		
		String data = "20190001_홍길동/ 90_ 70/100";
		System.out.println(data);
		System.out.println(data.replace('_', '/'));//-> replace는 데이터가 가르키는곳에 가서 _가 /로 바꾼값을 리턴한다.
		System.out.println(data);
		
		String[] sdata = data.split("/");
		System.out.println(Arrays.deepToString(sdata));
		
		data = "20190001_홍길동/ 90_ 70/100";
		StringTokenizer st = new StringTokenizer(data,"/_");
		System.out.println(st.countTokens()); //->StringTokenizer는 문장을 쪼갤 때 사용한다. 
		
		while(st.hasMoreElements()) {
			System.out.print(st.nextToken()+"  ,  ");
			}
	}

}
