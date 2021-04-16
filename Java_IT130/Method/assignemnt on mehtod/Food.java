public class Food extends Order{
 
  private String FoodType;
  private String FoodName;
  private int Quantity;
  private double Price;
  
  public Food(){
    super();
   this.FoodType="";
   this.FoodName="";
   this.Quantity=0;
   this.Price=0.00;
   
  }
  public Food(int OrderNumber, String OrderType, String FoodType, String FoodName, int Quantity, double Price){
    super(OrderNumber, OrderType);
   this.FoodType=FoodType;
   this.FoodName=FoodName;
   this.Quantity=Quantity;
   this.Price=Price;
  }
  
  public void setFoodType(String FoodType){
   this.FoodType=FoodType; 
  }
  public String getFoodType(){
   return this.FoodType; 
  }
   public void setFoodName(String FoodName){
   this.FoodName=FoodName; 
  }
  public String getFoodName(){
   return this.FoodName; 
  }
  
  public void setQuantity(int Quantity){
   this.Quantity=Quantity; 
  }
  public int getQuantity(){
   return this.Quantity; 
  }
  public void setPrice(double Price){
   this.Price=Price; 
  }
  public double getPrice(){
   return this.Price; 
  }
  public double subtotal(){
   return this.Price * this.Quantity; 
  }
  public void displayInfo(){
   System.out.print(getFoodType()+" "+getFoodName());
   System.out.printf("\n%d x %.2f %.2f\n",getQuantity(),getPrice(),subtotal());
  }
}