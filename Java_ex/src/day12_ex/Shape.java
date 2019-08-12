package day12_ex;

public abstract class Shape {
	protected double area;
	private String name;
	
	public Shape() {
		super();
	}
		
	public Shape(String name) {
		super();
		this.name = name;
	}
	public abstract void calculationArea();
	
	public void print() {
		System.out.printf("%s의  넓이는 :  %s   %n ",name,area);
		
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
