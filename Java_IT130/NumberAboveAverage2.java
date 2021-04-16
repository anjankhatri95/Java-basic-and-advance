import java.util.Scanner;
public class NumberAboveAverage2{
  public static void main(String [] args){
     
    Scanner input = new Scanner(System.in);
    
    double temperature []= new double[10];
    int total=0;
    int count=0;
    for(int i=0; i<temperature.length;i++){
       System.out.printf("Enter Day %d: ",i+1);
       temperature[i] = input.nextDouble();   
       total += temperature[i];
       
    }
    double average= total/10.0;
    for(int i=0;i<temperature.length;i++){   
       if (temperature[i]>average){
       count++; 
    }
    }
    System.out.printf("Average = %.1f",average);
    System.out.printf("\nNumber of days above average: %d",count);
    
    for(int i=0; i<temperature.length;i++){
        if (temperature[i]>average){
      System.out.printf("\nDays %d: %.1f",i+1,temperature[i]); 
        }
    }
    
  }
}