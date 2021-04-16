import java.util.Scanner;
public class PizzaOrder4{
  public static void main(String [] args){
     Scanner input= new Scanner(System.in);
     do{
     System.out.print("Pizza Order - Select Topping");
      System.out.println("\n1. Pepperoni \n2. Sausage \n3. Veggie \n4. Exit");
      int Option = input.nextInt();
            if (Option==4){
           System.out.print("Thank you for ordering");
           break;
            }
      System.out.print("Enter Size: S - Small : M - Medium : L - Large ");
      String size = input.next();   
      double price =0.00;
      String topping= "";
      if (Option == 1 && size.equals("S")){
          topping= "Pepperoni";
          price=7.50;
      }else if (Option == 1 && size.equals("M")){
         topping="Pepperoni";
          price=8.50; 
      }else if (Option == 1 && size.equals("L")){
        topping="Pepperoni";
          price=9.50; 
      }else if (Option == 2 && size.equals("S")){
         topping = "Sausage";
         price = 6.50;
      }else if (Option == 2 && size.equals("M")){
         topping= "Sausage";
         price= 7.50;
      }else if (Option == 2 && size.equals("L")){
         topping= "Sausage";
         price= 8.50;
      }else if (Option == 3 && size.equals("S")){
         topping= "Veggie";
         price= 5.50;
      }else if (Option == 3 && size.equals("M")){
         topping= "Veggie";
         price= 6.50;
      }else if (Option == 3 && size.equals("L")){
         topping= "Veggie";
         price= 7.50;
      } 
      System.out.print("Enter amount of pizza: ");
      int amount= input.nextInt();
      
      double Subtotal= price*amount;
      double tax = 0.1*Subtotal;
      double total=Subtotal+tax;
      
      System.out.print("Billinig:");
      System.out.print("\nTopping: "+topping);
      System.out.print("\nSize: "+size);
      System.out.printf("\nPrice: $%.2f",price);
      System.out.printf("\nAmount: %d",amount);
      System.out.printf("\nSubtotal: $%.2f",Subtotal);
      System.out.printf("\nTax: $%.2f",tax);
      System.out.printf("\nTotal: $%.2f \n\n",total);
     }while (true);
               
  }
}