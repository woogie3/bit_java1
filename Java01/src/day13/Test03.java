package day13;

public class Test03 {
	public static void main(String[]args) {
		Drawanble c1  = new Circle(new Point(5,5),3);
		System.out.println(c1);
		System.out.println(((Shape)c1).area());
		((Drawanble)c1).draw();
	}
}
