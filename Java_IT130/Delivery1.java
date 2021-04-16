import java.util.Scanner;

public class Delivery1 {
  public static void main(String [] args){
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Delivery Service");
    
    System.out.print("\nEnter Distance (1) Local - (2) Long Distance: ");
    int distance = input.nextInt();
    
    System.out.print("Enter Weight: ");
    double weight= input.nextDouble();
    
    double fee= 0.00;
    String deliverytype="a";
    
    if (distance ==1 && weight<5){
      deliverytype= "local";
      fee= 12.00;
    }else if (distance==1 && weight >= 5 && weight <=20){
      deliverytype= "local";
      fee = 16.50;
    }else if (distance==1 && weight>20){
      deliverytype= "local";
      fee = 22.00;
    
    }else if (distance==2 && weight <5){
      deliverytype= "Long Distance";
      fee = 35.00;   
    }else if (distance==2 && weight >=5){
      deliverytype= "Long Distance";
      fee= 47.95; 
    }else{
     System.out.print("Invalid delivery type"); 
    }
    System.out.printf("\n Delivery Type: %s - Weight: %.1f pounds", deliverytype, weight);
    System.out.printf("\n Fee : $%.2f", fee);
    
    
    
  }
}