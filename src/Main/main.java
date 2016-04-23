package Main;
import Simple.Simple;
import StringDemo.StringDemo;
import StandardClassDemo.StandardClassDemo;
import MathsDemo.MathsDemo;
import ArrayDemo.ArrayDemo;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		Simple tstSimple = new Simple();
		tstSimple.testPrimitiveTypes();
		tstSimple.testExpressions();
		tstSimple.testConditions();
		tstSimple.testLoop();
		StringDemo tstString = new StringDemo();
		tstString.testStringEqual();
		tstString.testStringCompare();
		tstString.testSubString();
		tstString.testFind();
		StandardClassDemo tstSCD = new StandardClassDemo();
		tstSCD.testInteger();
		tstSCD.testDouble();
		MathsDemo tstMath = new MathsDemo();
		tstMath.testMaths();
		ArrayDemo tstArray = new ArrayDemo();
		tstArray.testInitialization();
	}

}
