package day7TNSFPolymorphismOverriding;

public class Circle {
public static void main(String[] args) {
		
		// create an array of shape class
		Shape[] shapes = new Shape[2];
		
		// instantiate objects of circle , square
		
		shapes[0]= new Shape();
		shapes[1]= new Square();
		
		// demonstrate polymorphism by calling draw and erase methods
		
		for(Shape sh:shapes)
		{
			sh.draw();
			sh.erase();
			System.out.println("---------------------------------------------");
		}
		
		Shape s = new Shape();
		s.draw();
		
		Circle c = new Circle();
		c.draw();
		
	}

public void draw() {
	// TODO Auto-generated method stub
	
}

}


