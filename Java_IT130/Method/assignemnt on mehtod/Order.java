public class Order{
 private int OrderNumber;
 private String OrderType;
 
 
 public Order(){
  this.OrderNumber=0;
  this.OrderType="";   
 }
 public Order(int OrderNumber, String OrderType){
   this.OrderNumber=OrderNumber;
   this.OrderType= OrderType;
    }
 
 public void setOrderNumber(int OrderNumber){
  this.OrderNumber= OrderNumber; 
 }
 public int getorderNumber(){
  return this.OrderNumber; 
 }
  
 public void setOrderType(String OrderType){
  this.OrderType=OrderType; 
 }
 public String getOrderType(){
   return this.OrderType;
 }
  
}