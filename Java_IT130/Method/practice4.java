import java.util.Scanner;
public class practice4{
  public static void main(String [] args){
    Scanner input= new Scanner(System.in);
    
   System.out.print("Enter a number of students: ");
   int Students = input.nextInt();
   double Score[]=new double[Students];
   
   for(int i=0; i< Score.length;i++){
     System.out.printf("Enter score of students %d: ",i+1);
      Score[i]=input.nextDouble();
   }
   double bestScore= Score[0];
   
   for(int i=0; i< Score.length;i++){
     if(bestScore<Score[i]){
      bestScore=Score[i]; 
     }
   }
   System.out.printf("Best Score is: %.2f",bestScore);
   String LetterGrade[]= new String [Students];
   for(int i=0; i< Score.length;i++){
     if(Score[i]>=(bestScore-10)){
       LetterGrade[i]= "A";
     }else if(Score[i]>=(bestScore-20)){
      LetterGrade[i]="B" ;
     }else if(Score[i]>=(bestScore-30)){
      LetterGrade[i]="C"; 
     }else if(Score[i]>=(bestScore-40)){
      LetterGrade[i]="D"; 
     }else{
      LetterGrade[i]="F";  
     }
     
     
     
   
  System.out.printf("\nStudent %d get %f and grade: %s",i+1,Score[i],LetterGrade[i]);
  }
}
}