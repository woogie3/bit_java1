package day15;

import javax.swing.JOptionPane;

public class Test06 {//test05를 람다식으로

	public static void main(String[] args) {//람다식으로 작성하려면 인터페이스에 추상메소드가 하나만 있어야 가능
		String msg = JOptionPane.showInputDialog("1.list 2.update 3.insert 4.delete");
		//람다 => 변수에 함수를 등록하여 사용하는 기능
		Command list = () -> System.out.println("*** list ****");
		
		Command update = ()-> System.out.println("*** update ****");
			
		Command insert = ()-> System.out.println("*** insert ****");
			
		Command delete = () -> System.out.println("*** delete ****");
			
		
		delete.exec();
		switch (msg) {
		case "1":
			list.exec();
			break;
		case "2":
			update.exec();
			break;
		case "3":
			insert.exec();
			break;
		case "4":
			insert.exec();
			break;

		default:
			break;
		}



}
	
}