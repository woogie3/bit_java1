package day25;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class test08 {

	public static void main(String[] args) {
		
		List<User> list = new ArrayList<User>();
		list.add(new User("홍길동","user01","1234","user"));
		list.add(new User("김동","admin","admin","admin"));
		
		Collections.sort(list);
		
		Iterator<User> it = list.iterator();
		while (it.hasNext()) {
			User data = it.next();
			System.out.println(data);
			
		}

	}

}
class User extends Object implements Comparable<User>,Serializable{
	String name;
	String id;
	String pw;
	String role;
	
	public User() {
		super();
	}

	public User(String name, String id, String pw, String role) {
		super();
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.role = role;
	}

		
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((pw == null) ? 0 : pw.hashCode());
		result = prime * result + ((role == null) ? 0 : role.hashCode());
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
		User other = (User) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pw == null) {
			if (other.pw != null)
				return false;
		} else if (!pw.equals(other.pw))
			return false;
		if (role == null) {
			if (other.role != null)
				return false;
		} else if (!role.equals(other.role))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + ", pw=" + pw + ", role=" + role + "]";
	}

	public int compareTo(User o) {
		return name.compareTo(o.name);
	}
	
	
}
