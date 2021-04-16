public class foodpractise extends orderpractise{
  private String Type;
  private String name;
  private int Quantity;
  private double price;
  
  public foodpractise(){
    super();
   this.Type="";
   this.name="";
   this.Quantity=0;
   this.price=0.00;
  }
  public foodpractise(int OrderNumber, String OrderType,String Type,String name,int Quantity,double price){
   super(OrderNumber,OrderType);
     this.Type=Type;
     this.name=name;
     this.Quantity=Quantity;
     this.price=price;
  }
  public void setType(String Type){
   this.Type=Type; 
  }
  public String getType(){
   return this.Type; 
  }
    public void setname(String name){
   this.name=name; 
  }
  public String getname(){
   return this.name; 
  }
    public void setQuantity(int Quantity){
   this.Quantity=Quantity; 
  }
  public int getQuantity(){
   return this.Quantity; 
  }
    public void setPrice(double price){
      this.price=price; 
  }
  public double getPrice(){
   return this.price; 
  }
  public double subtotal(){
   return this.price*this.Quantity; 
  }

}
  
