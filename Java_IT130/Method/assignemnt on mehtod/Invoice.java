public class Invoice{
  private String partNumber;
  private String description;
  private int quantity;
  private double price;
  
  public Invoice(){
   this.partNumber="";
   this.description="";
   this.quantity=0;
   this.price=0.00;
  }
  public Invoice(String partNumber, String description, int quantity, double price){
     this.partNumber=partNumber;
   this.description=description;
   this.quantity=quantity;
   this.price=price;
  }
  public void setPartNumber(String partNumber){
 this.partNumber=partNumber;    
  }
  public String getPartNumber(){
 return this.partNumber;  
  }
   public void setDescription(String description){
 this.description=description; 
} 
   public String getDescription(){
  return this.description; 
   }
   public void setQuantity(int quantity){
    this.quantity=quantity;
   }
    public int getQuantity(){
    return this.quantity;
    }
   public void setPrice(double price){
    this.price=price; 
   } public double getPrice(){
    return this.price; 
   }
   public double getInvoiceAmount(){
    return this.price* this.quantity;
   }
   public void displayinfo(){
    System.out.printf("Part Number: %s",getPartNumber());
    System.out.printf("\nPart Description: %s",getDescription());
    System.out.printf("\nPrice: %.2f",getPrice());
    System.out.printf("\nQuantity: %d",getQuantity());
    System.out.printf("\nPart Description: %.2f",getInvoiceAmount());
    
     
   }
   }