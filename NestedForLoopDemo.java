package day2TNSIF;

public class NestedForLoopDemo {
	
	   public static void main(String[] args) {
		   
		     int beg=10;
		     int end=20;
		     
		     
		     for(int i=beg; i<=end; i++) // outer loop
		     {
		    	 for(int j=1; j<=10; j++)// inner loop
		    	 {
		    		 System.out.println(i+"*"+j+"= "+ i*j);
		    	 }
		    	 System.out.println();
		     }
	   }

}
