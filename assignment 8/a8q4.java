import java.util.*;
class a8q4 {
    long power(int n, int p) {
    if (n == 0 && p == 0) {
        throw new IllegalArgumentException("n and p should not be zero.");
    } else if (n < 0 || p < 0) {
        throw new IllegalArgumentException("n or p should not be negative.");
    }
    return (long) Math.pow(n, p);
    }
public static void main(String args[])
{
int a,b;
Scanner s=new Scanner(System.in);
System.out.println("Enter first num");
a=s.nextInt();
System.out.println("Enter second num");
b=s.nextInt();
a8q4 obj=new a8q4();
long c=obj.power(a,b);
}
}