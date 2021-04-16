public class orderpractise{
 private int OrderNumber;
 private String OrderType;

 
 public orderpractise(){
  this.OrderNumber=0;
  this.OrderType="";
 }
 public orderpractise(int OrderNumber,String OrderType){
 this.OrderNumber = OrderNumber; 
 this.OrderType= OrderType;
 }
 
 
 public void setOrderNumber(int OrderNumber){
     this.OrderNumber=OrderNumber;
 }
 public int getOrderNumber(){
  return this.OrderNumber;
  
 }
 public void setOrderType(String OrderType){
     this.OrderType=OrderType;
  
}
  public String getOrderType(){
  return this.OrderType;
  
 }
}