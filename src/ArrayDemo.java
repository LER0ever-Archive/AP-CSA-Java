public class ArrayDemo {
    public ArrayDemo(){
        System.out.println("Test Array Demo");
    }

    public void testInitialization(){
        double[] dblData = new double[10];
        // double dblData[] = ...
        // double[] dblData; dblData = new ....
        for (int i=0; i<10 ;i++)
            dblData[i] = i;
        for (int i=0; i<dblData.length; i++)
            System.out.print(dblData[i] + " ");
        System.out.println("\nAnother Way: ");
        for (double num : dblData)
            System.out.print(num + " ");
    }
}
