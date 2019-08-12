package day19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Test05_1 {

	public static void main(String[] args) {
		Map<String, Command> map = new HashMap<String, Command>();
		map.put("insert",new InsertCommand());
		map.put("delete",new DeleteCommand());
		map.put("select",new SelectCommand());
		map.put("update",new UpdatdCommand());
		map.put("new",new Command() {
			
			@Override
			public void exec() {
				System.out.println(" 기능추가 ");
			}
		}
		);
		

	Scanner scanner = new Scanner(System.in);
	System.out.println("delete update select insert 중 하나를 입력해주세요");
	String cmd = scanner.nextLine(); 
	Command command  = map.get(cmd);
	if(command != null) command.exec();//다른값입력시 실행제어
	
//	map.get(cmd).exec();

	

	
	}

}
