package day22;

import java.io.File;
import java.sql.Date;
import java.util.Arrays;

public class Test01 {

	public static void main(String[] args) {
		File dir = new File("c:\\");
		String[] list = dir.list();//string 배열
		System.out.println(Arrays.toString(list));
		System.out.println("--------------------------------");
		
		File file = null;
		Date date = null;
		for(String data : list) {
			file = new File(dir,data); 
			System.out.print(file.getName()+"\t");//파일명
			System.out.print(file.length()+"\t");//파일길이
			date = new Date(file.lastModified());//마지막수정날짜
			System.out.print(date+"\t");
			
			if (file.isDirectory()) System.out.println("<dir>");
			System.out.println();
			
		}
	}

}
