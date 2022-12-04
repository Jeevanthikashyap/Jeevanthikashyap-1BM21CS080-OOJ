import java.util.*;
class Student
{
    String usn;
    String name;
    int credits[]=new int[20];
    double total,sgpa;
    int count,i;
    int marks[]=new int[20];
    int points[]=new int[20];
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter student USN :");
        usn=sc.next();
        System.out.println("Enter student name :");
        name=sc.next();
        System.out.println("Enter total number of courses :");
        count=sc.nextInt();
        System.out.println("Enter total number of credits :");
        total=sc.nextDouble();
       
        for(i=0;i<count;i++)
        {
            System.out.print("Enter the credits for the course  "+(i+1)+" :");
            credits[i]=sc.nextInt();
            System.out.print("Enter marks for the course "+(i+1)+" :");
            marks[i]=sc.nextInt();
	   }
    }
    double calculate()
    {
        
        for(i=0;i<count;i++)
        {
            if(marks[i]<=100 && marks[i]>=90)
                points[i]=10;
            else if(marks[i]<90 && marks[i]>=80)
                points[i]=9;
            else if(marks[i]<80 && marks[i]>=70)
                points[i]=8;
            else if(marks[i]<70 && marks[i]>=60)
                points[i]=7;
            else if(marks[i]<60 && marks[i]>=55)
                points[i]=6;
            else if(marks[i]<55 && marks[i]>=50)
                points[i]=5;
		else if(marks[i]<50 && marks[i]>=40)
			points[i]=4;
            else
                points[i]=0;
            
        }
        double sum=0.0;
    
        
        for(i=0;i<count;i++)
        {
            sum+=credits[i]*points[i];
        }
	sgpa=sum/total;
        return (sgpa);
    }   
    void display()
    {
        System.out.println("USN :"+usn);
        System.out.println("Name :"+name);
        System.out.println("SGPA :"+calculate());
    }

}
class sgpa
{
    public static void main(String args[])
    {
        Student s1=new Student();
        s1.input();   
        s1.display();
        Student s2=new Student();
        s2.input();
        s2.display();

    
    }
}