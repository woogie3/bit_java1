package day03;
import java.util.*;
public class bookApp {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String cmd = null;

		while(true){
			System.out.println("******* 명령  선택 *********");
			System.out.println("1. insert(등록)");
			System.out.println("2. delete(삭제)");
			System.out.println("3. update(수정)");
			System.out.println("4. quit(종료)");
			System.out.println("*************************");
			System.out.println("수행 할 명령을 선택하세요");
			System.out.println("1 2 3 4 중 하나를 입력하세요.._");
		
		 	 cmd = sc.nextLine();
		 	switch (cmd){//->switch (cmd.trim()) , 이기능은 문자열의 공백제거
		 	case "1":
		 		System.out.println("등록작업을 수행하는 기능 호출");
		 		break;
		 	case "2":
		 		System.out.println("삭제작업을 수행하는 기능 호출");
		 		break;
		 	case "3":
		 		System.out.println("수정 작업을 수행하는 기능 호출");
		 		break;
		 	case "4":
		    	System.out.println("정말 종료하시겠습니까? 종료를 원하시면 q/Q를 입력하세요");
		    	String quit = sc.nextLine().trim();
		    	if(quit.equals("q")||quit.equals("Q")){ // ".equals"를 사용한다. 기본형을 정해야하므로
		     	System.out.println("App 종료");
		     	sc.close();
		     	sc = null;
		     	System.exit(0);
		     	break;
		    	}
		    default:
		    	System.out.println("1, 2, 3, 4 중 하나를 입력하세요.._");
		    	break;
		    }
		 		 			
		 	System.out.println("===================================");
		 	}
 	}

	}
	


	/*
		System.out.println("******* 명령  선택 *********");
		System.out.println("1. insert(등록)");
		System.out.println("2. delete(삭제)");
		System.out.println("3. update(수정)");
		System.out.println("4. quit(종료)");
		System.out.println("*************************");
		System.out.println("수행 할 명령을 선택하세요");
		System.out.println("1 2 3 4 중 하나를 입력하세요.._");
		
		Scanner input = new Scanner(System.in);
		int menu;
		menu = input.nextInt();
				
		do {
			if(menu == 1) {
				System.out.println("등록 작업을 수행합니다.");
				
			}else if(menu == 2) {
				System.out.println("삭제 작업을 수행합니다.");
			}else if(menu == 3) {
				System.out.println("수정 작업을 수행합니다.");
			}else if(menu == 4) {
					break;
			}else {
				System.out.println("다시 입력해주세요.");
			}
			
			System.out.println("******* 명령  선택 *********");
			System.out.println("1. insert(등록)");
			System.out.println("2. delete(삭제)");
			System.out.println("3. update(수정)");
			System.out.println("4. quit(종료)");
			System.out.println("*************************");
			System.out.println("수행 할 명령을 선택하세요");
			System.out.println("1 2 3 4 중 하나를 입력하세요.._"+menu);
			menu = input.nextInt();
		}while(menu != 4);
		System.out.println("종료 작업을 수행합니다.");

		input.close();
		input = null;

	}

}
	 */