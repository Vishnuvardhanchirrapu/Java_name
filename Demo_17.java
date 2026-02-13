 // class inside the class (Nested class)
 class K{
    class T{

    static int x = 10;
    static  void Display(){
        System.err.println("Hey bro iam good and iam inside!!!");
    }         
}             
}             
public class Demo_17 {
    public static void main(String[] args) {
        
        K.T.Display();
    }
}
