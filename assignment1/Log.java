import java.util.*;
public class Log
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i,n,sign=-1;
 double sum=0;
System.out.println("enter the value of n");
n=sc.nextInt();
for(i=1;i<=n;i++)
{
sign*=-1;
sum+=sign*1.0/i;
}
System.out.println("log 2 :"+sum);
}
}