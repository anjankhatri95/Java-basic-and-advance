
public class testapplication{
  public static void main(String [] args){
     Shape circle = new Shape(); 
     circle.computeAreaOfCircle(5.5);
     
   //  circle.computeAreaOfCirclewithReturn(6.5);
     
      System.out.printf("Area of circle 6.5: %f",circle.computeAreaOfCirclewithReturn(6.5));
      System.out.printf("Area of circle 6.5: %f",circle.getArea(5.5));
      

       /* Shape triangle= new Shape();
        System.out.printf("\nArea of triangle: %f",triangle.getArea(6.5,7.5));
        */
      System.out.printf("\nArea of triangle: %f",Shape.getArea(6.5,7.5));
      Shape triangle= new Shape();
      double t= triangle.getArea(7,2);
      System.out.printf("\ntriangle: %f",t);
      System.out.printf("\nArea of triangle: %f",triangle.getArea(4,6));
  }
  
}