package Main;
import Simple.Simple;
import StringDemo.StringDemo;
import StandardClassDemo.StandardClassDemo;
import MathsDemo.MathsDemo;
import ArrayDemo.ArrayDemo;
import SortDemo.SortDemo;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		Simple tstSimple = new Simple();
		StringDemo tstString = new StringDemo();
		StandardClassDemo tstSCD = new StandardClassDemo();
		MathsDemo tstMath = new MathsDemo();
		ArrayDemo tstArray = new ArrayDemo();
		SortDemo tstSort = new SortDemo();
		
		tstSimple.testPrimitiveTypes();
		tstSimple.testExpressions();
		tstSimple.testConditions();
		tstSimple.testLoop();
		
		tstString.testStringEqual();
		tstString.testStringCompare();
		tstString.testSubString();
		tstString.testFind();
		
		tstSCD.testInteger();
		tstSCD.testDouble();
		
		tstMath.testMaths();
		
		tstArray.testInitialization();
		
		tstSort.InsertionSort();
		
	}

}
