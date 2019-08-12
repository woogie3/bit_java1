package day23;

public class Test08 {

	public static void main(String[] args) {
//		System.out.println(Thread.MAX_PRIORITY); // 10
//		System.out.println(Thread.MIN_PRIORITY); //1
//		System.out.println(Thread.NORM_PRIORITY); //5
		
		System.out.println(" Main Start ");
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		Thread.yield();//무시		//기다릴 경우 다른 데이터처리를 위해 양보함
		System.out.println(Thread.currentThread());//cpu점유율
		//스레드 생성
		Job1 job1 =  new Job1();
		Thread t1 = new Thread(job1);
		
		Job2 job2 = new Job2();
		Thread t2 = new Thread(job2);
		//스레드를 실행 대기큐에 넣는다.
		t1.start();
		t2.start();
		try {//t1,t2가 수행될때까지 아무것도 못함!
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println(" Main End ");
		
		
	}

}
class Job1 implements Runnable{
	int sum = 0; //홀수의 합을 계산할 변수
	public void run() {
		for(int i = 1; i<100; i=i+2) {
			sum += i;
			System.out.print(Thread.currentThread()+" ");
			System.out.println("1~"+i+" 홀수합 : "+sum);
			Thread.yield();//무시	
//			try {
//				Thread.sleep(50);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
		}
		
	}
}
class Job2 implements Runnable{
	int sum = 0; //짝수의 합을 계산할 변수
	public void run() {
		for(int i = 0; i<100; i=i+2) {
			sum += i;
			System.out.print(Thread.currentThread()+" ");
			System.out.println("0~"+i+" 짝수 합 : "+sum);
			Thread.yield();//무시	
//			try {
//				Thread.sleep(50);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
		}
		
	}
}
