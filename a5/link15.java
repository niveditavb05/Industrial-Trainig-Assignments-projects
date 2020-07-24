import java.util.*; 
  
public class link15
{ 
    public static void main(String[] args)  throws Exception 
    { 
  
        try 
{  
            LinkedList<String> arrlist = new LinkedList<String>(); 
            arrlist.add("A"); 
            arrlist.add("B"); 
            arrlist.add("C"); 
            arrlist.add("D"); 
            arrlist.add("E"); 
            System.out.println("Original linkedlist: " + arrlist); 
 
            List<String> arrlist2 = arrlist.subList(2, 4); 
  
            System.out.println("Sublist of linkedlist: "+ arrlist2); 
arrlist2.add("n");
System.out.println("Original linkedlist: " + arrlist); 
System.out.println("Sublist of linkedlist: "+ arrlist2); 
 

        } 
  
        catch (IndexOutOfBoundsException e) 
{ 
            System.out.println("Exception thrown : " + e); 
        } 
  
        catch (IllegalArgumentException e) 
{ 
            System.out.println("Exception thrown : " + e); 
        } 
    } 
} 