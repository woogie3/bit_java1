package day17;

public class test02 {
	public static void main(String[] args) {
		Book b1 = new Book("java", 9900); //Object,Object
		if(b1.getTitle() instanceof String)
		System.out.println (((String)(b1.getTitle())).charAt(0));
		
		Book<String, Integer> b2 = new Book<String, Integer>("sql", 400);
		System.out.println(b2.getTitle().charAt(0));
		
	//	Object[] obj = {1,2,3};
	//	Book<?, Integer> b3 = new Book<String, Integer>("spring", 30000);
	
		Book<?, Integer> b3 = new Book<String, Integer>("spring", 400);
		System.out.println(b3.getTitle());// ? -> objdect 변수의 와일드카드문의 데이터타입에따라 getTitle뒤에오는 메소드가 다름
		
		
		Book<?, ? extends Number> b4 = new Book<String, Integer>("SPring", 400);
		System.out.println(b4.getPrice());// ? -> numeber type
		
		Book<String, ? super Number> b5 = new Book<String, Object>("spring", 400);
		System.out.println(b5.getPrice());// ? -> number(=>object)의 부모로 바인딩됨
		
	}
	

}
