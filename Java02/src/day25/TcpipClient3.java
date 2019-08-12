package day25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class TcpipClient3 {

	public static void main(String[] args) {
		String severIp = "127.0.0.1";//나의 주소 127.0.0.1
//		String severIp = "192.168.0.135";
		BufferedReader br = null;
		BufferedWriter bw = null;
		Socket socket = null;
		Scanner keyboard = null;
		
		try {
			System.out.println(severIp+" 연결 시도 하겠습니다.");
			socket = new Socket(severIp,7777);//서버IP로 연결시도
			System.out.println("서버와 연결이 되었습니다.");

			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//해당 IP서버에서 정보를 가져와 읽는다.
			keyboard = new Scanner(System.in);
			
			bw.write("우기"+"\n");
			bw.flush();
			System.out.println(br.readLine());
			
			//메세지 쓰고 읽기
			while(true) {
				System.out.println("메세지 입력하세요..");
				String msg = keyboard.nextLine();
				bw.write(msg+"\n");
				bw.flush();
				System.out.println(br.readLine());
				if(msg.equals("q")) break;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(socket!=null)socket.close();
				if(br!=null)br.close();
				if(bw!=null)bw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
