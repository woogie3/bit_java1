package day23_ex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import day23_ex.Book;

public class BookMgr {
	//배열관리
	private static List<Book> list = new ArrayList<Book>();
	
	BookMgr() {	List<Book> list;}
	BookMgr(List<Book> list) {
		this.list = list;
		
		}
	
	
	public List<Book> getList() {
		return list;
	}
	public void setList(List<Book> list) {
		this.list = list;
	}
	//CURD
	public boolean add(Book book) {
		return list.add(book);
	}
	public List<Book> getBookList() {
		return list;
	}
	public void deleteBooks(String title) {
		Iterator<Book> it = list.iterator();
		while (it.hasNext()) {
			Book data = it.next();
			if (data.getTitle().equals(title)) {
				it.remove();
				return;
			}
		}System.out.println(title + " 도서가 없습니다.");
	}
	public List<Book> searchBooklist(String title) {
		List<Book> slist	= new ArrayList<Book>();
		Iterator<Book> it = list.iterator();
		while (it.hasNext()) {
			Book data = it.next();
			if (data.getTitle().toUpperCase().contains(title.toUpperCase())) {
				slist.add(data);
			}
		}
		return slist;
	}
	
	public synchronized static Object load()  {
		String fileName = "c:\\lib\\book1.dat";
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		Object data = null;
		try {
			fis = new FileInputStream(fileName);
			ois = new ObjectInputStream(fis);
			try {
				data = ois.readObject();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			System.out.println(fileName+" 파일로부터"+data+" Load 완료");
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
				try {
					if(ois != null)ois.close();
					if(fis != null)fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
		} return data;
		
		
		
		
		
		
	}
public synchronized static void save()  {
		String fileName = "c:\\lib\\book1.dat";
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(fileName);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(list);
			oos.flush();
			System.out.println("객체가 "+fileName+"file에 저장되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
				try {
					if(oos != null)oos.close();
					if(fos != null)fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}
	

	
}
