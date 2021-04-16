import java.util.Scanner;
public class Grade{
  public static void main(String [] args){
   
    Scanner input= new Scanner(System.in);
    
    System.out.print("Enter a number of students: ");
    int Studentsize= input.nextInt();
    
    int grade[]= new int[Studentsize];
    
    for(int i=0; i<grade.length;i++){
     System.out.printf("Enter score of student %d: ",i+1);
      grade[i]=input.nextInt();
    }
    int bestScore= grade[0];
    for(int i=0; i<grade.length;i++){
      if(grade[i]>bestScore){
        bestScore=grade[i];
      }
    }
    System.out.printf("Best Score is :%d",bestScore);
       
       String LetterGrade[]=new String[Studentsize];
    for(int i=0; i<grade.length;i++){
      if(grade[i]>=(bestScore-10)){
         LetterGrade[i]="A";
      }else if(grade[i]>=(bestScore-20)){
        LetterGrade[i]="B";
      }else if(grade[i]>=(bestScore-30)){
        LetterGrade[i]="C";
      }else if(grade[i]>=(bestScore-40)){
        LetterGrade[i]="D";
      }else{
        LetterGrade[i]="F";
      }
      System.out.printf("\nStudent %d is %d and grade is %s.",i+1,grade[i],LetterGrade[i]);
    }
    
  }
}