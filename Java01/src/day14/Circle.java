package day14;

abstract class Shape implements DrawAndMoveable{//2.상속받은 DrawAndMoveable은 추상클래스인 Shape은  DrawAndMoveable의 메소드들을 구현할수있다.
	
	abstract double area();
}

interface DrawAndMoveable extends Drawable, Moveable {//1.DrawAndMoveable이라는 인터페이스에 Drawable, Moveable 두 인터페이스를 상속받게한다. 
	abstract void draw();
	abstract void move(int m);
}

interface Drawable{
void draw();
}

interface Moveable{//인터페이스안에는 인스턴스는 들어갈수없다.
	void move(int m);
}
interface MoveAndDraw extends Drawable, Moveable{
	
}

public class Circle extends Shape implements Drawable, Moveable, Cloneable{
	public Point p;
	public int r;

	public Circle(Point point, int r) {
		this.p = point;
		this.r = r;
	}

	@Override
	public double area() {
		return r*r*Math.PI;
	}
	
	public void draw() {
		System.out.println(getClass().getName()+"그리기");
	}
	@Override
	public void move(int m) {//xy포인트를 m만큼 이동, Point는 Private한 자원이기에 set get메소드 활용
		p.setX(p.getX()+m);
		p.setY(p.getY()+m);
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
//	@Override
//	public Circle clone() throws CloneNotSupportedException {
//		Circle c = (Circle) super.clone();
//		Point p = c.p.clone();
//		c.p = p;
//		retrun c;
//	}
	
	@Override
	public Circle clone() throws CloneNotSupportedException {
		
		Circle c = (Circle) super.clone();
		Point p = c.p.clone();
		c.p = p;
		return c;
	}

	

	}

