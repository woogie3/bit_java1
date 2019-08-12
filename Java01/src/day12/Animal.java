package day12;

public abstract class Animal {//abstract, 추상클래스
	protected String kind = "동물의 종류";
	
	
//----------------------------------------------생성자영역

	public Animal() {
		super();//기본생성자호출
		
	}

	public Animal(String kind) {
		super();
		this.kind = kind;
	}

//------------------------------------------------   메소드영역	
	
	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}
	public abstract void breath() ; //abstract 추상메소드: 선언부만 있고 구현부는 없음
	
	
	public void print() {
		System.out.printf("Animal kind : %s",kind);
			}

	
	
	
}