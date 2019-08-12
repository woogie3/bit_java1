package day10;

public class test01 {//문자열비교문 워밍업

	public static void main(String[] args) {
		System.out.println("java progRamING".equals("java progRamING")); //-->java progRamING를 서로 비교해 true/false구분
		System.out.println("java progRamING".equals("Java progRamING")); //-->java progRamING를 서로 비교해 true/false구분
		System.out.println("java progRamING".equalsIgnoreCase("java progRamING"));  //-->
		System.out.println("java progRamING".equalsIgnoreCase("JAVA"));  //-->
		System.out.println("java progRamING".contains("JAVA"));  //-->
		System.out.println("java progRamING".toLowerCase().contains("JAVA"));  //-->java progRamING를 소문자로 변환하고 JAVA와 비교함
		System.out.println("java progRamING".toLowerCase().contains("JAVA".toLowerCase()));  //-->java progRamING를 소문자로 변환하고 JAVA를 소문자로 변환하고 비교함
		System.out.println("----------------------------------------------------");

	}

}
