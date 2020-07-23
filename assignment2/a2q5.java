class Rectangle{
int length;
int breadth;
public Rectangle(int l, int b){
length = l;
breadth = b;
}
public int getArea(){
return length*breadth;
}
public int getPerimeter(){
return 2*(length+breadth);
}
}
class a2q5{
public static void main(String[] args){
Rectangle a = new Rectangle(4,5);
Rectangle b = new Rectangle(5,8);
System.out.println("Area : "+a.getArea()+" Perimeter is "+a.getPerimeter());
System.out.println("Area : "+b.getArea()+" Perimeter is "+b.getPerimeter());
}
}		
