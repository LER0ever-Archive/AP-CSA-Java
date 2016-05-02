public class StandardClassDemo {
    public StandardClassDemo(){
        System.out.println("test Standard Class :");
    }

    public void testInteger(){
        Integer intobj = new Integer(16);
        int j = intobj.intValue();
        System.out.println("Integer OBJ: "+intobj + " int value : "+j);
    }

    public void testDouble(){
        Double dbobj = new Double(3.1415);
        double db = dbobj.doubleValue();
        int dbint = dbobj.intValue();
        System.out.println("Double:: "+ dbobj + " : "+ db + " : "+dbint);
    }
}
