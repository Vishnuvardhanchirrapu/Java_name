 // INSTANCE CLASS VARIABLES  AND METHODS
 // CLASS VARIABLES AND METHODS (GLOBAL VARIABLES AND METHODS)
 class Circle {
    public double x,y,r;  // instance variable
    static int count = 0; // class variables 
   
    // instance methods (Constructor Overloading )
    public Circle(double x,double y, double r){
        this.x = x; this.y = y; this.r = r; count++;
    }
    public Circle(double r){
        this(0.0, 0.0, r);  count++;
    }
    public Circle(Circle c){
        this(c.x,c.y,c.r);  count++;
    }
    public Circle(){
        this(0.0,0.0,0.5);  count++;
    }

    // instance method
    public Circle bigger(Circle c){
        if(c.r>r) return c;
        else return this; // here this the present circle 
    }

    // class method
    public static Circle bigger(Circle a,Circle b){
        if(a.r>b.r) return a;
        else return b;
    }

    
}
public class Demo_12{
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println( "the count value is :"+c.count);

        Circle a = new Circle(0.5);
        Circle b = a.bigger(c);    // method call using the object 
        
        System.out.println( "the count value is :"+c.count);
        Circle d = Circle.bigger(c,a); // class method call 
        System.out.print( "the count value is :"+c.count);
    }
}
