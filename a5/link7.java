import java.util.*; 
  
public class link7
{ 
    public static void main(String[] args) 
    { 
        LinkedList<Integer> arr = new LinkedList<Integer>(); 
        arr.add(10); 
        arr.add(20); 
        arr.add(30); 
        arr.add(40); 
        arr.add(30); 
        arr.add(30); 
        arr.add(40); 
  
        System.out.println("The list initially " + arr);
int i=arr.indexOf(10);
if(i != -1)
 System.out.println("the Indexof of" +   " 10 is " + i); 
        else
            System.out.println("10 is not present in" +   " the list"); 
   int element = arr.lastIndexOf(30); 
        if (element != -1) 
            System.out.println("the lastIndexof of" +  
                             " 30 is " + element); 
        else
            System.out.println("30 is not present in" +  
                                        " the list"); 
        element = arr.indexOf(100); 
        if (element != -1) 
            System.out.println("the Indexof of 100" +  
                                      " is " + element); 
        else
            System.out.println("100 is not present in" +  
                                           " the list"); 
    } 
} 