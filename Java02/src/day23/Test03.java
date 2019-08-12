package day23;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class Test03 {

	public static void main(String[] args) {
		String fileName = "data.obj";
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(fileName);
			oos = new ObjectOutputStream(fos);
			
			String name = "홍길동";
			Date d = new Date();
			oos.writeObject(name);
			oos.flush();
			oos.writeObject(d);
			oos.flush();
			System.out.println("파일에 저장되었습니다.");
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		
		}finally {
			try {
				if(oos != null)oos.close();
				if(fos != null)fos.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
		}
		
		
	System.out.println("=======  main end ========");	
	}

}
//String fileName = "data.obj";
//FileOutputStream fos = null;
//ObjectOutputStream oos = null;
//try {
//	
//} catch (Exception e) {
//	System.out.println(e.getMessage());
//
//}finally {
//	try {
//		if(oos != null)oos.close();
//		if(fos != null)fos.close();
//	} catch (Exception e2) {
//		e2.printStackTrace();
//	}
//	
//}
//
//
//
