package day25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Scanner;

public class TcpipServer {

	public static void main(String[] args) {
		HashMap<String, ObjectOutputStream> hm;
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(7777);
			System.out.println("서버 준비가 되었습니다.");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		hm = new HashMap<String, ObjectOutputStream>();
		while(true) {
			BufferedReader br = null;
			BufferedWriter bw = null;
			Socket socket = null;
			
			try {
				
				System.out.println("Client 요청을 기다립니다.");
//				System.out.println(socket.getInetAddress()+" 와 연결 중 입니다.");
				socket = serverSocket.accept();
				TcpipServerThread subThread = new TcpipServerThread(socket,hm);
				Thread t = new Thread(subThread);
				t.start();
				System.out.println("");
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
				
				String name = br.readLine();
				System.out.println("Hello~~~"+name+"님 \n");
				bw.write("Hello~~~"+name+"님 \n");//한줄의 끝을 알려주기위해 \n을 사용한다.
				bw.flush();
				
				//메세지 읽고 다시 보내기
				String msg = null;
				while((msg = br.readLine())!=null) {
					bw.write(name+" : "+msg+"\n");
					bw.flush();
//					System.out.println(name+" : "+msg);
				}
				
			} catch (Exception e) {
				e.printStackTrace(); //기다리고 있는 구문
				
			}finally {
				try {
					if(socket != null) socket.close();
					if(br != null) br.close();
					if(bw != null) bw.close();
				} catch (Exception e2) {
	                e2.printStackTrace();
	                System.exit(0);
				}
			}
			
		}
		
		
		
	}

}


