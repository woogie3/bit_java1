package day23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test01 {

	public static void main(String[] args) {
//		System.in byte타입을받는다.
		InputStreamReader ir = new InputStreamReader(System.in);//byte타입을 char타입으로 변환해줌
		BufferedReader br = new BufferedReader(ir);
		
		String s = null;
		try {
			while((s = br.readLine())!=null) {
				System.out.println("keyboard input data => "+s);
				
			}
		} catch (IOException e) {
			
		} finally {
			try {
				if(br != null)
				br.close();
				if(ir != null)
				ir.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		
		
		
	}

}
