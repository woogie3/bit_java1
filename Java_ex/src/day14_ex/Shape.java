package day14_ex;

abstract class Shape {
	abstract double getArea();
	int numSides;
	
	public Shape() {
		super();
	}
	
	
	public Shape(int numSides) {
		this.numSides = numSides;
	}
	public int getNumSides() {
		return numSides;
	}
	public void setNumSides(int numSides) {
		this.numSides = numSides;
	}
	
}
