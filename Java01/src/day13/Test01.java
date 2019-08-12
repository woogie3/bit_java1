package day13;

import java.util.Calendar;
import java.util.Formatter;

public class Test01 {

	public static void main(String[] args) throws Exception{
		Calendar c = Calendar.getInstance();
		//new대신 .getInstance()를 사용
		
		System.out.println(c);
		System.out.println("2019년 "+Calendar.DAY_OF_YEAR+" 일째");
		String date = String.format("현재시간은 %tk 시 : %tm 분 : %ts 초 %n", c,c,c);
		System.out.println(date);
		
		System.out.printf("%f %n",Math.PI);
		String f = String.format("f", Math.PI);
		System.out.println("--------------------------------");
		
		StringBuffer sb = new StringBuffer();
		//Formatter fm = new Formatter(sb);
		Formatter fm = new Formatter("sss.txt");//sss.txt파일에 보내기위해 생성
		fm.format("현재시간은 %tk 시 : %tm 분 : %ts 초 %n", c,c,c);
		fm.format("%f %n",Math.PI);
		System.out.println(sb);
		fm.flush();
		
		System.out.println("main end");
		//formatter는 주로 파일에 정보를 저장할때 사용
	}

}
