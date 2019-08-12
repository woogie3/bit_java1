package day21;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class Test01 {

	public static void main(String[] args) {
		new UI_1();
		
		
		

	}

}

class UI_1 /*extends Frame*/{//UI클래스
	Frame f1;//프레임
	Button red, blue, exit;//버튼 3개생성
	Panel p1; //패널 1개생성
	
	UI_1(){//생성자영역
		f1 = new Frame("awt UI Test ~~~ ");
		p1 = new Panel();	//패널생성
		p1.add(red = new Button("RED"));
		p1.add(blue = new Button("BLUE"));
		p1.add(exit = new Button("EXIT"));
		f1.add(p1,BorderLayout.SOUTH); //보더 레이아웃 위치조정
		
		
		f1.setSize(300,300);
		f1.setVisible(true);
		
		red.addActionListener(new ActionListener() {//액션리스너는 추상메소드 1개라서 액션어댑터 필요없음
			public void actionPerformed(ActionEvent e) {
				p1.setBackground(Color.RED);
			}
		});
		blue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p1.setBackground(Color.BLUE);
			}
		});
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
//		listener가 들어가면 보통 인터페이스가 온다.
		
//		red.addActionListener();//액션감지
		
//		f1.addWindowListener(new WindowEventP());//윈도우이벤트 감지
		f1.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {//창 종료
			f1.setVisible(false);//보다 빠르게 액션동작을 실행하기위해 f1객체에 간단한명령삽입
			f1.dispose();//보다 빠르게 액션동작을 실행하기위해 f1객체에 간단한명령삽입
			System.exit(0);
			}
		});
		
		
		
		
		
	}
}

//class WindowEventP implements WindowListener {//이렇게하면 메소드 모두 오버라이드해야함
class WindowEventP extends WindowAdapter{//WindowAdapter는 이미 WindowListener를 갖고있다. 
	
	@Override
	public void windowClosing(WindowEvent e) {//창 종료
		//f1객체를 이용하기 위해 inner 클래스화한다!!!
//			f1.setVisible(false);//보다 빠르게 액션동작을 실행하기위해 f1객체에 간단한명령삽입
//			f1.dispose();//보다 빠르게 액션동작을 실행하기위해 f1객체에 간단한명령삽입 //밖으로 클래스를 빼와서 f1객체문은 지운다.
		System.exit(0);
		
	}
	
	
}


