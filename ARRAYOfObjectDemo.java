package day10TNSIFArray;

import day5TNSIF.Hierarchicalinheritance.Student;

public class ARRAYOfObjectDemo {
	
	public static void main(String[] args) {

		// declares an array 
		Student[] arr;
		
		//allocating memory for 5 objects of type student
		arr = new Student[5];
		
		//initialize the elements of array
		arr[0] = new Student();
		arr[1] = new Student();
		arr[2] = new Student();
		arr[3] = new Student();
		arr[4] = new Student();
		
		// accessing the elements of the specified array
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("Element at "+i+" : "+ arr[6].getRollno()+" "+ arr[6].getName());
		}
		
		
		
		
	}

}


