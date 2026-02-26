import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnno{
    String str();
    int app();
}

public class Anno_01 {

    @MyAnno(str = "Apple",app = 25)
    public void display(){ 
        System.out.println("bhanu is a good boy!!! ");
    }
    public static void main(String[] args) throws Exception{
    Anno_01 obj = new Anno_01();
    
    Method m =obj.getClass().getMethod("display");

    MyAnno annotation =  m.getAnnotation(MyAnno.class);

    System.err.println(annotation.str());
    System.err.println(annotation.app());
    obj.display();
    }
}
