// constructor overloading
class Circle{
    double r,x,y ;
   Circle(double x,double y,double r){
  this.x = x; this.y = y; this.r = r;
   }
   double area(){
    return 2*3.1415*r;
   }
}

public class Demo_5 {
    public static void main(String[] args) {
         
        System.err.println("area of circle c :"+new Circle(0.0,0.0,0.5).area());
    }
}
