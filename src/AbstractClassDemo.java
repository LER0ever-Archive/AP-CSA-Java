/**
 * Created by everette on 5/1/16.
 */
public abstract class AbstractClassDemo {
    private String whateverconstant = "asdf";
    public AbstractClassDemo(){
        System.out.println("\nAbstract Class Init::\n");
    }

    public abstract int abAdd(int a, int b);
    public int abMinus(int a, int b){
        System.out.println(a+ ", "+ b+ ", "+ (a-b));
        return a - b;
    }
}
