import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class set15_allmethods
 {

	public static void main(String[] args)
{

		Set<String> fruits = new HashSet<>();
		fruits.add("Apple");
		fruits.add("Banana");
		System.out.println("fruits set is empty = "+fruits.isEmpty());
		System.out.println("fruits contains Apple = "+fruits.contains("Apple"));
		System.out.println("fruits contains Mango = "+fruits.contains("Mango"));
		System.out.println("Apple removed from fruits set = "+fruits.remove("Apple"));
		System.out.println("Mango removed from fruits set = "+fruits.remove("Mango"));
		System.out.println("fruits set size = "+fruits.size());
		List<String> list = new ArrayList<>(); 
		list.add("Apple"); list.add("Apple"); 
		list.add("Banana"); list.add("Mango");
		System.out.println("fruits set before addAll = "+fruits);
		System.out.println("list = "+list);
		fruits.addAll(list);
		System.out.println("fruits set after addAll = "+fruits);
		Iterator<String> iterator = fruits.iterator();
		while(iterator.hasNext()){
			System.out.println("Consuming fruit "+iterator.next());
		}
		fruits.add("Orange");
		System.out.println("fruits set before removeAll = "+fruits);
		System.out.println("list = "+list);
		fruits.removeAll(list);
		System.out.println("fruits set after removeAll = "+fruits);
		fruits.clear();
		System.out.println("fruits set is empty = "+fruits.isEmpty());

	}

}