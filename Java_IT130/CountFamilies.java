import java.util.Scanner;

public class CountFamilies{
  public static void main(String [] args){
   Scanner input = new Scanner(System.in);
   
   System.out.print("How many family's member do you have? ");
   int numberOfMember = input.nextInt();
   
   double income[] = new double [numberOfMember];
   double maximum=income[0];
   for (int i=0; i<income.length;i++){
     System.out.printf("please enter income of family member %d: ",i+1);
     income[i]= input.nextDouble();
   if (income[i]> maximum){
      maximum= income[i]; 
     }
   
   }
   double tenpercent= maximum*0.10;
   int count=0;
   for (int i=0; i<income.length; i++){
     if(income[i]<tenpercent){
       count++; 
     }
     System.out.printf("\nIncome of Family %d is $%.2f",i+1, income[i]);
   }  
   
     System.out.printf("\nMaximum income: $%.2f",maximum);
    System.out.printf("\n10 percent of maximum income: $%.2f",tenpercent);
    System.out.printf("\nNumber of families whose income is below 10 percent: %d",count);
  }
}