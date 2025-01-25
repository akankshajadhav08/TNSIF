package day5TNSIF.Hierarchicalinheritance;

public class Employee extends Person{
	
	private String companyName;
    private String Designation;
    
    public Employee()
    {
    	System.out.println("Employee class default constructor");
    }
    
     public Employee(String name, String city, String companyName , String designation)
     {
    	 super(name,city);
    	 this.companyName= companyName;
    	 this.Designation=Designation;
    	 
     }
     
     public String getCompany() {
    	 return companyName;
     }
     
     public void setCompanyName(String companyName) {
    	 this.companyName = companyName;
     }
     
     public String getDesignation() {
    	 return Designation;
     }
     
     public void setDesignation(String designation) {
    	 Designation = designation;
     }
     
     @Override
     public String toString() {
    	 return "Employee [companyName=" + companyName +", Designation="+ Designation +" , getClass()="+getClass()+",hashcode()="+ hashcode()+",toString()="+ super.toString()+"]";
     }
     
     
     
} 
     
     
     
     
     
     
     
     
     
     
}
