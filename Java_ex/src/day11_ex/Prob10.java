package day11_ex;

public class Prob10 {

	public static void main(String[] args) {
	
		Person[] p = {new Student ("홍길동",20,2012001),//모든객체의 타입을 부모로 바꿀수있다.
					  new Teacher ("이순신",30,"JAVA"),
					  new Employee ("유관순",40,"교무과")
					};
		for(Person data : p) {
			if(data instanceof Employee)((Employee)data).print();
			if(data instanceof Student)((Student)data).print();
			if(data instanceof Teacher)((Teacher)data).print();
			//((Teacher)data).toString();
			//((String)data).print(); //->이런경우 부모로 상속관계가 아니라 에러발생

		}
		
		
	}

}
