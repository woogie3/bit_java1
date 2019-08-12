package day15;

import javax.swing.JOptionPane;

public class Test05 {

	public static void main(String[] args) {
		String msg = JOptionPane.showInputDialog("1.list 2.update 3.insert 4.delete");
		
		Command list = new Command() {
		@Override
		public void exec() {
			System.out.println("*** list ****");
		}
			
		};
		list.exec();
		Command update = new Command() {
			
			@Override
			public void exec() {
				System.out.println("*** update ****");
			}
		};
		update.exec();
		Command insert = new Command() {
			
			@Override
			public void exec() {
				System.out.println("*** insert ****");
			}
		};
		insert.exec();
		Command delete = new Command() {
			
			@Override
			public void exec() {
				System.out.println("*** delete ****");
			}
		};
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
