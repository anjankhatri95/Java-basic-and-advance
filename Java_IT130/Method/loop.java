import java.util.Scanner;
public class loop{
  public static void main(String [] args){
    Scanner input= new Scanner(System.in);
    
    System.out.println("Enter the height: ");
    int height= input.nextInt();
    
    for (int i=1; i<height; i++){
    for(int j=1;j<=i;j++){
      System.out.println("- ");
    }
  
  }
}
}