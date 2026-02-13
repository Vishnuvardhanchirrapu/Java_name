public class Demo_14 {
    int n ;

// recursive code for finding nth fibonacci number 
    int fibo(int n){
        if(n==0)
            return 0;
        else if(n==1)
            return 1;
        else
            return fibo(n-1)+fibo(n-2) ;
    }

    public static void main(String[] args) {
        Demo_14 t = new Demo_14();
        t.n = Integer.parseInt(args[0]);

        for(int i = 0; i< t.n; i++){
            System.out.println(t.fibo(i));
        }
    }
}
