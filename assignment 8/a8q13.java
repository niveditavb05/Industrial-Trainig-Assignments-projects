import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class a8q13{
    public static int[] inputArray;
    public static int[] arr1;
    public static int[] arr2;
    public static int[] arr3;
    public static int t1_status=0;
    public static int t2_status=0;

    public static void main(String[] args) throws IOException{

       

        Scanner in =new Scanner(System.in);

        int arraySize=5;

        inputArray = new int[arraySize];

        Random rand=new Random();

        for(int i=0;i<arraySize;i++)
        {
            inputArray[i]=rand.nextInt(100);
        }

        arr1=Arrays.copyOfRange(inputArray, 0, inputArray.length/2);

        arr2=Arrays.copyOfRange(inputArray, (inputArray.length)/2,inputArray.length);
       
        System.out.print("The original array is array is ");

        for(int h:inputArray)
        {
            System.out.println(h);
        }

        Thread t1=new Thread(new Runnable(){
                public void run() 
                {
                    mergeSort(arr1);
                    System.out.println("t1 started");
                }

            });
        Thread t2=new Thread(new Runnable(){
                public void run()
                {
                    mergeSort(arr2);
                    System.out.println("t2 started");
                }

            });
        
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        }
        catch (InterruptedException e) {
           
            e.printStackTrace();
        }
        if(t1.isAlive())
        {
            t1_status=1;
        }
        if(t2.isAlive())
        {
            t2_status=1;
        }
        t1.stop();
        t2.stop();

        arr3=new int[inputArray.length];

        merge(arr3,arr1,arr2);

        System.out.println("The sorted array using divide and conquer algorithm = ");
        for(int m:arr3)
        {
            System.out.print(m);
            System.out.print(" ");
        }
        System.out.println(" ");
    }

    static void mergeSort(int[] A)
    {
        if (A.length > 1) 
        {
            int q = A.length/2;
 // divide the array in half
            int[] leftArray = Arrays.copyOfRange(A, 0, q);
            int[] rightArray = Arrays.copyOfRange(A,q,A.length);
// sort/conquer each half
            mergeSort(leftArray);
            mergeSort(rightArray);
            merge(A,leftArray,rightArray);
        }
    }
   

    static void merge(int[] a, int[] l, int[] r) {
        int totElem = l.length + r.length;

        int i,li,ri;
        i = li = ri = 0;
        while ( i < totElem) {
            if ((li < l.length) && (ri<r.length)) {
                if (l[li] < r[ri]) {
                    a[i] = l[li];
                    i++;
                    li++;
                }
                else {
                    a[i] = r[ri];
                    i++;
                    ri++;
                }
            }
            else {
                if (li >= l.length) {
                    while (ri < r.length) {
                        a[i] = r[ri];
                        i++;
                        ri++;
                    }
                }
                if (ri >= r.length) {
                    while (li < l.length) {
                        a[i] = l[li];
                        li++;
                        i++;
                    }
                }
            }
        }

        if(t1_status==1){arr1=a;}
        else if(t2_status==1){arr2=a;}
        else{arr3=a;}
    }
}