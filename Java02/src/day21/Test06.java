package day21;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.stream.Stream;

import javax.swing.JFrame;

public class Test06 {

	public static void main(String[] args) {
		
		new DrawImg();
		
	}

}

class DrawImg extends JFrame{//이미지를 그리는 클래스
	Image im;
	
	DrawImg(){
		super.setTitle("DrawImg");
		im = Toolkit.getDefaultToolkit().getImage("c://img/java.jpg");
		String[] fontlist = Toolkit.getDefaultToolkit().getFontList();//시스템에 있는 폰트확인
		Stream.of(fontlist).forEach(i -> System.out.println(i));//foreach문을 쓰자!!
		
		setSize(800,800);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
			setVisible(false);
			dispose();
			System.exit(0);
		}
		});
		
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		repaint();//페인트메뉴가 시스템 내부적으로 호출됨.
	}
	
	public void paint(Graphics g) {
		g.drawImage(im, 20, 20, 400, 400, this);
	}
}