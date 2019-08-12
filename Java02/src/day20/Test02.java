package day20;

import java.util.Iterator;
import java.util.Properties;

public class Test02 {

	public static void main(String[] args) {
		Properties p = new Properties();//보통 일반적을 스트링만 다룬다. DB연동시 환경설정파일(.properties) 불러올때 사용!!!
		p.setProperty("java01", "1324");
		p.setProperty("java02", "1224");
		p.setProperty("java03", "1214");
		p.setProperty("java05", "1334");
		p.setProperty("java06", "1114");
		p.setProperty("java07", "2224");
		System.out.println(p.getProperty("java02")); 
		
		Iterator<Object> it = p.keySet().iterator();
		while (it.hasNext()) {
			String key = (String) it.next();
			System.out.println(key +" : "+p.getProperty(key));
			
		}
		
		
	}

}
