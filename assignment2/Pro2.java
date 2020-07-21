 class Stu
{
int rn;
String add,name,pn;
void accept()
{
rn=2;
pn="9133214109";
add="at latur";
name="John";
}
void accept1()
{
rn=3;
pn="9133685609";
add="at pune";
name="Sam";
}
void display()
{
System.out.println("Roll number of student="+this.rn);
System.out.println("phone number of student="+this.pn);
System.out.println("address of student="+this.add);
System.out.println("name of student="+this.name);
}
}
public class Pro2
{
public static void main(String args[])
{
Stu s=new Stu();
Stu s1=new Stu();
s.accept();
s1.accept1();
s.display();
s1.display();
}
}


