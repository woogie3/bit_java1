package day07_ex;

public class AnimalTest {

	public static void main(String[] args) {
		Animal am = new Animal();
		am.setName("큰뿔소");
		am.setAge(3);
		am.setLive(true);
		am.print();//별도로 print()메소드를 설정하고 호출가능
				   //즉, 주소가있어야만 호출가능
		
		System.out.printf("동물이름 : %s, 나이 : %s 생존여부 %b%n", am.getName(), am.getAge(), am.isLive());
		am.setName("펭귄");
		System.out.printf("동물이름 : %s, 나이 : %s 생존여부 %b", am.getName(), am.getAge(), am.isLive());
	}
	

}
