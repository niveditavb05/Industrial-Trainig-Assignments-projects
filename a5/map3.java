import java.util.HashMap;
public class map3
{
public static void main(String[] args) 
{
HashMap<String, Integer> ms = new HashMap<String, Integer>();
ms.put("S", 35);
ms.put("M", 38);
ms.put("L", 40);
ms.put("XL", 42);
for (String key : ms.keySet()) {
System.out.println("measurement of " + key + " in inch is: " + ms.get(key));
}
}
}