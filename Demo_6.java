//constructor  overloading  and two uses of this keyword
class Circle{
    double x,y,r;
    Circle(double x,double y,double r){ // constructor
        this.x = x; this.y = y; this.r = r;
    }

    Circle(double r){
        // x = 0; y = 0; this.r = r;
        this(0.0,0.0,r); // this invoke the another constructor

    }

    Circle(Circle c1) {
        // x = c1.x; y = c1.y ; r = c1.r;
        this(c1.x,c1.y,c1.r);// this invoke the another constructor
    }
    double area(){
        return 2*3.1415*r;
    }
    
    
}
public class Demo_6 {
    public static void main(String[] args) {
        Circle c1 = new Circle(0,0,0.5);
        Circle c2 = new Circle(0.3);
        Circle c3 = new Circle(c1);
        System.out.println("area of circle c1 :"+c1.area());
        System.out.println("area of circle c2 :"+c2.area());
        System.out.println("area of circle c3 :"+c3.area());
    }
}
