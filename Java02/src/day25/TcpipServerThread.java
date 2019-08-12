package day25;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.HashMap;

public class TcpipServerThread implements Runnable{
	Socket socket;
	ObjectOutputStream oos;
	ObjectInputStream ois;
	String name;
	HashMap<String, ObjectOutputStream> hm;
	
	
	public TcpipServerThread(Socket s, HashMap hm) {
		socket = s;
		this.hm = hm;
		try {
			System.out.println(socket.getInetAddress()+" 로 부터 연결요청받음");
			ois = new ObjectInputStream(socket.getInputStream());
			oos = new ObjectOutputStream(socket.getOutputStream());
			name = (String)ois.readObject();
			broadcast(name+" 님이 접속하셨습니다.");
			System.out.println("접속한 유저는 "+name+" 입니다.");
			synchronized (hm) {
				hm.put(name, oos);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	
}
	public void run() {
		String receiveData;
		try {
			while(true) {
				receiveData = (String)ois.readObject();
				if(receiveData.equals("/quit"))
					break;
				else if (receiveData.indexOf("/to") > -1) {
					sendMsg(receiveData);
				}else
						broadcast(name+" : "+receiveData);
					
				}
			
		} catch (Exception e) {
			System.out.println("Client 강제종료");
		}finally {
			synchronized (hm) {
				hm.remove(name);
				
			}
			broadcast(name+"님이 나가셨습니다.");
			System.out.println(name+"님이 나가셨습니다.");
			try {
				if(socket!=null)socket.close();
			} catch (Exception e) {
			}
			
		}
	}
	public void broadcast(String message) {
		synchronized (hm) {
			try {
				for(ObjectOutputStream oos:hm.values()) {
					oos.writeObject(message);
					oos.flush();
				}
			} catch (IOException e) {
			}
			
		}
		
	}
	public void sendMsg(String message) {
		int begin = message.indexOf("")+1;
		int end = message.indexOf("",begin);
		
		if(end != -1) {
			String id = message.substring(begin,end);
			String msg = message.substring(end+1);
			ObjectOutputStream oos = hm.get(id);
			try {
				if(oos != null) {
					oos.writeObject(id + " 님이 메세지를 보내셨습니다. : "+msg);
					oos.flush();
				}
			} catch (IOException e) {
			}
		}
		
	}

}
