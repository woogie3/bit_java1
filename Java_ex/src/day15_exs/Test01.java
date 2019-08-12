package day15_exs;

import util.MyUtil;
import static util.MyUtil.rightPad;

public class Test01 {
	public static void main(String[]args) {
		MyUtil u = new MyUtil();
		String s = u.leftPad("ejb", 15, '^');//instance메소드
		System.out.println(s);
		System.out.println(util.MyUtil.leftPad("java",10,'#'));//static메소드
		System.out.println(rightPad("java", 10, '#'));//static메소드
		System.out.println(MyUtil.add(4,5,6,7,8));
		
		//util패키지에 jar파일 생성
		//cmd창으로 workspace에서 util패키지가 있는 폴더선택하고 bin들어간다음
		//경로복사후 cmd창에 주소입력
		//입력후 jar -cvf util.jar util입력
		//폴더에 util.jar생성 되어있는것을 확인하고
		//c드라이브에 별도로 라이브러리폴더 생성
		//이클립스로 돌아와 프로젝트를 선택하고 
		//오른쪽마우스버튼 클릭후 build path로 들어가서 configure bulid path선택
		//java build path에서 library탭선택
		//add external jar클릭후 파일 선택
		//하지만 해당패키지에 내용이 변경될경우 이과정을 다시진행, 즉 이것을 리패키징이라고 한다.
		
		//C:\Program Files\Java\jdk1.8.0_211\jre\lib\ext
		//C:\Program Files\Java\jre1.8.0_211\lib\ext
		//이 두곳에 넣은것은 시스템라이브러리에 넣는것이다
	}

}
