import java.util.Scanner;

public class practiseArray1{
  public static void main(String [] args){
    Scanner input= new Scanner(System.in);
    
    System.out.print("Enter Student name: ");
    String Name= input.nextLine();
    
    int Score[] = new int[10];
    double total=0;
    int PassingScore=0;
    int FailingScore=0;
    for(int i= 0; i<10;i++){
      System.out.printf("Enter score %d: ",i+1);
      Score[i]=input.nextInt();
     total+=Score[i];
     if(Score[i]>=50){
       PassingScore++;
     }else if(Score[i]<=49){
      FailingScore++; 
     }
    }
    System.out.printf("Score Summary of %s",Name);
    System.out.printf("\nAverage Score: %.2f",total/10);
    System.out.printf("\nNumber of passing score: %d",PassingScore);
    System.out.printf("\nNumber of failing score: %d",FailingScore);
    
    
    
  }
}