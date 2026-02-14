// assigning the subclass(y is object) reference to 
// the superclass(x is object) is possible (x = y) 
// vice versa not possible .  (y = x is not possible)
class A{
    int i;
    int j;
    A(){
        i = 0; j = 0;
    }
    A(int i,int j){
       this.i = i; 
       this.j = j;
    }
} 
class B extends A{
    int k ;
    B(int x,int y,int z){
        i = x; j = y; k = z;
    }
    void Display(){
        System.out.println(i+j+k);
    }
}

public class Demo_21 {
    public static void main(String[] args) {
        A x = new A();
        B y = new B(5,5,25);
        System.out.println(" i,j values : "+x.i+" ,"+x.j);
        System.out.println(" i,j values : "+y.i+" ,"+y.j);
        x = y;
        System.err.println(" i,j values : "+x.i+" ,"+x.j);
            
    }
}
