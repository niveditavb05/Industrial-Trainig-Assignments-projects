import java.util.*;
public class Fiboo
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=0,b=1,c,i,n;
System.out.println("enter the number=");
n=sc.nextInt();
System.out.println("Fibonacci series.......");
System.out.println(0);
System.out.println(1);
for(i=1;i<=n-2;i++)
{
c=a+b;
System.out.println(+c   );
a=b;
b=c;
}
}
}