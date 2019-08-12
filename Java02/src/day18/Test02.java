package day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Iterator;
public class Test02 {

	public static void main(String[] args) {
		Student[] s = new Student[10];
		Student[] sss= {
				new Student("홍순이",82,99),
				new Student("차순이",82,99),
				new Student("고순이",82,99),
				new Student("홍길동",90,90)
		};
		Arrays.sort(sss);//sss배열 sort
		
		List<Student> list = new ArrayList<Student>(); //내부에 Student[] 만들어서 관리
		list.add(new Student("홍순이",88,99));
		list.add(new Student("차순이",82,93));
		list.add(new Student("고순이",80,91));
		
		
//		System.out.println(list);
		Iterator<Student> it = list.iterator();//iterator를 사용해서 원하는 데이터를 삭제, 즉 배열의 위치를 별도로 받아오지않고 간단하게 삭제가 가능하다.
		while(it.hasNext()) {
			Student data = it.next();
			if(data.getAvg() >= 90)
			System.out.println(data);
			
		}
		System.out.println(list.contains(new Student("고순이", 80,91)));//R읽기
		//equals()오버라이딩 되어야함

		//CRUD 매트릭스
		//홍길동 90 90 등록
		
		//등록처리:C
		Student s1 = new Student("홍길동",90,90);
		boolean flag = list.add(s1);
		
		if(flag)System.out.println(s1+"등록되었습니다.");
		else System.out.println(s1+"등록되었습니다.");
		
		System.out.println(list.add(new Student("홍길동",90,90)));//C삽입
		
		
		//수정처리:U
		it = list.iterator();//U수정
		while (it.hasNext()) {
			Student data = it.next();
			if(data.name.contentEquals("홍길동"))
			data.name="홍길동";
			data.ko = 100;
			data.math = 100;
			System.out.println("수정되었습니다.");
		}
		
		//삭제처리:D
		System.out.println("*********학생 "+ s1.name + " 정보삭제*********");
		it = list.iterator();
		while (it.hasNext()) {
			Student data = it.next();
			if(data.equals(s1)) {
				it.remove();
				System.out.println(s1+"삭제처리되었습니다.");
			}
			
			
			
			
		}
		Collections.sort(list);
		//목록출력 :R
				it = list.iterator();
				System.out.println("=======학생LIST 정보출력=======");
				while (it.hasNext()) {
					Student data =  it.next();
					System.out.println(data);
					
				}
	}
	
			
}
class Student extends Object implements Comparable<Student>{//sort하기위해 Comparable<Student>해야함
	String name;
	int ko;
	int math;
	double avg;
	
	public Student() {
		super();
	}
	public Student(String name, int ko, int math) {
		super();
		this.name = name;
		this.ko = ko;
		this.math = math;
		setAvg();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKo() {
		return ko;
	}
	public void setKo(int ko) {
		this.ko = ko;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(	) {
		this.avg = ((ko+math)/2);
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", ko=" + ko + ", math=" + math + ", avg=" + avg + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(avg);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ko;
		result = prime * result + math;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (Double.doubleToLongBits(avg) != Double.doubleToLongBits(other.avg))
			return false;
		if (ko != other.ko)
			return false;
		if (math != other.math)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public int compareTo(Student o) {
		
//		return ko  - o.ko;//초기값과 비교대상 비교!
//		return (int)(avg-o.avg);//오름차순
//		return (int)(o.avg-avg);//내림차순
		return name.compareTo(o.name);//string타입 비교 오름차순
//		return o.name.compareTo(name);//string타입 비교 내림차순
	}
	
	
	
}