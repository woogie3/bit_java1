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

import javax.swing.JFrame;
import javax.swing.JButton;


public class test04 {

	public static void main(String[] args) {
		new UI_4();
		
	}

}

class UI_4 extends JFrame implements ActionListener{
	JButton red;
	JButton blue;
	JButton exit;
	Panel p1; 
	
	UI_4(){//생성자영역
		super("awt UI Test ~~~ ");
		p1 = new Panel();	
		p1.add(red = new JButton("RED"));
		p1.add(blue = new JButton("BLUE"));
		p1.add(exit = new JButton("EXIT"));
		add(p1,BorderLayout.SOUTH);
		
		
		setSize(300,300);
		setVisible(true);
		
		red.addActionListener(this);
		blue.addActionListener(this);
		exit.addActionListener(this);

		

//		addWindowListener(new WindowAdapter() {
//			public void windowClosing(WindowEvent e) {
//			setVisible(false);
//			dispose();
//			System.exit(0);
//		}
//		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//위의 기능을 JFrame의 기능이 있기에 그기능을 끌어왔다!!!
		
		
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		switch (e.getActionCommand()) {
		case "RED":
			p1.setBackground(Color.RED);
			break;
		case "BLUE":
			p1.setBackground(Color.BLUE);
			break;	
		case "EXIT":
			System.exit(0);
			
		default:
			break;
		}
}
class WindowEventP4 extends WindowAdapter{
	
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
		
	}
	
	
}}
