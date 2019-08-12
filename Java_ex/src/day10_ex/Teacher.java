package day10_ex;

class Teacher extends Person {

	private String subject;
	

	public Teacher() {	}
	
	

	public Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}


//-----------------생성자함수-------------------------

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	public void print() {
		super.printA();//부모쪽 메소드를 호출
		System.out.printf("담당과목  : %s %n", subject);
	}
}
