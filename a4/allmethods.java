import java.util.*;
public class allmethods
{
  public static void main(String[] args)throws Exception 
 {
try
{
    ArrayList<Integer> al = new ArrayList<Integer>(20);
    al.add(13);
    al.add(2);
    al.add(3);
    al.add(4);
    

      System.out.println("addede element in list =" +al);
System.out.println();
System.out.println();
    
      al.ensureCapacity(15);
al.add(40);
al.add(20);


     
  
         System.out.println(                   " modified arraylist(ensurecapacity) = " +al);
System.out.println();
System.out.println();
      
      al.add(25);
      al.trimToSize();
    
         System.out.println(" modified arraylist(trimtosize) = "  +al);
System.out.println();
System.out.println();
            int size = al.size(); 
            System.out.println("Size of list = "+ size); 
System.out.println();
System.out.println();
  System.out.println("list is empty="+al.isEmpty());     
 
System.out.println();
System.out.println();     

      al.add(10);
      al.add(20);
    
      if(al.contains(10))
         System.out.println( "              The element 10 is available in the ArrayList");
      else
         System.out.println("                The element 10 is not available in the ArrayList");
      if(al.contains(60))
         System.out.println("                The element 60 is available in the ArrayList");
      else
         System.out.println("                 The element 60 is not available in the ArrayList");
   
int i=al.indexOf(10);
if(i != -1)

 System.out.println("the Indexof of" +   " 10 is " + i); 
        else
            System.out.println("10 is not present in" +   " the list"); 
        Object[] objects = al.toArray(); 
        for (Object obj : objects) 

        System.out.print(obj + " "); 
      int retval = al.get(2);
System.out.println();
System.out.println();
      System.out.println("Retrieved element is = " + retval);	
      al.set(2,55);
        
   System.out.println();
System.out.println();
      System.out.println("Printing new list:"+al);
     

al.remove(1); 
        al.remove(1); 
System.out.println();
System.out.println();
  
        System.out.println("Modified ArrayList : " + al); 
            List<Integer> arrlist2 = al.subList(2, 4); 
System.out.println();
System.out.println();
  
            System.out.println("Sublist of al: "+ arrlist2); 
System.out.println();
System.out.println();
        ArrayList<String> arraylist1=new ArrayList<String>();
        arraylist1.add("E1");
        arraylist1.add("E2");
        arraylist1.add("E3");
        System.out.println("first arraylist =" +arraylist1);
        ArrayList<String> arraylist2=new ArrayList<String>();
        arraylist2.add("f1");
        arraylist2.add("f2");
        arraylist2.add("f3");
 System.out.println("second arraylist =" +arraylist2);
        ArrayList<String> aal= new ArrayList<String>();
        aal.addAll(arraylist1);
        aal.addAll(arraylist2);
        System.out.println("final arraylist = " +aal);
al.clear();
 System.out.println("list is empty="+al.isEmpty());
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
