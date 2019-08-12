package day25_ex;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class TcpIpServer {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
        List<BufferedWriter> clientList = new ArrayList<BufferedWriter>();
		try {
		   	serverSocket = new ServerSocket(7777);
		   	System.out.println("서버가 준비 되었습니다.");
		} catch (Exception e) {
             e.printStackTrace();
		}

		while (true) {
			

			try {
				System.out.println("Client 요청을 기다립니다.");
				Socket socket = serverSocket.accept(); // 기다리고 있는 구문 
				new ServerThread(socket, clientList).start();
				
			} catch (Exception e) {
                e.printStackTrace();
			}
			}
		}
		
	}


class ServerThread extends Thread{
	BufferedReader br = null;
    BufferedWriter bw = null;
    Socket socket = null;
    String name = null;
    List<BufferedWriter> clientList = null;
	
	public ServerThread(Socket socket, List<BufferedWriter> clientList) {
		super();
		this.socket = socket;
		this.clientList = clientList;
		try {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			clientList.add(bw);
			
			name = br.readLine(); //buffer의 정보를 받아 읽어낸다.
			 bw.write("Hello ~~~"+name +"님 \n"); //그 정보에서 name을 받아와 출력
             bw.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
		}
		
	}




	@Override
	public void run() {
		String msg = null;
		try {
			while ((msg = br.readLine()) != null) {
			broadcast(msg);
			if(msg.equals("q")) {
				broadcast("퇴장합니다.");
			}
			}
		} catch (Exception e) {
			
		}finally{
			try {
			if(br != null) br.close();
			if(bw != null) {
				clientList.remove(bw);
				bw.close();
			}
			if(socket != null) socket.close();
			
			
		} catch (Exception e2) {
            e2.printStackTrace();
		}
		}
		}
	
	private synchronized void broadcast(String msg) {
		clientList.forEach(bw->{  
			try {
				bw.write(name+" : "+msg+"\n");
				bw.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		});
		
	}
	}
	

