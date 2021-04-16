public class EmployeeMonthly extends Employee{
  private double salary;
  
  public EmployeeMonthly(){//creating constructor
     super();//super call the parents default constructor
     this.salary=0.00;
  }
  public EmployeeMonthly(String firstName, String lastName, double salary){
   super(firstName, lastName);//calling overloaded constructor
   this.salary= salary;
  }
  
    public void setSalary(double salary){//setting a name to use by the empployeemonthly
    this.salary= salary;
      }
    
    public double getSalary(){
     return this.salary; 
    }
     public void displayInfo(){//printing method
        System.out.println("Name of the employee: "+ getFirstName() + " "+ getLastName());
        System.out.printf("Salary: $%.2f\n",this.salary);
      }
     
}