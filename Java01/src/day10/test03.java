package day10;

public class test03 { //시계만들기~~~

	public static void main(String[] args) {
		Time t1 = new Time();
		
	}

}
	class Time{
	int hour;
	int minute;
	int second;
	
	
	
	public Time() {
		//super();//상속에서 부모를 가리킴, 이문장은 지워도 존재함. 즉 생략 가능
	}
	
		
	public Time(int hour, int minute, int second) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}



	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	
	
	
}
