public class Demo_9 {
    public static void main(String[] args) {
        if(args.length>0){
            System.out.println("The command line arguments are :");
            for(String str : args){
                System.out.println(str);
            }
        }
        else {
            System.out.println("No command line arguments are passed !");
        }
    }
}
