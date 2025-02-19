package day8Abstraction;

public class AbstractDemo {
	
private int data;
	
	
	public static void main(String[] args) {
		
		Square sq= new Square();
		Rectangle r1 = new Rectangle();
		
		sq.calArea();
		sq.show();
		
		r1.calArea();
		r1.show();
		
		
		Square shape;
		shape= new Square();
		
		shape.calArea();
		shape.show();
		
		
		
		
		
		
		
		

	}

}


