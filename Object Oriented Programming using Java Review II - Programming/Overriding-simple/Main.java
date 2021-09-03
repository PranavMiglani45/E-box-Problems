import java.util.*;
import java.io.*;

public class Main 
{
    public static void main(String[] args)throws Exception
    {
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         
         System.out.println("Enter the name of the event:");
         String name=br.readLine();
         
         System.out.println("Enter the detail of the event:");
         String detail=br.readLine();
         
         System.out.println("Enter the owner name of the event:");
         String ownerName=br.readLine();
         
         System.out.println("Enter the type of the event:");
         System.out.println("1.Exhibition");
         System.out.println("2.StageEvent");
         
         int n=Integer.parseInt(br.readLine());
         
         if(n==1){
             System.out.println("Enter the number of stalls:");
             int nstall=Integer.parseInt(br.readLine());
             
             Exhibition ex=new Exhibition(nstall);
             System.out.printf(" The projected revenue of the event is %.2f",ex.projectedRevenue());
             
             
         }
         
         
         else if(n==2){
             System.out.println("Enter the number of shows:");
             int nshow=Integer.parseInt(br.readLine());
             
             System.out.println("Enter the number of seats per show:");
             int nseat=Integer.parseInt(br.readLine());
             
             StageEvent ex=new StageEvent(nshow,nseat);
             System.out.printf(" The projected revenue of the event is %.2f",ex.projectedRevenue());
             
             
         }
         
    }
}
