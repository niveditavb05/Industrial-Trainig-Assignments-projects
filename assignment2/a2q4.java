class Triangle{
int a,b,c;
Triangle(int p,int q,int r)
{
a=p;
b=q;
c=r;
}
public double getArea(){
double s = (a+b+c)/2.0;
return Math.pow((s*(s-a)*(s-b)*(s-c)),.5);
}
public double getPerimeter(){
return (a+b+c)/2.0;
}
}
class a2q4{
public static void main(String[] args){
Triangle t = new Triangle(2,5,6);
System.out.println("Area=" +t.getArea());
System.out.println("perimeter=" +t.getPerimeter());
}
}		
