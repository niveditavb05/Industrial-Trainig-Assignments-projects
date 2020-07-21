import java.util.*;
public class Sumdemo
{
public static void main(String args[])
{
int n1,n2;
char choice;
Scanner sc=new Scanner(System.in);
do
{
System.out.println("enter the first number=");
n1=sc.nextInt();
System.out.println("enter the second number=");
n2=sc.nextInt();
System.out.println("sum of two numbers is ="+(n1+n2));
System.out.println("do you want to perform this action again...?press Y/y:");
choice=sc.next().charAt(0);
}
while(choice=='y'|| choice=='Y');
}
}