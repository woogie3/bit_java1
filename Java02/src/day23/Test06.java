package day23;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class Test06 {

	public static void main(String[] args) {
		String fileName = "account.obj";
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream(fileName);
			ois = new ObjectInputStream(fis);
			
			System.out.println("==Data Object Read==");
			Set<Account> a1 = (Set<Account>) ois.readObject();
			
			a1.forEach(i->System.out.println(i));
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		
		}finally {
			try {
				if(ois != null)ois.close();
				if(fis != null)fis.close();
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
