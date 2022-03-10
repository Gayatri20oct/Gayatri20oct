import java.util.*;
interface Shape
{
   void input();
   void area();
 }
class Circle implements Shape
{
double ar=0;
   double r;
   
   double pi=3.14;
    public void input()
       {
            Scanner sc=new Scanner(System.in);
             System.out.println("Enter the Radius of the circle:");
             int x=sc.nextInt();
              r=x;
      
          }
public void area()
{
     ar=pi*r*r;
     System.out.println("Area of Circle="+ar);
 }
}
class Rectangle extends Circle
{
      int l=0,b=0;
       double ar;
        public void input()
         {
        super.input();
        Scanner s=new Scanner(System.in);
         System.out.println("Enter length of the rectangle:");
         int p=s.nextInt();
         System.out.println("Enter width of the rectangle:");
         int q=s.nextInt();
          l=p;
           b=q;
     }
public void area()
{
super.area();
ar=l*b;
   System.out.println("Area of rectangle=" +ar);
     
 }
}
public class Interface
{
    public static void main(String [] args)
   {
        Rectangle obj=new Rectangle();
         obj.input();
         obj.area();
      }
   }

E:\>cd achal1

E:\achal1>javac Interface.java

E:\achal1>java Interface
Enter the Radius of the circle:
5
Enter length of the rectangle:
6
Enter width of the rectangle:
7
Area of Circle=78.5
Area of rectangle=42.0

E:\achal1>










