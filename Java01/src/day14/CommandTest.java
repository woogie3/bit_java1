package day14;

import javax.swing.JOptionPane;

public class CommandTest {

	public static void main(String[] args) {
		Command cmd = new ListCommand();
		//cmd의 초기값을 List로 두었다.
		String key = JOptionPane.showInputDialog("List/delete/insert/update  중 하나 입력");
		//key는 "List/delete/insert/update " 중의 하나를 입력받게 한다.
		switch (key) {
		case "delete":
			cmd = new DeleteCommand();
			break;
		case "insert":
			cmd = new InsertCommand();
			break;
		case "update":
			cmd = new UpdateCommand();
			break;

		default:
			cmd = new ListCommand();
			break;
		}
		cmd.exec();//switch문을 이용해 선택한 메소드 실행
		cmd.check();

	}

}
