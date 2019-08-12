package day15;

import day14.Circle;
import day14.Point;

public class Test01 {

	public static void main(String[] args) throws Exception {
	//예외가 걸린문장은 마찬가지로 메인함수에 똑같이 예외처리작업을한다.
		Point p1 = new Point(5,5);
		Point p2 = p1.clone();//p1값 복제
		
		Point p3 = p2;//복제가 아닌 주소값이 같은것이다.
		p2.setX(0);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		System.out.println("==============================");
		
		Circle c1 = new Circle(new Point(7,7),2);
		Circle c2 = c1.clone();
		c2.r = 0;
		c2.p.setX(0);
		System.out.println(c1);
		System.out.println(c2);//decopy
	}

}
