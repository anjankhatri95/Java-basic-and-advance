public class BillingPractise{
  public static void main(String [] args){
   
    foodpractise item1=new foodpractise();
    item1.setOrderNumber(1);
    item1.setOrderType("dine-in");
    item1.setType("Appetizer");
    item1.setname("samosa");
    item1.setQuantity(1);
    item1.setPrice(3.99);
    
    drinkpractise item3=new drinkpractise(1,"dine-in","coke",3,1.95);
    
    foodpractise item2= new foodpractise(1,"dine-in","entree","Grilled salmon",2,15.99);
    
    double subtotal= (item1.subtotal()+item2.subtotal()+item3.subtotal());
    double tax= 0.10*subtotal;
    double total= subtotal+tax;
    
    System.out.printf("Billing Summary - %s",item1.getOrderType());
    System.out.printf("\nOrder No. %d",item1.getOrderNumber());
    System.out.printf("\n%s %s",item1.getType(),item1.getname());
    System.out.printf("\n%d x %.2f %.2f ",item1.getQuantity(),item1.getPrice(),item1.subtotal());
  System.out.printf("\n%s %s ",item2.getOrderType(),item2.getname());
  System.out.printf("\n%d x %.2f %.2f",item2.getQuantity(),item2.getPrice(),item2.subtotal());
  System.out.printf("\n%s",item3.getDname());
  System.out.printf("\n%d x %.2f %.2f",item3.getquantity(),item3.getprice(),item3.subtotal());
  System.out.printf("\nSubtotal: %.2f",subtotal);
  System.out.printf("\nTax: %.2f",tax);
  System.out.printf("\nTotal:%.2f",total);
  }
  
}