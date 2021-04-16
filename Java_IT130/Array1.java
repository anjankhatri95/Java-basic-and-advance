import java.util.Scanner;

public class Array1{
  public static void main(String [] args){
    Scanner input= new Scanner(System.in);
    System.out.println("Please enter the size of the array: ");
    int SizeArray = input.nextInt();
    
    int score [] = new int [SizeArray];
    
    for(int i= 0; i<score.length; i++){
      System.out.printf("Enter score %d: ", i+1);
     /* int s = input.nextInt();
      score[i]=s; */
      score[i]=input.nextInt();
    }
     for(int i= 0; i<score.length; i++){
      
       System.out.printf("Score %d is :%d. \n", i+1, score[i]);
    }
     int lowest = score[0];
      for(int i= 0; i<score.length; i++){
        if(score[i]<lowest){  
          lowest= score[i]; 
        }
        
    }
      System.out.printf("Lowest is %d \n",lowest);
      
      int sum=0;
      
  for(int i= 0; i<score.length; i++){
    sum += score[i];
    }
  System.out.printf("Sum is %d \n",sum);
  
  int count=0;
  for(int i= 0; i<score.length; i++){
    if(score[i] <= 5){
      count++;
    }
  }
  System.out.printf("failing number %d \n",count);
  }
   
}