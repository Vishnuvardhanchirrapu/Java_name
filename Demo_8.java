// Command line run time input
class Demo_8{
    public static void main(String[] args) {
        System.out.println("hi  ");
        System.out.println(args[0]+", ");
        System.out.println(" how r u ");
      System.out.println("THE numbers u entered :");
      for(int i = 1; i<args.length; i++){
          System.out.println(args[i]);
      }


        System.exit(0);
    }
}