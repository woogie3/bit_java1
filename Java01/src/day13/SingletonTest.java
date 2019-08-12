package day13;
import day13.Singleton;
public class SingletonTest {
	public static void main(String[] args) {
		//Singleton s1 = new Singleton();
		Singleton s1 = 	Singleton.getInstance();
		Singleton s2 = 	Singleton.getInstance();
		Singleton s3 = 	Singleton.getInstance();
		Singleton s4 = 	Singleton.getInstance();
	}
	
}
	class Singleton{
		private static Singleton s = new Singleton();
	
		private Singleton() {
			System.out.println("Singleton() 생성");
			
	}
		public static Singleton getInstance() {
			if(s == null)s = new Singleton();
			return s;
		}
		

}
