package day3TNSIF;

public class EncapsulationDemo {
	
	  public static void main(String[] args) {
		  
		  OopsConceptDemo obj=new OopsConceptDemo() ;
		  
		  obj.setSerialNum(101);
		  obj.setName("Akshu");
		  obj.setAge(23);
		  
		  System.out.println(obj);
	  }

}
