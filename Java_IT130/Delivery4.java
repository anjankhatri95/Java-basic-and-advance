import java.util.Scanner;

public class Delivery4 {
  public static void main(String [] args){
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Delivery Service"); 
      double totalfee=0.00;
      int local = 0;
      int longdistance= 0;
      double localadd= 0;
      double longadd=0;
     
     
    do{
    System.out.print("\nEnter Distance (1) Local - (2) Long Distance: ");
    int distance = input.nextInt();
 
    System.out.print("Enter Weight: ");
    double weight= input.nextDouble();
    
    double fee= 0.00;
    String deliverytype="a";
       
    if (distance ==1 && weight<5){
      deliverytype= "local";
      fee= 12.00;
        local++;
        localadd += fee;
      
    }else if (distance==1 && weight >= 5 && weight <=20){
      deliverytype= "local";
      fee = 16.50;
      local++;
      localadd += fee;
    }else if (distance==1 && weight>20){
      deliverytype= "local";
      fee = 22.00;
      local++;
      localadd += fee;
    
    }else if (distance==2 && weight <5){
      deliverytype= "Long Distance";
      fee = 35.00;
      longdistance++;
      longadd += fee;
    }else if (distance==2 && weight >=5){
      deliverytype= "Long Distance";
      fee= 47.95; 
      longdistance++;
      longadd +=fee;
    }
      totalfee += fee;
      
    System.out.printf("Delivery Type: %s - Weight: %.1f pounds", deliverytype, weight);
    System.out.printf("\nFee : $%.2f", fee);
    
    System.out.print("\n (1) to continue: (0) to exit: ");
     int Option= input.nextInt();
     
    if (Option==1){
      continue;
    }else if (Option == 0){
     break;
    }
      
        
    }while (true);
    System.out.print("\nSummary of Delivery Services: ");
    System.out.print("\n -Local Deliveries: "+local+" items.");
    System.out.printf("\n -Total Local Deliveries Fee: $%.2f",localadd);
    System.out.print("\n -Long Distance Deliveries: "+longdistance+ " items.");
    System.out.printf("\n -Total Long Distance Deliveries Fee: $%.2f",longadd);
    System.out.printf("\nTotal Fee: $%.2f",totalfee);
    System.out.print("\nEnd of program");
  }
}