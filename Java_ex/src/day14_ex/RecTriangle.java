package day14_ex;

public class RecTriangle extends Shape{
	double width;
	double height;
	
	
	
	public RecTriangle(double width, double height) {
		
		this.width = width;
		this.height = height;
	}
	
	


	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	double getArea() {
		return (width * height) / 2 ;
	}

	


	



}
