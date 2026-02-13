import java.util.Scanner;
public class Demo_11 {
    public static void main(String[] args) {

    if(args.length>0){    for(String str:args)
            System.out.println(str);
        }
        else{
    Scanner sc = new Scanner(System.in);
    String[] arr = sc.nextLine().split(" ");
    for(String arg: arr)
        System.out.println(arg);
       }

    }
}
