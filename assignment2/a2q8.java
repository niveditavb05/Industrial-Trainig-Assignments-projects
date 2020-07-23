import java.util.*;
class average{
int avg;
public void calculate(int l,int m,int n){
avg=(l+m+n)/3;
}
public void print()
{
System.out.println("Average="+avg);
}
}
class a2q8{
public static void main(String[] args){
int a;
int b;
int c;
Scanner s = new Scanner(System.in);
average x=new average();
System.out.println("Enter first number");
a = s.nextInt();
System.out.println("Enter second number");
b = s.nextInt();
System.out.println("Enter third number");
c=s.nextInt();
x.calculate(a,b,c);
x.print();
}
}		
