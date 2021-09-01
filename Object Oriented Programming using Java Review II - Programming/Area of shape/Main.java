import java.util.*;
import java.io.*;

public class Main 
{
    public static void main(String[] args) throws Exception
    {
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the shape\n1.Circle\n2.Rectangle\n3.Triangle");
		
        Integer n=Integer.parseInt(br.readLine());
        if(n==1)
        {
            System.out.println("Enter the radius:");
               Double radius=Double.parseDouble(br.readLine());
                //cir=null;
               Circle cir=new Circle();
               cir.setRadius(radius);
               cir.computeArea();
               
               System.out.printf("Area of circle is %.2f",cir.getArea());
        }
        else if(n==2)
        {
            System.out.println("Enter the length and breadth:");
               Double length=Double.parseDouble(br.readLine());
               Double breadth=Double.parseDouble(br.readLine());
                //rec=null;
               Rectangle rec=new Rectangle();
               rec.setLength(length);
               rec.setBreadth(breadth);
               
               rec.computeArea();
               System.out.printf("Area of rectangle is %.2f",rec.getArea());
               
               
        }
        else if(n==3)
        {
            System.out.println("Enter the base and height:");
               Double base=Double.parseDouble(br.readLine());
               Double height=Double.parseDouble(br.readLine());
               //Triangle tri=null;
               Triangle tri=new Triangle();
               tri.setBase(base);
               tri.setHeight(height);
               
               tri.computeArea();
               
               System.out.printf("Area of triangle is %.2f",tri.getArea());
               
        }
        else
        {
             System.out.format("Invalid choice");
        }
	}
}
