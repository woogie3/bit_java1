package day12;

public class Test01 {

	public static void main(String[] args) {
		Animal[] a = {	new Dog("시베리안 허스키","케리"),
						new Fish("구피"),
						new Fish("Fish","니모")
					};
		/*
		 * Object[] a = {	new Dog("시베리안 허스키","케리"),
							new Fish("구피"),
							new Fish("Fish","니모")
						};
		 */
		for(Animal data : a) {
			System.out.println(data.toString());
			data.breath();//downcasting이안되려면 Animal로 하는데, 
			
		}
	}

}
