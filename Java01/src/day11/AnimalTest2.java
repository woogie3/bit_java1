package day11;

import day10.Animal;
import day10.Dog;

public class AnimalTest2 {
	public static void main(String[]args) {
		Animal[] animals = {
			new Dog("진돗개", "쫑이"),
			new Fish("구피"),
			new Dog("진돗개", "쫑이")
	};
		
//		for(Animal data : animals) {
//			data.breath();
//			data.print(); //override해야함
//		}
		
		Dog a1 = new Dog("진돗개", "쫑이");
		Fish f2 = new Fish("구피");
		callD(animals[0]); //다형성, 같은 메소드지만 상황에 따라 바뀐다.
		callD(animals[1]); //
	}
		
		
//	public static void callD(Dog d) {
//		d.breath();
//	}

//	public static void callD(Fish d) {
//		d.breath();
//	}

public static void callD(Animal d) {
d.breath();
	}
}
