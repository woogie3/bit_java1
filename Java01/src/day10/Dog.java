package day10;

public class Dog extends Animal {//Animal자식클래스
	private String kind = "강아지 종류";
	private String name= "강아지 이름";
	
//-----------------------------------------------	생성자영역
	
	public Dog() {
		//super(); //기본생성자호출
		super("강아지과"); //super();과는 다른데 부모(Animal)기본생성자
	}
	public Dog(String kind, String name) {
		super("강아지과");
		this.kind = kind;
		this.name = name;
	}
	public Dog(String superkind, String kind, String name) {
		super(superkind);
		this.kind = kind;
		this.name = name;
	}

//------------------------------------------------   메소드영역
	
	
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void dogprint() {
		
		System.out.printf("[ %s, %s, %s] %n",super.kind,this.kind,this.name);
	}//부모kind와 자식kind 둘다 호출
	
	public String getSuperKind() {
		return super.kind;
	}
	@Override
	public void print() {
		//super.print();
		//System.out.printf("  %s : %s  %n",this.kind,this.name);
		this.dogprint();
	}
	
}
