import java.util.Scanner;
 
public class LoanInstallmentPlanselection{
  public static void main( String [] args){
    
    Scanner input= new Scanner(System.in);
    
    System.out.println("First Name: ");
    String FirstName= input.nextLine();
    
    System.out.println("Last Name: ");
    String LastName= input.nextLine();
    
    System.out.println("Billing Address: ");
    String Address = input.nextLine();
    
    System.out.println(" Loan amount: ");
    double LoanAmount= input.nextDouble();
    
    System.out.println("Term of loan: ");
    int TermOfLoan=input.nextInt();
    
    System.out.println("What is your credit score?");
    int CreditScore= input.nextInt();
    
    
    //calculation section
    
    double interestrate= 0.0;  
     //make a decision and condition
    if (CreditScore>0) {
       interestrate= 0.039;           
    }
   
    
    
    double InterestAmount= LoanAmount*interestrate;
    double totalLoanAmount= LoanAmount+InterestAmount;
    double MonthlyPayment= totalLoanAmount/TermOfLoan;
    
    //output section
    System.out.println("Borrower: "+FirstName +" "+LastName);
    System.out.println("Billing address: "+Address);
    System.out.printf("Loan amount: $%.2f", LoanAmount);
    System.out.printf("\n Interest amount: $%.2f", InterestAmount);
    System.out.printf(" \n Total loan amount: $%.2f", totalLoanAmount);
    System.out.println("\n Terms of  loan (months): "+TermOfLoan+" months");
    System.out.printf("Monthly Payment: $%.2f",MonthlyPayment);
    
    
    
         
  }
}