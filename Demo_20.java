// inheritance in java SUPER key word is
// used to call the super class constructor
class Box{
 double h,wi,b;
 Box(){   // default constructor
    h=0;
    wi = 0;
    b = 0;
 }

 Box(double h,double wi, double b){ // 
    this.h = h; this.wi = wi; this.b = b;
 }
   void vol(){
    System.err.println("volume is : "+(h*wi*b));
   }
   void Display(){
    System.err.println("Dimensions :"+h+" ,"+wi+" ,"+b);
   }
}
class Boxwt extends Box{
    double wt;
     Boxwt(double x, double y,double z,double wt){
         super(x,y,z); this.wt = wt;
         super.Display();
        // h = x;  wi = y; b = z; this.wt = wt;
     }
}

public class Demo_20 {
    public static void main(String[] args) {
        Box b1 = new Box();
        b1.vol();
        Box b2 = new Box(5,5,5);
        b2.vol();
        Boxwt b3 = new Boxwt(15,2,3,5);
        b3.vol();
        System.out.println("b3 Box weight : "+b3.wt);
    }
}
