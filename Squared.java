package day7TNSFPolymorphismOverriding;

public class Squared {
	
private double side;
	
	public void Square(double side)
	{
		this.side=side;
	}
	
	
	// Override draw method for square
	public void draw()
	{
		System.out.println("Drawing a square with side "+ side);
	}
	
	
	// Override erase method for square
	
	public void erase()
	{
		System.out.println("erasing a square with side : "+ side);
	}
	
	
	
	
	
	
}


