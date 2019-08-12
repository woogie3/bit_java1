package day11;

import day10.Animal;
import day10.Dog;

public class AnimalTest {
	public static void main(String[]args) {
		Animal d = new Dog("진돗개", "쫑이");
		if(d instanceof Dog) ((Dog)d).dogprint();
		
		Dog dd = (Dog)d;
		if(d instanceof Fish) {
			Fish ff = (Fish)d;
		}
		
		d.breath();
				
		Animal f = new Fish ("구피");
		//f.fishPrint();
		//f.breath();//부모로 물려받은 기능이 꼭 적합하지만은 않다.
		if(f instanceof Fish)((Fish)f).fishPrint();
		f.breath();
		((Fish)f).breath();
	}

}
