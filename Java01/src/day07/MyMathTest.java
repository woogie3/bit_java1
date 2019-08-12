package day07;

import util.MyUtil;

public class MyMathTest {

	public static void main(String[] args) {
		System.out.println(MyUtil.add(33, 99));
		System.out.println(MyUtil.add(33.3, 99.9));
		System.out.println(MyUtil.add(33.33, 99.449,90));
		System.out.println(MyUtil.add(33.33, 99.449,90,10,56,748,608));
		System.out.println(MyUtil.add(new double[] {33.33, 99.449,90,10,56,748,608}));
		//이구문은 배열처리 메소드 사용시 앞에 데이터타입명을 주고 배열을 적는다.
		
		//.add는 스태틱해서 클래스명을 넣음
		
		int i=100;
		//Integer ii = new Integer(100);
		Integer ii = i;
		i = ii;
		System.out.println(i+" "+ii);
		//즉, 이것이 오토박싱 언박싱을 보여주는 예이다.
	}
	

}