public class MathsDemo {
    double pii = 3.1415926535897;
    int area = 500;

    public MathsDemo(){
        System.out.println("MathDemo : ");
    }

    public void testMaths(){
        System.out.println("R = sqrt(500/pi) = "+ Math.sqrt(area/pii));
        System.out.println("ABS pii = "+Math.abs(pii));
        System.out.println("Pow pii 4 = " + Math.pow(pii, 4));
        System.out.println("sqrt vs pow0.5 " + Math.sqrt(area/pii) + " "+Math.pow(area/pii, 0.5) + ":" + (Math.sqrt(area/pii) == Math.pow(area/pii, 0.5)));
        System.out.println("Random : "+Math.random());
        System.out.println("Random 0-100 : " + (int)(Math.random()*101));
    }
}
