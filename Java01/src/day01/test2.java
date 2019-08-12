package day01;

public class test2{
	public static void main(String[] args) {
		int a,b;
		a = b =10;
		
		boolean c = ++a > b++ || a++ >= ++b;
		
		System.out.println(a+","+b);
		System.out.println("변수C의값"+c);
	}
}