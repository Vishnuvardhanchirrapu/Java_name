//inheritance in java USE OF SUPPERCLASS
class A{
    int i,j;
    A(int i ,int j){
        this.i = i; this.j = j;
System.out.println("The value of the i is : "+i+" and j is : "+j);
    }
}
class B extends A{
    int k ;
     B(int i , int j ,int k){
        super(i,j);
        this.k = k;
        System.out.println(i+j+k);
    }
}

public class Demo_19 {
    public static void main(String[] args) {
        B t = new B(10,10,10);
    }
}
