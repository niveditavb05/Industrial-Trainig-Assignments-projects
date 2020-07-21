import java.util.*; 
  
public class sublist 
{ 
    public static void main(String[] args)  throws Exception 
    { 
  
        try 
{  
            ArrayList<String> arrlist = new ArrayList<String>(); 
            arrlist.add("A"); 
            arrlist.add("B"); 
            arrlist.add("C"); 
            arrlist.add("D"); 
            arrlist.add("E"); 
            System.out.println("Original arrlist: " + arrlist); 
 
            List<String> arrlist2 = arrlist.subList(2, 4); 
  
            System.out.println("Sublist of arrlist: "+ arrlist2); 
arrlist2.add("n");
System.out.println("Original arrlist: " + arrlist); 
System.out.println("Sublist of arrlist: "+ arrlist2); 
 

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