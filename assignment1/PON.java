import java.util.*;
public class PON
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the base number ");
int base=sc.nextInt();
int temp=base;
System.out.println("enter the exponent number");
int exp=sc.nextInt();
for(int i=1;i<exp;i++)
{
temp=temp*temp;
}
System.out.println("result="+temp);
}
}