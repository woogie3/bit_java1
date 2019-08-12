package day04;
import java.util.Scanner;

public class bookApp {

 

	public static void main(String[] args) {

		

		Scanner sc = new Scanner(System.in);

		String cmd = null;

		while (true) {

			

			System.out.println("*******  명령 선택   *********");

			System.out.println("1. insert(등록)");

			System.out.println("2. delete(삭제)");

			System.out.println("3. update(수정)");

			System.out.println("4. quit(종료)");

			System.out.println("************************* \n\n");

			System.out.println("수행할 명령을 선택하세요");

			System.out.println("1 2 3 4중 하나를 선택하세요");

			

			//cmd = sc.nextInt()+""; // int+""은 입력값이 String으로 바뀜

			//sc.nextLine(); 

			cmd = sc.nextLine().trim(); // trim공백제거  

			

			switch (cmd) { // cmd뒤에.trim() 넣어도됨

			case "1":

				System.out.println("insert 등록 작업을 수행하는 기능 호출");

				break;

			case "2":

				System.out.println("delete 삭제 작업을 수행하는 기능 호출");

				break;	

			case "3":

				System.out.println("update 수정 작업을 수행하는 기능 호출");

				break;

			case "4":

				System.out.println("정말 종료하려면 q/Q를 입력하세요");

				String quit = sc.nextLine().trim();

				if(quit.equals("q") || quit.equals("Q")) {

					System.out.println("App 종료");

					sc.close();

					sc=null;

				}				

				//return; // 현재의 함수 종료 의미

				//System.exit(0); // App 종료

			default:

				System.out.println("다시 입력하세요 _");

				break;

			}

			System.out.println("=====================================");

		}

	}

 

}
/*import java.util.*;
public class bookApp{
	
	public static void main(String[] args) {
		
	whiㅣe(true) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("******* 명령  선택 *********");
	System.out.println("1. insert(등록)");
	System.out.println("2. delete(삭제)");
	System.out.println("3. update(수정)");
	System.out.println("4. quit(종료)");
	System.out.println("*************************");
	System.out.println("수행 할 명령을 선택하세요");
	System.out.println("1 2 3 4 중 하나를 입력하세요.._");
	
 	String cmd = scanner.nextLine();
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
    	String quit = scanner.nextLine().trim();
    	if(quit.equals("q")||quit.equals("Q")) // ".equals"를 사용한다. 기본형을 정해야하므로
     	System.out.println("App 종료");
     	scanner.close();
     	scanner=null;
     	System.exit(0);
     	break;
    	}
    default:
    	System.out.println("1, 2, 3, 4 중 하나를 입력하세요.._");
    	break;
    	}
 	}
}
	
*/
