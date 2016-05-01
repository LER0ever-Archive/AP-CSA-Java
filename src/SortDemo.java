public class SortDemo {
    private double[] dl = new double[20];

    public SortDemo() {
        System.out.println("\nTest Sort Demo");
    }
    public void Init(){
        for (int i=0; i< dl.length; i++)
            dl[i] = (int)(Math.random()*1001);
        System.out.println("\nInit Complete: ");
        for (double num : dl)
            System.out.print(num + " ");
        System.out.println();
    }
    public void Swap(int i, int j){
        double temp = dl[i];
        dl[i] = dl[j];
        dl[j] = temp;
    }

    public void SelectionSort(){
        Init();
        int maxPos;
        double max;
        for (int i=0; i< dl.length; i++)
        {
            max = dl[i];
            maxPos = i;
            for (int j=i+1; j< dl.length; j++)
            {
                if (max < dl[j])
                {
                    max = dl[j];
                    maxPos = j;
                }
            }
            Swap(i, maxPos);
        }
        System.out.println("After Selection Sort:");
        for (double num : dl)
            System.out.print(num + " ");
    }


    public void QuickSort(){

    }

    public void InsertionSort(){

    }

}
