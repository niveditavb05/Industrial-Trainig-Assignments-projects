import java.util.*;
public class set2
{
    public static void main(String [] args)
    {
        HashSet<String> al=new HashSet<String> ();
        al.add("E1");
        al.add("E2");
        al.add("E3");
        System.out.println("first HashSet =" +al);
        HashSet<String> al2=new HashSet<String> ();
        al2.add("f1");
        al2.add("f2");
        al2.add("f3");
 System.out.println("second hashset =" +al2);
        HashSet<String> all= new HashSet<String> ();
        all.addAll(al);
        all.addAll(al2);
        System.out.println("final hashset = " +all);
    }
}