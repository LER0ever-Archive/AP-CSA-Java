public class StringDemo {
    private String str1 = "dog";
    private String str2 = "LER0ever";
    private String str3 = "Void";
    private String str4 = "Void";
    private String str5 = "A Quick Brown Fox Jumps Over the Lazy Dog";
    public StringDemo(){
        System.out.println("testStringDemo :: ");
    }

    public void testStringLength(){
        System.out.println("String Len : "+str5.length());
    }

    public void testStringEqual(){
        System.out.println("is str3 equal to str4 : " + str3.equals(str4));

    }

    public void testStringCompare(){
        System.out.println("str 1 cT 2 : " + str1.compareTo(str2));
        System.out.println("str 2 cT 3 : " + str2.compareTo(str3));
        System.out.println("str 3 cT 4 : " + str3.compareTo(str4));
    }

    public void testSubString(){
        System.out.println("1-6 : "+str5.substring(1,6));
        System.out.println("10 : "+str5.substring(10));
    }

    public void testFind(){
        System.out.println("Index of Jumps in str5 : " + str5.indexOf("Jumps"));
    }
}
