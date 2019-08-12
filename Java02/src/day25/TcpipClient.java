package day25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class TcpipClient {
	String serverIp = "127.0.0.1";//나의 주소 127.0.0.1
//	String severIp = "192.168.0.135";
	static final int port = 7777;
	Socket Csocket = null;
	BufferedReader br = null;
	BufferedWriter bw = null;
	Scanner keyboard = null;
	
	ObjectInputStream ois;
	ObjectOutputStream oos;
	String sendData;
	String receiveData;
	String name;
//	ReceiveDataThread rt = null;
	boolean endFlag = false;
	
	public void chatClient(String id, String ip) {
		name = id;
		serverIp = ip;
				
		try {
			System.out.println(serverIp+" 연결 시도 하겠습니다.");
			Csocket = new Socket(serverIp,7777);//서버IP로 연결시도
			System.out.println("서버와 연결이 되었습니다.");
			br = new BufferedReader(new InputStreamReader(System.in));
			ois = new ObjectInputStream(Csocket.getInputStream());
			oos = new ObjectOutputStream(Csocket.getOutputStream());
			
			oos.writeObject(name);
			oos.flush();
			
//			rt = new ReceiveDataThread(Csocket,ois);
//			Thread t = new Thread(rt);
//			t.start();
			
//			bw = new BufferedWriter(new OutputStreamWriter(Csocket.getOutputStream()));
//			br = new BufferedReader(new InputStreamReader(Csocket.getInputStream()));
			//해당 IP서버에서 정보를 가져와 읽는다.
			
			
			bw.write("김지욱"+"\n");
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
				if(Csocket!=null)Csocket.close();
				if(br!=null)br.close();
				if(bw!=null)bw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
