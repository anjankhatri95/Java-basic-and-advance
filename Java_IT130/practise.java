import java.util.Scanner;

public class practise{
  public static void main(String [] args){
   Scanner input= new Scanner(System.in);
   
   System.out.print("Delivery Service");
   int Choice=0;
   int Localdistance=0;
   double totalLocal=0.00;
   int LongDistance=0;
   double totalLong=0.00;
   double totalfee=0.00;
   do {
   System.out.print("\nEnter Distance (1) Local- (2) Long Distance: ");
   int Distance= input.nextInt();
    
    System.out.print("Enter weight: ");
    double weight= input.nextDouble();
      double fee=0.00;
      String distancetype="";
    
    if (Distance ==1 && weight<5){
        distancetype= "Local";
        fee= 12.00;
        Localdistance++;
        totalLocal += 12.00;
    }else if (Distance==1 && weight>=5 && weight<=20){
       distancetype="Local";
       fee= 16.50;
       Localdistance++;
       totalLocal +=16.50;
    }else if(Distance==1 && weight>20){
      distancetype="Local";
      fee=22.00;
      Localdistance++;
      totalLocal +=22.00;
    }else if (Distance==2 && weight<5){
     distancetype="Long Distance";
     fee=35.00;
     LongDistance++;
     totalLong +=35.00;
    }else if (Distance==2 && weight>=5){
     distancetype="Long Distance";
     fee=47.95;
     LongDistance++;
     totalLong +=47.95;
    }
    System.out.printf("Delivery Type: %s -Weight: %.2f pounds",distancetype,weight);
    System.out.printf("\nFee: $%.2f",fee);
    
   System.out.print("\n (1) to continue : (0) to exit: ");
   Choice= input.nextInt();
   
   }while (Choice==1);
   
   System.out.print("Summary of Deliver Services");
   
   System.out.printf("-Local Delivery: %d items",Localdistance);
   System.out.printf("-Total Local Delivery: $%.2f",totalLocal);
   System.out.printf("-Long Distance Delivery: %d items",LongDistance);
   System.out.printf("-Total Long Delivery: $%.2f ",totalLong);
   System.out.printf("-Total Fee: $%.2f",totalfee);
   System.out.print("End of the Program");
  }
  
}