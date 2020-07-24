import java.util.*;
public class link17_allmethods
{
  public static void main(String[] args)throws Exception 
 {
try
{
    LinkedList<Integer> al = new LinkedList<Integer> ();
    al.add(13);
    al.add(2);
    al.add(3);
    al.add(4);
    

      System.out.println("addede element in list =" +al);
System.out.println();
System.out.println();
    
     
al.add(40);
al.add(20);
      al.add(25);
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
         System.out.println( "              The element 10 is available in the linkedList");
      else
         System.out.println("                The element 10 is not available in the linkedList");
      if(al.contains(60))
         System.out.println("                The element 60 is available in the linkedList");
      else
         System.out.println("                 The element 60 is not available in the linkedList");
   
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
  
        System.out.println("Modified linkedList : " + al); 
            List<Integer> all2 = al.subList(2, 4); 
System.out.println();
System.out.println();
  
            System.out.println("Sublist of al: "+ all2); 
System.out.println();
System.out.println();
        LinkedList<String> al1=new LinkedList<String> ();
        al1.add("E1");
        al1.add("E2");
        al1.add("E3");
        System.out.println("first linkedlist =" +al1);
        LinkedList<String> al2=new LinkedList<String> ();
        al2.add("f1");
        al2.add("f2");
        al2.add("f3");
 System.out.println("second linkedlist =" +al2);
        LinkedList<String> aall= new LinkedList<String> ();
        aall.addAll(al1);
        aall.addAll(al2);
        System.out.println("final linkedlist = " +aall);
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
