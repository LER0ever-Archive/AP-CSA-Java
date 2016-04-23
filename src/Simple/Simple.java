package Simple;

public class Simple {
	private int a = 10;
	private double e = 1.7;
	private String s = "asdf";
	private int grade = 80;
	public void testPrimitiveTypes()
	{
		System.out.println("\ntestPrimitiveType::");
		System.out.printf("Integer %d vs\nDouble %f vs\nString %s\n", a, e, s);
	}
	public void testExpressions()
	{
		System.out.println("\ntestExpressions::");
		boolean t = true, f = false;
		System.out.println("t&&f: " + (t && f));
		System.out.println("t || f" + (t || f));
		System.out.println("!t and !f : " + !t + " and " + !f);
		System.out.println("f||t&&f : " + (f||t&&f));
		System.out.println("f&&t||f : " + (f&&t||f));
		System.out.println("(f||t)&&f : " + ((f||t)&&f));
	}
	public void testConditions()
	{
		System.out.println("\ntestConditions::");
		if (a>10) {
			System.out.println("a > 10");
		}
		else
		{
			System.out.println("Jumped to else, a<=10");
		}
		
		System.out.println("Else if test, grade now is " + grade);
		if (grade >=90)
			System.out.println(">=90 A");
		else if (grade >= 80)
			System.out.println("80~90 B");
		else if (grade>=60)
			System.out.println("60~80 C");
		else
			System.out.println("<=60 D");
	}
	
	public void testLoop()
	{
		System.out.println("\ntestLoop::");
		for (int i=0; i<100; i++){
			if (i%13 == 7) System.out.println("%13==7 : "+ i);
		}
	
	}
	
}
