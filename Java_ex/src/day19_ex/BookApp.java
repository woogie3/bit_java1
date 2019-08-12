package day19_ex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class BookApp {

	public static void main(String[] args) {
		
		BookMgr mgr = new BookMgr();
				
		Scanner sc = new Scanner(System.in);
		String cmd = null;
		int ISBN=1;
		while (true) {
			
			System.out.println("*******  명령 선택   *********");
			System.out.println("1. insert(등록) \n");
			System.out.println("2. delete(삭제) \n");
			System.out.println("3. 목록출력 \n");
			System.out.println("4. search(검색) \n");
			System.out.println("5. quit(종료) \n");
			System.out.println("************************* \n\n");
			System.out.println("수행할 명령을 선택하세요");
			System.out.println("1 2 3 4 5 중 하나를 선택하세요");
			
			cmd = sc.nextLine().trim(); 
		
			
			switch (cmd) { 
			case "1":
				System.out.println("insert 등록 작업을 수행하는 기능 호출");
				System.out.println("Book title 입력하세요");				
				String title = sc.nextLine();
				System.out.println("Book의 가격 입력하세요");				
				int price = sc.nextInt();
				sc.nextLine();
				mgr.addBook(new Book(ISBN++,title,price));
				break;
			case "2":
				System.out.println("delete 삭제 작업을 수행하는 기능 호출");
				System.out.print("책 제목을 입력하세요 : ");
				title = sc.nextLine();
				mgr.deleteBooks(title);
				break;	
			case "3":
				System.out.println("list 목록 출력 작업을 수행하는 기능 호출");
				mgr.bookListPrint();
				break;	
			case "4":
				System.out.println("search 검색 작업을 수행하는 기능 호출");
				System.out.print("키워드를 입력하세요 : ");
				title = sc.nextLine().trim();
				System.out.println("===============찾으신 책목록===============");
				mgr.searchBookList(title);
				break;	
			case "5":
				System.out.println("정말 종료하려면 q/Q를 입력하세요");
				String quit = sc.nextLine().trim();
				if(quit.equals("q") || quit.equals("Q")) {
					System.out.println("App 종료");
					sc.close();					
					sc=null;
					System.exit(0); 
				}			
				break;
				
			
			default:
				System.out.println("다시 입력하세요 _");
				break;
			}
			System.out.println("=====================================");

	}
	
	}
}