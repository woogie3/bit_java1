package day21;

import java.awt.BorderLayout;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class test05 {

	public static void main(String[] args) {
		new UI_5().createUI(); //사용자정의 함수로 직접호출한다.

	}

}

class UI_5 extends JFrame implements ActionListener{//
//	Frame f1;
	JButton red, blue, exit;
	TextField msg;
	TextArea output;
	Panel p1,p2; 
	
	void createUI(){
		super.setTitle("awt UI Test ~~~ ");
		p1 = new Panel();	
		p1.add(red = new JButton("RED"));
		p1.add(blue = new JButton("BLUE"));
		p1.add(exit = new JButton("종료"));
		add(p1,BorderLayout.SOUTH);
		
		p2 = new Panel();
//		p2.setLayout(new GridLayout(1,2));
		p2.add(new JLabel("메세지창"));
//		p2.add(msg = new TextField("input message"));
		p2.add(msg = new TextField(20));
		add(p2,BorderLayout.NORTH);
		
		add(output = new TextArea(15,40));
		output.setFont(new Font(null, 0, 24));
		
		
		setSize(300,300);
		setVisible(true);
		
		red.addActionListener(this);
		blue.addActionListener(this);
		exit.addActionListener(this);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//JFrame의 setDefaultCloseOperation기능을 활용
		
		msg.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				output.append(msg.getText()+"\n");
				msg.setText("");
			}
		});
		
				
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println("ActionEvent e 발생");
//		System.out.println(e.getActionCommand());
		switch (e.getActionCommand()) {
		case "RED":
			p1.setBackground(Color.RED);
			break;
		case "BLUE":
			p1.setBackground(Color.BLUE);
			break;	
		case "종료":
			System.exit(0);
			
		default:
			break;
		}
}
class WindowEventP5 extends WindowAdapter{
	
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
		
	}
	
	
}}
