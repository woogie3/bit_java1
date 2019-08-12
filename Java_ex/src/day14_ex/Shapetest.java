package day14_ex;

import java.awt.geom.Area;

public class Shapetest {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(5,6);
		RecTriangle r2 = new RecTriangle(6,2);
		Shape[] s1 = {r1,r2};
		for(Shape data : s1) {
			
//			System.out.println("area : "+data.getArea());
//			if(data instanceof Resizeable) {
//				((Resizeable)data).resize(0.5);
//				System.out.println("new area : "+data.getArea());
//			}
			if(data == r1) {
				r1.resize(0.5);
		}
		

		}
	}

}
