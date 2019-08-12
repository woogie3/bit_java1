package day15;

public class Test04 {

	public static void main(String[] args) {

		Command cmd = new DeleteCommand();//바인딩의 여부에따라 실행되는 작업이다름
		cmd.exec();
		cmd = new UpdateCommand();
		cmd.exec();
			
		

	}

}
