
import java.util.*;

class book{
Scanner sc=new Scanner(System.in);
String title, author;
int price, num_pages;
book()
{
System.out.println("enter book title :");
title=sc.nextLine();
System.out.println("enter author name :");
author=sc.nextLine();
System.out.println("enter number of pages :");
num_pages=sc.nextInt();
System.out.println("enter the price :");
price=sc.nextInt();
}
void set()
{
System.out.println("all inputs are set");
}
void get()
{
System.out.println("the details of the book are :");
System.out.println("Book Title : " + title+"\n");
System.out.println("Book Author : " + author+"\n");
System.out.println("Book Price : " + price+"\n");
System.out.println("Book Pages: " + num_pages+"\n");
}
public String toString()
{
return title+" "+author+" "+num_pages+" "+price;
}
}
class bookdetails
{
public static void main(String args[])
{
int n,i;
System.out.println("enter number of books");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
book b[]=new book[n];
for(i=0;i<n;i++)
{
    b[i]=new book();
    
}   
for(i=0;i<n;i++)
{
b[i].set();
b[i].get();    
System.out.println(b[i]);
}
}
}