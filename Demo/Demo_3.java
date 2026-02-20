class Point{
    int x,y;
    void setpoint(int x,int y){
        this.x = x; this.y = y;
    }
}
public class Demo_3 {
    public static void main(String[] args) {
        Point p = new Point();
        p.setpoint(5,5);
        System.err.println("x :"+p.x);
        System.err.print("y :"+p.y);
    }
}
