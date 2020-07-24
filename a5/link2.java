import java.util.*;
public class link2
{
    public static void main(String [] args)
    {
        LinkedList<String> al=new LinkedList<String>();
        al.add("E1");
        al.add("E2");
        al.add("E3");
        System.out.println("first linkedlist =" +al);
        LinkedList<String> al2=new LinkedList<String>();
        al2.add("f1");
        al2.add("f2");
        al2.add("f3");
 System.out.println("second linkedlist =" +al2);
        LinkedList<String> all= new LinkedList<String>();
        all.addAll(al);
        all.addAll(al2);
        System.out.println("final linkedlist = " +all);
    }
}