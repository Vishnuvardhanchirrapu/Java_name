class Point{
    int x,y;
    void set(){
        x = 10; y = 10;
    }
}
public class Demo_2 {
    public static void main(String[] args) {
        
    
    Point p = new Point();
    p.set();
    System.out.printf("x :%d\ny :%d",p.x,p.y);}
}
