package App;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Service.BookService;
import Service.BookServiceImpl;
import dao.BookDAO;
import dao.BookDAO_MySql;
import dao.BookDAO_Oracle;
import vo.BookVO;

public class BookApp {

	public static void main(String[] args) {
		 new Gui_book();
		 
	}
}


class Gui_book extends JFrame{
	static int num=0;
    JButton add,list,delete,search,exit;
    TextField title,price,isbn,publisher;
    TextArea output;
    
    BookDAO dao = new BookDAO_MySql();
//    BookDAO dao = new BookDAO_Oracle();
    BookService service = new BookServiceImpl(dao); //해당 dao로 db연동
	
    Gui_book(){
    	
    	Panel p1 = new Panel();
    	p1.add(add = new JButton("ADD"));
    	p1.add(list = new JButton("List"));
    	p1.add(delete = new JButton("삭제"));
    	p1.add(search = new JButton("검색"));
    	p1.add(exit = new JButton("종료"));
    	add(p1,BorderLayout.SOUTH);
    	
    	Panel p2 = new Panel();
    	p2.setLayout(new GridLayout(4,2));
    	p2.add(new JLabel("   ISBN   "));
    	p2.add(isbn = new TextField(20));
    	p2.add(new JLabel("  제      목   "));
    	p2.add(title = new TextField(20));
    	p2.add(new JLabel("  가      격  "));
    	p2.add(price = new TextField(20));
    	p2.add(new JLabel("  출      판   "));
    	p2.add(publisher = new TextField(20));
    	add(p2,BorderLayout.NORTH);
    	
    	add(output= new TextArea(15, 40));
    	output.setFont(new Font(null,1,20));
    	
    	pack();
    	setVisible(true);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	
    	add.addActionListener(e -> {
    		BookVO vo = new BookVO();
    		vo.setBookid(Integer.parseInt(isbn.getText()));
    		vo.setBookname(title.getText());
    		vo.setPrice(Integer.parseInt(price.getText()));
    		vo.setPublisher(publisher.getText());
    		
    		service.addBook(vo);
    	});
    	
    	exit.addActionListener(e-> {
//    	    mgr.save();
    		
    		System.exit(0);
    		title.setText("");
    		isbn.setText("");
    		price.setText("");
    		publisher.setText("");//텍스트필드 초기화
    	});
    	
    	delete.addActionListener(e-> {
    		int i = service.deleteBook(Integer.parseInt(isbn.getText()));
    		output.setText(i+"개의 도서 삭제 \n");
    		
    		
    	});
    	
    	list.addActionListener(e -> {
    		output.setText(" BookList  \n");
    		
    		service.bookList().forEach(i->output.append(i+"\n"));
//    		mgr.getBookList().forEach(i -> {
//    			output.append(i+"\n"); 
//    		} );
    	});
    	
    	
    	
    	
    }
	
}
