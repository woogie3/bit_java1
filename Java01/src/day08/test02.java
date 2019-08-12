package day08;

public class test02 {

	public static void main(String[] args) {
		Student[] students = {
				new Student("홍길동", 2019001, 90 , 80 , 50),
				new Student("홍만이", 2019002, 40 , 100 , 65),
				new Student("동동", 2019003, 10000 , 50 , 75),
				new Student("김기리", 2019004, 80 , 60 , 80),
				new Student("김마리", 2019005, 50 , 90 , 80),
		};
		
		for(Student data : students) {
			if(data.getGrade() == 'C')
			data.print();			
		}
		
		

	}

}


class Student{
	private String name;
	private int number;
	private int kor;
	private int eng;
	private int math;
	private char grade;
	
	
	
	public Student(String name,int number,int kor,int eng,int math ) {
		this.name = name;
		this.number = number;
		//this.kor = kor;
		this.setKor(kor); //유효성검증하기위해!!
		//this.eng = eng;
		this.setEng(eng);
		//this.math = math;
		this.setMath(math);
//		setGradeProcess();
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		if(!(checkJumsu(kor))) return;
		this.kor = kor;
		} 
	

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
			if(!(checkJumsu(eng))) return;
			this.eng = eng;
	}
	

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		if(!(checkJumsu(math))) return;
		this.math = math;
	}
	
	private boolean checkJumsu(int num){
		boolean flag = true;
		
		if(!(num >= 0 && num <= 100)) {
			System.out.println(num +"=> 점수가 유효하지 않습니다.");
			flag = false;
		}
		return flag;
	}
	public char getGrade() {
		setGradeProcess();
		return grade;
	}
	
	public void setGradeProcess() {
		double avg = (kor+eng+math)/3;
		this.grade = avg>=90 ? 'A' :(avg >=80 ? 'B' :(avg >= 70 ? 'C' :(avg >=60 ? 'D' : 'F')));
	}
	public void print() {
		System.out.printf("%s,%.2f,%s %n",name,(kor+eng+math)/3., this.getGrade());
	}
	
	
		
	}
