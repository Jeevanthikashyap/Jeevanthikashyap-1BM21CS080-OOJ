import java.util.Scanner;
class Father extends Exception{
int f_age;
Father(int x)
{
f_age=x;
}
public String toString(){
return "Father's age is wrong";
}
}
class Son extends Father{
int s_age;
Son(int x,int y)
{
super(x);
s_age=y;
}
public String toString(){
return "Son's age cannot be greater than or equal to father";
}
}
class Wrongage{
static int x,y;
static void Father_age(int x) throws Father
{
System.out.println("Called Father age("+x+")");
if(x<0)
throw new Father(x);
System.out.println("Normal exit father's age is"+x);
}
static void Son_age(int x,int y) throws Son
{
System.out.println("Called Son age("+y+")");
if(y>=x)
throw new Son(x,y);
System.out.println("Normal exit son's age is"+y);
}
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
System.out.println("Enter father age");
x=input.nextInt();
System.out.println("Enter Son age");
y=input.nextInt();
try{
Father_age(x);
}
catch(Father e)
{
System.out.println(e);
}
try{
Son_age(x,y);
}
catch(Son e)
{
System.out.println(e);
}
}
}
