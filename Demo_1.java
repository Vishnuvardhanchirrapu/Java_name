// multiple classes 

class Circle{
    double x,y,r;
    double Circumference(){
        return 2*3.1415*r;
    }
    double area(){
        return 3.1415*r*r;
    }
        
   
}
class Box{
    double h,w,d;
    double area(){
        return  2*(h*w+w*d+d*h);
    }
    double volume(){
        return h*w*d;
    }
}
class Demo_1{
    public static void main(String...args){
        Circle c = new Circle(); // obj is created
        c.x = 0.0;c.y = 0.0;c.r = 0.5;
        Circle c1 = new Circle(); // obj is created
        c1.x = 0.0;c1.y = 0.0;c1.r = 0.7;
        System.out.println("Circumference of a circle :"+c.Circumference());
        System.out.println("Area of circle :"+c.area());
        System.out.println("Circumference of a circle :"+c1.Circumference());
        System.out.println("Area of circle :"+c1.area());
        Box b = new Box(); // obj is created for Box class
        b.h = 4; b.w = 3; b.d = 5;
        System.out.println(b.area()+"\n"+b.volume());
    }

}
