class student
{
String name;
int roll_no;
void accept()
{
name="John";
roll_no=2;
}
void display()
{
System.out.println("name of student="+name);
System.out.println("Roll number of student="+roll_no);
}
}
public class Pro1
{
public static void main(String args[])
{
student s=new student();
s.accept();
s.display();
}
}