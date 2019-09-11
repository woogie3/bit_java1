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

import Service.UsersService;
import Service.UsersServiceImpl;
import dao.UsersDAO;
import vo.UsersVO;

public class UsersApp {

	public static void main(String[] args) {
		 new Gui_user();
		 
	}
}
class Gui_user extends JFrame{
	static int num=0;
    JButton join,list,delete,fix,exit;
    TextField id,password,name,role;
    TextArea output;
    
    UsersDAO dao = new UsersDAO();
    UsersService service = new UsersServiceImpl(dao); //해당 dao로 db연동
	
    Gui_user(){
    	
    	Panel p1 = new Panel();
    	p1.add(join = new JButton("가입"));
    	p1.add(list = new JButton("리스트"));
    	p1.add(delete = new JButton("삭제"));
    	p1.add(fix = new JButton("수정"));
    	p1.add(exit = new JButton("종료"));
    	add(p1,BorderLayout.SOUTH);
    	
    	Panel p2 = new Panel();
    	p2.setLayout(new GridLayout(4,2));
    	p2.add(new JLabel("  I   D  "));
    	p2.add(name = new TextField(20));
    	p2.add(new JLabel("  Password  "));
    	p2.add(id = new TextField(20));
    	p2.add(new JLabel("  이      름  "));
    	p2.add(password = new TextField(20));
    	p2.add(new JLabel("  직       업   "));
    	p2.add(role = new TextField(20));
    	add(p2,BorderLayout.NORTH);
    	
    	add(output= new TextArea(15, 40));
    	output.setFont(new Font(null,1,20));
    	
    	pack();
    	setVisible(true);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	
    	join.addActionListener(e -> {
    		UsersVO vo = new UsersVO();
    		vo.setId(id.getText());
    		vo.setPassword(password.getText());
    		vo.setName(name.getText());
    		vo.setRole(role.getText());
    		
    		service.addUsers(vo);
    	});
    	
    	exit.addActionListener(e-> {
//    	    mgr.save();
    		
    		System.exit(0);
    		id.setText("");
    		password.setText("");
    		name.setText("");
    		role.setText("");//텍스트필드 초기화
    	});
    	
    	delete.addActionListener(e-> {
    		int i = service.deleteUsers(id.getText(), password.getText());
    		output.setText(i+"님의 회원정보 삭제 \n");
    		
    		
    	});
    	
    	list.addActionListener(e -> {
    		output.setText(" 회원리스트  \n");
    		
    		service.userList().forEach(i->output.append(i+"\n"));
//    		mgr.getBookList().forEach(i -> {
//    			output.append(i+"\n"); 
//    		} );
    	});
    	
    	
    	
    	
    }
	
}

