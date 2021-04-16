public class InvoiceTest{
  public static void main(String [] args){
   Invoice Invoice1 = new Invoice();
    Invoice1.setPartNumber("1001");
    Invoice1.setDescription("Cordless Drill");
    Invoice1.setQuantity(5);
    Invoice1.setPrice(71.99);
    System.out.printf("Invoice 1");
    System.out.printf("\n Part Number: %s", Invoice1.getPartNumber());
    System.out.printf("\n Part Description: %s", Invoice1.getDescription());
    System.out.printf("\n Price: $%.2f", Invoice1.getPrice());
    System.out.printf("\n Quantity: %d", Invoice1.getQuantity());
    System.out.printf("\n Invoice Amount (USD): $%.2f\n", Invoice1.getQuantity()*Invoice1.getPrice());
                        
  Invoice Invoice2 = new Invoice("1002","Impact Driver", 2, 99.2);
  System.out.println("\n Invoice 2 ");
   Invoice2.displayinfo();
  
  
  }
  }