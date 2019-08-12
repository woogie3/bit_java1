package day19;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		//Map구조로 설계
		Command delete = new DeleteCommand();
		Command update = new UpdatdCommand();
		Command select = new SelectCommand();
		Command insert = new InsertCommand();

		Scanner scanner = new Scanner(System.in);
		System.out.println("delete update select insert 중 하나를 입력해주세요");
		String cmd = scanner.nextLine(); 
		
//		String cmd = args[0];//delete update select insert 중 하나를 입력받는다. 
		
		switch (cmd) {
		case "insert":
			insert.exec();
			break;
		case "delete":
			delete.exec();
			break;
		case "update":
			update.exec();
			break;
		case "select":
			select.exec();
			break;

		default:
			break;
		}

	}

}
