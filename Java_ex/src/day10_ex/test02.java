package day10_ex;

public class test02 {	 //부모 클래스에 배열화하는것
	public static void main(String[] args) {
	Person[] p = {new Student ("홍길동",20,2012001),
				  new Teacher ("이순신",30,"JAVA"),
				  new Employee ("유관순",40,"교무과")
	};

	for( Person data : p) {
		data.printA(); //부모Person() 영역의 자원을 접근 할때는 바로 접근가능
		System.out.println();
	}

	System.out.println("================================");
	for(Person data : p) {
		//자식영역의 자원을 접근할때는 다운캐스팅이 필요
		//반드시 하단부에 어떤 객체가 바인딩 되어 있는지 타입체크 필요
		if(data instanceof Student)((Student)data).print();
		if(data instanceof Teacher)((Teacher)data).print();
		if(data instanceof Employee)((Employee)data).print();
	
}
}
}

/*
 * Object[] p = {new Student ("홍길동",20,2012001),
				  new Teacher ("이순신",30,"JAVA"),
				  new Employee ("유관순",40,"교무과")
	};
	
	for( Object data : p) {
		data.printA(); //부모Person() 영역의 자원을 접근 할때는 바로 접근가능
		System.out.println();
	}
		System.out.println("================================");
	for(Object data : p) {
		//자식영역의 자원을 접근할때는 다운캐스팅이 필요
		//반드시 하단부에 어떤 객체가 바인딩 되어 있는지 타입체크 필요
		if(data instanceof Student)((Student)data).print();
		if(data instanceof Teacher)((Teacher)data).print();
		if(data instanceof Employee)((Employee)data).print();
	
}
}
}

 * 
 */
