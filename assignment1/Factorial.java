import java.util.*;
public class Factorial
{
public static void main(String args[])
{
int n,c,f=1;
System.out.println("enter number");
Scanner in=new Scanner(System.in);
n=in.nextInt();
if(n<0)
System.out.println("number should be non negative");
else
for(c=1;c<=n;c++)
f=f*c;
System.out.println("factorial="+f);
}
}
