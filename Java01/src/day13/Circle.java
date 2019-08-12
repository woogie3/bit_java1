package day13;

abstract class Shape implements Drawanble{
	abstract double area();
}
//interface는 추상메소드나 final메소드만 있을대 사용할수있다.
//접근지정자는 부모의 접근지정자보다 자식의 접근지정자의 범위가 더 커져야 한다.

interface Drawanble{//자바에서 -able형태면 인터페이스이다.
/*	public abstract 생략가능*/void draw();
}

public class Circle extends Shape implements Drawanble {// extends 부모클래스 implements
	//is a관계 //가장 중요한 기능하고 연관된 클래스를 상속받고 나머지는 has a로 한다.
	//is a = 부모관계 , has a = composite관계
	Point p;//has a관계로 Point와도 상속됨
	int r;

	public Circle(Point point, int r) {
		this.p = point;
		this.r = r;
	}

	@Override
	public double area() {//public protected 다 가능
		return r*r*Math.PI;
	}
	
	public void draw() {
		System.out.println(getClass().getName()+"그리기");
	}

	@Override
	public String toString() {
		return "Circle [p=" + p + ", r=" + r + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((p == null) ? 0 : p.hashCode());
		result = prime * result + r;
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
		Circle other = (Circle) obj;
		if (p == null) {
			if (other.p != null)
				return false;
		} else if (!p.equals(other.p))
			return false;
		if (r != other.r)
			return false;
		return true;
	}
	
	

	}
/*
 * abstract class Shape{
	abstract double area();
}

public class Circle extends Shape {
	Point p;//has a관계로 Point와도 상속됨
	int r;

	@Override
	double area() {
		return r*r*Math.PI;
	}

}
 * 
 * */
