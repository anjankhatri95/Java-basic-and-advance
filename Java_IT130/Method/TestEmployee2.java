public class TestEmployee2{
  public static void main(String [] args){
     Employee emp1= new Employee();
     emp1.setFirstName("John");
     emp1.setLastName("Doe");
    System.out.println(emp1.getFirstName()); //instead of doing this over and over again we can create a method to print.
     System.out.println(emp1.getLastName());
     
     EmployeeMonthly emp2= new EmployeeMonthly();
     emp2.setFirstName("Jane");
     emp2.setLastName("Smith");
     emp2.setSalary(5000.00);
      System.out.println(emp2.getFirstName());
     System.out.println(emp2.getLastName());
      System.out.println(emp2.getSalary());
      
      Employee emp3= new Employee("Tom","Smith");
      emp3.displayInfo();
      emp2.displayInfo();
      emp1.displayInfo();
      
        EmployeeMonthly emp4= new EmployeeMonthly("David", "R", 5000.00);
        emp4.displayInfo();
    
  }
}