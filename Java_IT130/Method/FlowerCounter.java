import java.util.Scanner;

public class FlowerCounter{
  public static void main(String [] args){
     Scanner input = new Scanner(System.in);
     
  String Flowers[]=new String[5];
      Flowers[0]= "Pentunia";
      Flowers[1]="Pansy";
      Flowers[2]= "Rose";
      Flowers[3]="Violet";
      Flowers[4]= "Carnation";
    double cost[]=new double[Flowers]; 
      
      do{
   System.out.print("Enter a name of flowers from the following list:\nPetunia, pansy, rose, violet, canation, OR quit");
   String Flower=input.nextLine();
   for(int i=0;i<Flowers.length;i++){
   if (Flower="Pentunia"){
     cost[i]= 0.50;
   }else if (Flower="Pansy"){
     cost[i]= 0.75;
   }else if (Flower="Rose"){
     cost[i]= 1.50;
   }if (Flower="Violet"){
     cost[i]= 0.50;
   }if (Flower="Carnation"){
     cost[i]= 0.80;
   }else{
      break;
   }

   }
   System.out.print("Enter quantity: ");
   int quantity=input.nextInt();
   
  // for(int i=0; i<Flowers.length;i++){
   // if (Flowers[0]= 
   
}while(true);
  }
}
