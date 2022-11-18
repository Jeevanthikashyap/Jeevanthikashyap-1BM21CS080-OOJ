import java.util.*;
import java.lang.*;
class Main{
public static void main(String args[])
{
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the numbers:");
    double a=sc.nextDouble();
    double b=sc.nextDouble();
    double c=sc.nextDouble();
    
double d, root1,root2;
d=(b*b)-(4*a*c);
if(d>0){
    System.out.println("the roots are real and distinct");
    root1=(-b+Math.sqrt(d))/(2*a);
    root2=(-b-Math.sqrt(d))/(2*a);
    System.out.println("the roots are:"+root1+"and "+root2);
    
}
  else  if(d==0)
    {
        root1=root2=-b/(2*a);
        
        System.out.println("roots are complex and disticnt:"+root1 +"and"+root2);
    }
    else{
        System.out.println("the roots are imaginary\n");
double rpart=(-b)/(2*a);
double ipart=(Math.sqrt(-d))/(2*a);
System.out.println("the roots are:"+rpart +"and"+ipart);
}
    }
}

