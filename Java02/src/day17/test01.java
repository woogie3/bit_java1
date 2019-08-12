package day17;

public class test01 {

	public static void main(String[] args) {
		
		Book1 b1 = new Book1("java", 900); //T => object처리됨
		System.out.println(b1);
		
	  //Book<String> b2 = new Book<String>("sql", "700");//String화 됨
		Book1<Double> b2 = new Book1<Double>("sql", 700.0);//double화 됨
		System.out.println(b2);
		
		Book1<Integer> b3 = new Book1<Integer>("jsp", 50000);//자동으로 오토박싱이됨
		System.out.println(b3);
	}

}
