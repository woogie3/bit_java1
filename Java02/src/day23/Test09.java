package day23;

public class Test09 {

	public static void main(String[] args) {
//		System.out.println(Thread.MAX_PRIORITY); // 10
//		System.out.println(Thread.MIN_PRIORITY); //1
//		System.out.println(Thread.NORM_PRIORITY); //5
		
		System.out.println(" Main Start ");
		System.out.println(Thread.currentThread());//cpu점유율
		//스레드 생성
		T1 t1 = new T1();
		T2 t2 = new T2();
		//스레드를 실행 대기큐에 넣는다.
		t1.start();
		t2.start();
		
		System.out.println("홀수합 + 짝수합 = " +(t1.sum+t2.sum));
		
		System.out.println(" Main End ");
		
		
	}

}
class T1 extends Thread{
	int sum = 0; //홀수의 합을 계산할 변수
	public void run() {
		for(int i = 1; i<100; i=i+2) {
			sum += i;
			System.out.print(Thread.currentThread()+" ");
			System.out.println("1~"+i+" 홀수합 : "+sum);
		}
		
	}
}
class T2 extends Thread{
	int sum = 0; //짝수의 합을 계산할 변수
	public void run() {
		for(int i = 0; i<100; i=i+2) {
			sum += i;
			System.out.print(Thread.currentThread()+" ");
			System.out.println("0~"+i+" 짝수 합 : "+sum);
		}
		
	}
}
