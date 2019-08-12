package day11;
import day10.Animal;
public class Fish extends Animal{
	private String name;
	
	public Fish() {
		super("물고기");
	}

	public Fish(String name) {
		super("물고기");
		this.name = name;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void fishPrint() {
		System.out.printf("[%s : %s]%n",kind,name);
	}
	
	
	//->메소드 오버라이딩, 부모로부터 물려받은기능을 나의 상황에 알맞게 재정의하는것
	@Override //renotation, 부모 메소드에 오버라이드 됐는지 확인하는것
	public void breath() {
		System.out.println(kind+" : 아가미로 숨쉬기~~~");
	}
	@Override
	public void print() {
		//super.print();
	//	System.out.printf(" :   %s  %n",name);
		this.fishPrint();
	}

}
