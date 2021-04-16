public class Employee{
  private String firstName;
  private String lastName;
  
  //constructor is a still specail kind of method because
  //it doesnot require return type (not even a void)
  //name of constructor must be same name as a class
  
  public Employee(){//it is a default constructor
     this.firstName="";
     this.lastName= "";
  }
  
  public Employee(String firstName, String lastName){//not default over load
    this.firstName=firstName;
     this.lastName= lastName;
    
  }
  
  public void setFirstName(String firstName){//setting a name to use by the empployeemonthly
    this.firstName= firstName;
  }
  public String getFirstName(){
   return this.firstName;
    
  }
    
     public void setLastName(String lastName){//setting a name to use by the empployeemonthly
    this.lastName= lastName;
  }
      public String getLastName(){
   return this.lastName;
    
  }
      public void displayInfo(){//printing method
        System.out.println("Name of the employee: "+ this.firstName + " "+ this.lastName);
      }
}