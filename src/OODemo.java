/**
 * Created by everette on 5/1/16.
 */

public class OODemo extends AbstractClassDemo{
    public OODemo(){
        super();
        System.out.println("OODemo Init: \n");
    }

    public int abAdd(int a, int b){
        System.out.println(a+ ", "+ b+ ", " +(a+b));
        return a+b;
    }

    public static void callFunc(){
        System.out.println("Calling static function");
    }

}
