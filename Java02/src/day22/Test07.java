package day22;

import java.io.FileReader;
import java.util.Properties;

public class Test07 {

	public static void main(String[] args) {
		//DBinfo로 부터 user, pw 정보 추출하기
		FileReader fr= null;
		Properties prop = new Properties();
		
		try {
			fr = new FileReader("c://lib//DBinfo.txt");
			prop.load(fr);
			String id = prop.getProperty("user");
			String pw = prop.getProperty("pw");
			System.out.println("로그인시도 "+id+" / "+pw);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			}
		}
		
	}


