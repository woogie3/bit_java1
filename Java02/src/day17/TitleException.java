package day17;

public class TitleException extends Exception {
	public TitleException() {
		super("TitleException : 공백 허용 안됨");
	}
	public TitleException(String msg) {
	super(msg); 
		
	}
}
