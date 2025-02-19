package day8TNSIFNestedInterface;

import day8TNSIFMarketInterface.Registrable;
import day8TNSIFMarketInterface.Teacher;

public class Driver {
	
	public static void main(String[] args) {

		Teacher t1 = new Teacher();
		 
		
		if(t1 instanceof Registrable)
		{
			System.out.println("Student is registered");
		}
		else
		{
			System.out.println("Student is not Registered");
		}
		
		
	}

}
