package day15;

import day14.Point;

public class Test03 {

	public static void main(String[] args) {
//		Inner i = new Inner();//is a 관계	
// 		i.print();
		Outer.Inner i = new Outer().new Inner();//outer의 주소를 알아야하기에  outer()생성후 inner()주소를 넣음
		i.print();
	}

}
class Outer{
	Point p = new Point(3,3);

class Inner{// extends Outer{ //is a관계
	Outer o = new Outer();//has a관계
	void print() {
		System.out.println(o.p);
	}
}
}