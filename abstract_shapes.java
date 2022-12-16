import java.util.*;
abstract class Shape
{
int x,y;
abstract void printArea();
}
class Rectangle extends Shape{
void printArea(){
float area;
area=x*y;
System.out.println("Area of Rectangle is: "+area);
}
}
class Triangle extends Shape{
void printArea(){
float area;
area=(x*y)/2.0f;
System.out.println("Area of Triangle is: "+area);
}
}
class Circle extends Shape{
void printArea(){
float area;
area=3.14f*x*x;
System.out.println("Area of Circle is: "+area);
}
}
class abs{
public static void main(String args[])
{
int choice;
Scanner sc=new Scanner(System.in);
System.out.println("Select\n1.Area of Rectangle\n2.Area of Triangle\n3.Area of Circle");
System.out.println("enter your choice: ");
choice=sc.nextInt();
switch(choice){
case 1:
System.out.println("enter the values for length and breadth :");
Rectangle r=new Rectangle();
r.x=sc.nextInt();
r.y=sc.nextInt();
r.printArea();
break;
case 2:
System.out.println("enter the values for base and height: ");
Triangle t=new Triangle();
t.x=sc.nextInt();
t.y=sc.nextInt();
t.printArea();
break;
case 3:
System.out.println("enter the radius value: ");
Circle c=new Circle();
c.x=sc.nextInt();
c.printArea();
break;
default:
System.out.println("Invalid choice!");
}
}
}
