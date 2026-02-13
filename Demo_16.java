class Stela{
    static int x = 50;

    static void display(){
        System.out.println("Iam static method !!!");
    }

}
class Demo_16{
    public static void main(String[] args) {
        Stela.display();
    }
}
