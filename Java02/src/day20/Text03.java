package day20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Text03 {

	public static void main(String[] args) {
		Properties p = new Properties();
		
		try {
			p.load(new FileInputStream("c:\\lib\\DBinfo.txt"));//properties 파일 정보 불러오기~~
			String url = p.getProperty("url");
			System.out.println(url);
			
			String driver = p.getProperty("driver");
			System.out.println(driver);
			
			String user =  p.getProperty("user");
			System.out.println(user);
			
			String pw =  p.getProperty("pw");
			System.out.println(pw);
			
			
			p.setProperty("jdkver", "1.8");
			p.setProperty("oraclever", "11g");
			p.setProperty("tocatver", "9");
			
			//xml로 저장
			p.storeToXML(new FileOutputStream("data.xml"), "DB_Info");
			
			
		} catch (FileNotFoundException e) {
			System.out.println("DBinfo.txt파일을 준비해주세요.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		System.out.println(" main end ");
	}

}
