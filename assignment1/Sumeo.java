import java.util.*;
public class Sumeo
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i=0,n,sumo=0,sume=0;
System.out.println("enter number of elements in array");
n=sc.nextInt();
int[]a=new int[n];
System.out.println("enter the numbers that you want to enter=");
for( i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for( i=0;i<n;i++)
{
if(a[i]%2==0)
{
sume=sume+a[i];
}
else
{
sumo=sumo+a[i];
}
}
System.out.println("even sum="+sume);
System.out.println("odd sum="+sumo);
}
}
