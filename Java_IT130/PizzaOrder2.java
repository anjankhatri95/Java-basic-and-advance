import java.util.Scanner;
public class PizzaOrder2{
  public static  void main(String [] args){
    
    Scanner input = new Scanner(System.in);
    for (int i=1; i<=2;i++){
    System.out.print("Pizza Order - Select Topping");
    System.out.println("\n1. Pepperoni \n2. Sausage \n3. Veggie");
    int Option = input.nextInt();
     double price=0.00;
     String topping="";
     
    if (Option==1){
       topping="Pepperoni"; 
       price=9.50; 
    }else if (Option==2){
      topping="Sausage";
      price=8.50;
    }else if(Option==3){
     topping = "Veggie";
     price=7.50;
    }else{
     System.out.println("Wrong topping!!!"); 
     return;
    }
    System.out.print("Enter amount of pizza: ");
    int amount = input.nextInt();
 
        double Subtotal= price*amount;
        double tax= Subtotal*0.1;
        double total= Subtotal+tax;
    
    System.out.print("Billing:");
    System.out.print("\nTopping: "+topping);
    System.out.printf("\nPrice: $%.2f",price);
    System.out.printf("\nAmount: %d",amount);
    System.out.printf("\nSubtotal: $%.2f",Subtotal);
    System.out.printf("\nTax: $%.2f",tax);
    System.out.printf("\nTotal: $%.2f \n\n",total);
    }
    }
  
}