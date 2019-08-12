package day23;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

public class Test05 {

	public static void main(String[] args) {
		String fileName = "account.obj";
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(fileName);
			oos = new ObjectOutputStream(fos);
			
			Set<Account> set = new HashSet<Account>();
			
			Account a  = new Account("2019-001","홍길동",100,"1234");
			Account b  = new Account("2019-002","김길동",200,"4321");
			set.add(a); //set을 설정함으로 중복필터됨
			set.add(b);
			set.add(a);
			set.add(new Account("2019-002","길동",200,"99"));
			
			oos.writeObject(set);
			oos.flush();
			System.out.println("저장되었습니다.");
			
			
			
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
class Account extends Object implements Serializable {//읽고 구현하기 위해 객체를 스트림에 통과할수있게 능력을 갖추게함, serializable은 직렬화하는 인터페이스
	String number;
	String name;
	int money;
	transient String pw;//stream을 통과하지못하게 설정
	
	public Account() {}

	public Account(String number, String name, int money, String pw) {
		super();
		this.number = number;
		this.name = name;
		this.money = money;
		this.pw = pw;
	}

	@Override
	public String toString() {
		return "Account [number=" + number + ", name=" + name + ", money=" + money + ", pw=" + pw + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + money;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		result = prime * result + ((pw == null) ? 0 : pw.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (money != other.money)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		if (pw == null) {
			if (other.pw != null)
				return false;
		} else if (!pw.equals(other.pw))
			return false;
		return true;
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
