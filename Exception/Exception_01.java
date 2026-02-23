// Jadhu of just "Exception e"
import java.lang.*;
import java.util.Scanner;
public class W05_P5{
      public static void main (String   args[ ] ) {
		Scanner scan = new Scanner(System.in);
          int i=scan.nextInt();
          int j;
1
import java.util.Scanner;
2
public class Main{
3
      public static void main (String   args[ ] ) {
4
        Scanner scan = new Scanner(System.in);
5
          int i=scan.nextInt();
6
          int j;
7
// Put the following code under try-catch block to handle exceptions
8
try{
9
        switch (i) {
10
        case 0 : 
11
            int zero = 0; 
12
            j = 92/ zero;       
13
            break;
14
        case 1: 
15
            int b[ ] = null; 
16
            j = b[0] ;  
17
            break;
18
        default:
19
            System.out.print("No exception");
20
        }}
21
catch(Exception e){
22
  System.out.print(e);}
23
//catch(NullPointerException e){
24
//  System.out.print("java.lang.NullPointerException");}
25
//catch(ArithmeticException e){
26
//  System.out.print("java.lang.ArithmeticException: "+e.getMessage());
27
//}
0
}
1
}
