public class billing {
  public static void main(String [] args){
    
    Food item1= new Food();
    item1.setOrderNumber(1);
    item1.setOrderType("Dine-in");
    item1.setFoodType("Appetizer");
    item1.setFoodName("Fried Caramari");
    item1.setQuantity(1);
    item1.setPrice(6.95);
    System.out.println("Billing Summary -" +item1.getOrderType());
    System.out.printf("Order No. %d",item1.getorderNumber());   
    System.out.printf("\n%s %s",item1.getFoodType(),item1.getFoodName());
    System.out.printf("\n%dx%.2f %.2f\n",item1.getorderNumber(),item1.getPrice(), item1.subtotal());
    
    Food item2 = new Food(1, "Dine-in","Entree","Grilled Salmon",2,15.99);
   item2.displayInfo();
     
    Drink item3=new Drink(1,"Dine-in","Coke",3,1.95);
   item3.displayInfo();
   
   double Subtotal= item1.subtotal()+item2.subtotal()+item3.subtotal();
   double Tax= 0.10*(item1.subtotal()+item2.subtotal()+item3.subtotal());
   double Total=Subtotal+Tax;
    
    System.out.printf("\nSubtotal: %.2f ",Subtotal);
    System.out.printf("\nTax: %.2f",Tax);
    System.out.printf("\nTotal: %.2f",Total);
}
}