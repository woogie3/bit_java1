package day12_ex;

public class Rectangle extends Shape{
	private double width;
	private double hight;
	
	public Rectangle() {
		super();
	}

	public Rectangle(String name, double width, double hight) {
		super(name);
		this.width = width;
		this.hight = hight;
	}


	public double getWidth() {
		return width;
	}




	public void setWidth(double width) {
		this.width = width;
	}




	public double getHight() {
		return hight;
	}




	public void setHight(double hight) {
		this.hight = hight;
	}




	@Override
	public void calculationArea() {
		area = width * hight;
		
	}
	
}
