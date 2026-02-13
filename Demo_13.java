// recursion factorial 
public class Demo_13 {
    int fact(int n){
        if(n==0 || n==1)
            return 1;
        else 
            return n*fact(n-1);
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]); // command line string 
        int x = new Demo_13().fact(n);     //  to int converted input
       System.out.printf("the factorial of %d is %d .",n,x);
    }
}
