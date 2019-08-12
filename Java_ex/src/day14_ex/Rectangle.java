package day14_ex;

public class Rectangle extends Shape implements Resizeable{
	double width;
	double height;

	public Rectangle(double width, double height) {
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
		return width * height;
	}


	@Override
	public void resize(double s) {
		 System.out.printf("new area : %.1f%n",(width*s)*(height*s));
		
	}

		


	

}
