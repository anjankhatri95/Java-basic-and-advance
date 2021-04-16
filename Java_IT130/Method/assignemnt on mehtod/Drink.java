public class Drink extends Order{
  private String DrinkName;
  private int DrinkQuantity;
  private double DrinkPrice;
  
  public Drink(){
    super();
   this.DrinkName=""; 
   this.DrinkQuantity=0;
   this.DrinkPrice=0.00;
  }
  public Drink(int OrderNumber,String OrderType,String DrinkName,int DrinkQuantity,double DrinkPrice){
   super(OrderNumber,OrderType);
   this.DrinkName=DrinkName;
   this.DrinkQuantity=DrinkQuantity;
   this.DrinkPrice=DrinkPrice;
  }
  public void setDrinkName(String DrinkName){
   this.DrinkName=DrinkName;
  }
  public String getDrinkName(){
   return this.DrinkName; 
  }
  public void setDrinkQuantity(int DrinkQuantity){
   this.DrinkQuantity=DrinkQuantity; 
  }
  public int getDrinkQuantity(){
  return this.DrinkQuantity; 
  }
  public void setDrinkPrice(double DrinkPrice){
   this.DrinkPrice=DrinkPrice; 
  }
  public double getDrinkPrice(){
   return this.DrinkPrice; 
  }
  public double subtotal(){
   return this.DrinkPrice*this.DrinkQuantity; 
  }
  public void displayInfo(){
   System.out.print(getDrinkName());
   System.out.printf("\n%dx%.2f  %.2f",getDrinkQuantity(),getDrinkPrice(),subtotal());
  }
  
}