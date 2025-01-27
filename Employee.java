package day5TNSIF.MultilevelInheritance;

import java.time.LocalDate;  // Recommended instead of Date

public class Employee extends Person {
    
    private String deptName;
    private double baseSalary;

    public Employee(String name, long contactNo, LocalDate dateOfBirth, String deptName, double baseSalary) {
        super(name, contactNo, dateOfBirth);  // Call Person constructor
        this.deptName = deptName;
        this.baseSalary = baseSalary;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return String.format(
            "Employee [deptName=%s, baseSalary=%.2f, name=%s, contactNo=%d, dateOfBirth=%s]", 
            deptName, baseSalary, getName(), getContactNo(), getDateOfBirth()
        );
    }
}


	
	
  




