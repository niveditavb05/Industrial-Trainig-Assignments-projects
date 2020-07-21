import java.util.ArrayList;
public class addall
{
    public static void main(String [] args)
    {
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
        ArrayList<String> al= new ArrayList<String>();
        al.addAll(arraylist1);
        al.addAll(arraylist2);
        System.out.println("final arraylist = " +al);
    }
}