package day10;

public class Animal_Test01 {
	public static void main(String[] args) {
		Animal a1 = new Animal(); //Animal객체를 통해지정, 그리고 디폴트값으로 넘겨짐
		a1.breath();
		
		Animal a2 = new Animal("Dog"); // Dog값을 kind변수로 assign(할당)된다
		a2.breath();
				
		Animal a3 = new Animal("Dog"); // 고양이값을 kind변수로 assign(할당)된다
		a3.breath();
		
		Dog d1 = new Dog("시베리안 허스키","케리");
		d1.breath();
		d1.dogprint();
		
		Dog d2 = new Dog("Dog","진돗개","쪼꼬");
		d2.dogprint();
		
		String animalKind = d2.getSuperKind();
		System.out.println(animalKind);
	}
}
