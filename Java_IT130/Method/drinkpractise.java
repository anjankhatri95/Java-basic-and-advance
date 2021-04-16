public class drinkpractise extends orderpractise{
   private String Dname;
   private int quantity;
   private double price;
   
   public drinkpractise(){
    super();
    this.Dname="";
    this.quantity=0;
    this.price=0.00;
    
   } 
   public drinkpractise(int OrderNumber, String OrderType, String Dname, int quantity, double price){
    super(OrderNumber, OrderType);
    this.Dname=Dname;
    this.quantity=quantity;
    this.price=price;
    
   }
   public void setDname(String Dname){
    this.Dname=Dname; 
   }
   public String getDname(){
    return this.Dname; 
   }
   public void setquantity(int quanity){
    this.quantity=quantity; 
   }
   public int getquantity(){
   return this.quantity; 
   }
   public void setprice(double price){
    this.price=price; 
   }
   public double getprice(){
    return this.price; 
   }
   public double subtotal(){
    return this.price*this.quantity; 
   }
   
     
   }
