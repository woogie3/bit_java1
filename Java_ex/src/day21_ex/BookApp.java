package day21_ex;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import day21_ex.BookMgr;
import day21_ex.Book;

public class BookApp {
	static int num=0;
	
	public static void main(String[]args) {
		new Gui();
	}
	
}
class Gui extends JFrame{
	static int num = 0;
	BookMgr mgr;
	JButton add,list,delete,search,exit,load;
	TextField title, price, isbn;
	TextArea output;
	
	Gui(){
		
		
		mgr = new BookMgr();
		Panel p1 = new Panel();
		p1.add(add = new JButton("ADD"));	//버튼
		p1.add(list = new JButton("LIST"));
		p1.add(delete = new JButton("DELETE"));
		p1.add(search = new JButton("SEARCH"));
		p1.add(exit = new JButton("EXIT"));
		p1.add(load = new JButton("LOAD"));
		add(p1,BorderLayout.SOUTH);
		
		Panel p2 = new Panel();
		p2.setLayout(new GridLayout(3,2));
		p2.add(new JLabel("ISBN"));       //라벨
		p2.add(isbn = new TextField(20));
		p2.add(new JLabel("제    목"));
		p2.add(title = new TextField(20));
		p2.add(new JLabel("가    격"));
		p2.add(price = new TextField(20));
		add(p2, BorderLayout.NORTH);
		
		add(output = new TextArea(15,40)); //폰트
		output.setFont(new Font(null,1,20));
		
		
		pack();//알아서 다 입력
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		list.addActionListener( //람다식으로 각버튼이 동작하도록 명령을 줌
				e->{
					output.setText("***** bookList *****\n");
					mgr.bookListPrint().forEach(i->output.append(i+"\n"));
					});
				
//			e -> mgr.bookListPrint().forEach(i->output.append(i+"\n")));
		add.addActionListener( 
				(e) ->  {
					JFrame f1 = new JFrame("책 등록");
					Panel p3 = new Panel();
					JLabel ti1 = new JLabel("책제목 : "); 
					JLabel pr1 = new JLabel("가격 : "); 
					TextField tf1 = new TextField(12);
					TextField tf2 = new TextField(12);
					JButton save;
					setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					
					tf1.selectAll();
					tf2.selectAll();
					
					p3.add(ti1);
					p3.add(tf1);
					p3.add(pr1);
					p3.add(tf2);
					f1.add(p3);
					
					p3.add(save = new JButton("등록"));
					
					f1.setSize(600,100);
					f1.setVisible(true);
					
					save.addActionListener(
							(k) -> {
								
					int p = 0;
					try {
					p = Integer.parseInt(tf2.getText());
					}catch(Exception e1) {
						output.setText("예외발생\n");
						output.append("가격에 숫자만 입력가능합니다.\n");
						output.append(e1.getMessage());
						return;
					}
					boolean b = mgr.addBook(new Book(++num,tf1.getText(),p));
					if(b) {
						output.setText("등록성공");	
					}
					else {
						output.setText("등록실패");
					}
							
				});
				});
//			(e) ->  mgr.addBook(new Book(num++,title.getText(),Integer.parseInt(price.getText())))
//			);
		delete.addActionListener( 
	
			(e) -> {
				mgr.deleteBooks(title.getText());
				output.setText("삭제되었습니다.");
			}
				);
		search.addActionListener( 
			
			(e) -> {
				output.setText("***** search bookList *****\n");
				mgr.searchBookList(title.getText()).forEach(i -> output.append(i+"\n"));
			}
				);
		load.addActionListener( //람다식으로 각버튼이 동작하도록 명령을 줌
				e->{
					output.setText("***** 저장된 목록 *****\n");
					mgr.bookLoad().forEach(i->output.append(i+"\n"));
					});
		exit.addActionListener(e -> System.exit(0));
		
	}
	
}