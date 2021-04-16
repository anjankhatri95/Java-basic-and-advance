import java.util.Scanner;
public class practise2families{
  public static void main(String [] args){
    Scanner input =new Scanner(System.in);
    System.out.print("How many family's member do you have? ");
    int member= input.nextInt();
    
    double income[]= new double[member];
   double maximum=income[0];
    for(int i=0; i<income.length;i++){       
      System.out.printf("please enter income of family member %d: ",i+1);
       income[i] = input.nextDouble();
       if (maximum<income[i]){
        maximum=income[i]; 
       }
       
  }
    double tenpercent=0.10*maximum;
    int count=0;
    for(int i=0; i<income.length;i++){
      if(income[i]<tenpercent){
        count++;
      }
      System.out.printf("\nIncome of family %d is $%.2f",i+1,income[i]);
    }
    System.out.printf("\nMaximum income: $%.2f",maximum);
    System.out.printf("\n10 percent of maximum income: %.2f",tenpercent);
    System.out.printf("\nNumber of families whose income is below 10 percent:%d",count); 
   
}
}