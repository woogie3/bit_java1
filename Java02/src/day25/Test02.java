package day25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.net.URL;

public class Test02 {

	public static void main(String[] args) {
		//기본적으로 대부분의 홈페이지들의 첫화면은 도메인끝에  /index.html이 붙는다.
		
		URL url = null;
		String address = "https://www.naver.com/index.html";
		String line = null;
		
//		FileWriter fw = null; //파일저장
		
		BufferedReader br = null; //버퍼안에정보 읽기
		BufferedWriter bw = null; //버퍼정보 쓰기
		
		try {
			url = new URL(address);//url객체생성
			br = new BufferedReader (new InputStreamReader(url.openStream()));//데이터를 읽어오게 스트림을 사용하고 스트림정보를 열어낸다.
//			fw = new FileWriter("c:\\lib\\bookMarks.txt");
			bw = new BufferedWriter(new FileWriter("naver.html"));
			
			while((line = br.readLine())!= null) {
				System.out.println(line);
				bw.write(line+"\n");
//				fw.write(line+"\n");
			}
//			bw = new BufferedWriter(fw);
			bw.flush();
			
		} catch (Exception e) {
			
		}finally {
			try {
				if(br!=null)br.close();
				if(bw!=null)bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
		
		
					
			
	
		
	}
	



