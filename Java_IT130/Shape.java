
public class Shape{
  public void computeAreaOfCircle(double radius){
       double Area= Math.PI * Math.pow(radius,2);
       System.out.printf("Area of circle with radius %f is %f\n",radius,Area);
  }
 public double computeAreaOfCirclewithReturn(double radius){
       double Area= Math.PI * Math.pow(radius,2);
       return Area;
 }
  public double getArea(double radius){
       double Area= Math.PI * Math.pow(radius,2);
       return Area;
 }
  /*public double getArea(double base, double height){
       double Area= 0.5*height*base;
       return Area; */
       public static double getArea(double base, double height){
       double Area= 0.5*height*base;
       return Area;
 }
 
  
}
  
  