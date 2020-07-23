import java.util.*;
 interface UnaryPredicate<T> 
{
    public boolean test(T obj);
}

class OddPredicate implements UnaryPredicate<Integer> {
    public boolean test(Integer i) { 
return i%2!=0;

 }
}
class evenPredicate implements UnaryPredicate<Integer> {
    public boolean test(Integer i) { 
return i%2==0;

 }
}


class Algorithm {
    public static <T> int countIf(Collection<T> c, UnaryPredicate<T> p) {

        int count = 0;
        for (T elem : c)
            if (p.test(elem))
                ++count;
        return count;
    }
}

public class a7q2 {
    public static void main(String[] args) {
        Collection<Integer> ci = Arrays.asList(2,4,6,7,8,9,90,78,41,56,79,45,65,85);
        int countodd = Algorithm.countIf(ci, new OddPredicate());
        System.out.println(" odd : " + countodd);
int counteven = Algorithm.countIf(ci, new evenPredicate());
        System.out.println(" even : " + counteven);

    }
}