import java.util.*;
public class Cos
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i,j,n,fact,sign=-1;
float x,p,sum=0;
System.out.println("enter the value of x=");
x=sc.nextInt();
System.out.println("enter the value of n=");
n=sc.nextInt();
for(i=1;i<=n;i+=2)
{
p=1;
fact=1;
for(j=1;j<=i;j++)
{
p=p*x;
fact=fact*j;
}
sum+=sign*p/fact;
sign=-1*sign;
}
System.out.println("sin ="+(1+sum));
}
}