import java.util.Scanner;
public class PizzaOrder52{
  public static void main(String [] args){
     Scanner input= new Scanner(System.in);
      double Pepadd=0.00;
      double Sausadd=0.00;
      double Vegiadd=0.00;
      double TotalPeperoniSum=0.00;
      double TotalSausageSum=0.00;
      double TotalVegiSum=0.00;
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
      
      System.out.print("Enter amount of pizza: ");
      int amount= input.nextInt();
      
      if (Option == 1 && size.equals("S")){
          topping= "Pepperoni";
          price=7.50;
          Pepadd +=7.50 * amount;
      }else if (Option == 1 && size.equals("M")){
         topping="Pepperoni";
          price=8.50;
          Pepadd+=8.50*amount;
      }else if (Option == 1 && size.equals("L")){
        topping="Pepperoni";
          price=9.50; 
          Pepadd+=9.50*amount;
      }else if (Option == 2 && size.equals("S")){
         topping = "Sausage";
         price = 6.50;
         Sausadd+=6.50*amount;
      }else if (Option == 2 && size.equals("M")){
         topping= "Sausage";
         price= 7.50;
         Sausadd+=7.50*amount;
      }else if (Option == 2 && size.equals("L")){
         topping= "Sausage";
         price= 8.50;
         Sausadd+=8.50*amount;
      }else if (Option == 3 && size.equals("S")){
         topping= "Veggie";
         price= 5.50;
         Vegiadd+=5.50*amount;
      }else if (Option == 3 && size.equals("M")){
         topping= "Veggie";
         price= 6.50;
         Vegiadd+=6.50*amount;
      }else if (Option == 3 && size.equals("L")){
         topping= "Veggie";
         price= 7.50;
         Vegiadd+=7.50*amount;
      }
      
     double Subtotal= price*amount;
      double individualtax = 0.1*Subtotal;
      double total=Subtotal+individualtax;
    
      double tax = 0.1*Pepadd;
      TotalPeperoniSum=Pepadd+tax;
      
     
      tax = 0.1*Sausadd;
      TotalSausageSum=Sausadd+tax;
      
      tax = 0.1*Vegiadd;
      TotalVegiSum=Vegiadd+tax;
     

      System.out.print("Billinig:");
      System.out.print("\nTopping: "+topping);
      System.out.print("\nSize: "+size);
      System.out.printf("\nPrice: $%.2f",price);
      System.out.printf("\nAmount: %d",amount);
      System.out.printf("\nSubtotal: $%.2f",Subtotal);
      System.out.printf("\nTax: $%.2f",individualtax);
      System.out.printf("\nTotal: $%.2f \n\n",total);
     }while (true);
      
     System.out.print("\nOrder Summary:");
     System.out.printf("\nPepperoni: %.2f",TotalPeperoniSum);
     System.out.printf("\nSausage: %.2f",TotalSausageSum);
     System.out.printf("\nVeggie: %.2f",TotalVegiSum);
     System.out.printf("\nTotal Pizza Order: %.2f",TotalPeperoniSum+TotalSausageSum+TotalVegiSum);
    
  }
}