package day10;

public class Animal {//상속에 대한 이해 : Animal부모클래스
	protected String kind = "동물의 종류";
	//접근지정자 protected는 다른패키지에서 접근가능하게 해주는 지정자이다
	
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
	public void breath() {
		System.out.println(kind+ "  :  폐로 숨쉬기~~~");
	}
	
	public void print() {
		System.out.printf("Animal kind : %s",kind);
			}

	
	
	
}
