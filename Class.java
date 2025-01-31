package day7TNSFPolymorphismOverriding;

public class Class {
	
private double radius;
	
	public void Circle(double radius)
	{
		this.radius= radius;
	}
	
	// override draw method for circle
	public void draw()
	{
		System.out.println("Drawing a circle with radius "+ radius);
	}
	
	// override erase method for circle
	
	public void erase()
	{
		System.out.println("Erasing a circle with radius "+radius);
	}
	
	public void color()
	{
		
	}
	
	
	
	
}


