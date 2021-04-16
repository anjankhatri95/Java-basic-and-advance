import java.util.Scanner;

public class ScoreStat{
  public static void main(String [] args){
   Scanner input = new Scanner(System.in);
   
   System.out.print("Enter student name: ");
   String name = input.nextLine();
   
   int Score [] = new int [10];
   int total=0; 
   int passingScore=0;
   int failingScore=0;
   for (int i=0; i<Score.length ;i++){
     System.out.printf("Enter score %d: ",i+1);
      Score[i] = input.nextInt();
      total +=Score[i];
      if(Score[i]<50){
       failingScore++;
      }else if(Score[i]>=50){
       passingScore++; 
      }
      
   } 
   double average = total/10.0;
   System.out.printf("Score Summary of %s",name);
  System.out.printf("\nAverage Score: %.1f",average);
   System.out.printf("\nNumber of Passing Score: %d",passingScore);
   System.out.printf("\nNumber of Failing Score: %d",failingScore);
   
    
  }
}