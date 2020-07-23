import java.util.*;
class Algorithm 
{
    public static <T extends Object & Comparable<? super T>>
        T max(List<? extends T> list, int begin, int end) 
{

        T maxElem = list.get(begin);

        for (++begin; begin < end; ++begin)
            if (maxElem.compareTo(list.get(begin)) < 0)
                maxElem = list.get(begin);
        return maxElem;
    }
}
public class a7q1{
    public static void main(String[] args) throws Exception {

        List<Integer> li = Arrays.asList(2,62,4,78,6,10,49,20,59,43,29,30,56,89);
        
        int i = Algorithm.max(li, 0, li.size());
System.out.println("out : "+i);
}
}
