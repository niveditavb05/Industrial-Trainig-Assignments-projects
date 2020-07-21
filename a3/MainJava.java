package testCases;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
public class MainJava {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String s1 = sc.nextLine();
getvalues(s1);
}
public static void getvalues(String s1) {
char a[] = s1.toCharArray();
StringBuffer sb = new StringBuffer();
LinkedHashSet<Character> hs = new LinkedHashSet<Character>();
for (int i = 0; i < a.length; i++) {
hs.add(a[i]);
}
Iterator<Character> itr = hs.iterator();
while (itr.hasNext()) {
char o = itr.next();
if (o != ' ')
;
{
sb.append(o);
}
}
System.out.println(sb);
}
}
 