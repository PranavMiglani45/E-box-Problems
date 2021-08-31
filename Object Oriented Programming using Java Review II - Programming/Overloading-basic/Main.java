import java.io.*;
public class Main {
    public static void main(String args[]) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        Stall obj=null;
        
        System.out.println("Enter the name of the stall:");
        String stallName=br.readLine();
        
         System.out.println("Enter the detail of the stall:");
         String stallDetail=br.readLine();
         
         System.out.println("Enter the owner name of the stall:");
         String ownerName=br.readLine();
         
         obj=new Stall(stallName,stallDetail,ownerName);
         
         System.out.println("Enter the type of the stall:");
         String stallType=br.readLine();
         
        System.out.println("Enter the size of the stall in square feet:");
        Integer size=Integer.parseInt(br.readLine());
        
         System.out.println("Does the stall have TV?(y/n)");
         Character c=br.readLine().charAt(0);
        
        //int b=0;
        if(c=='y'){
            System.out.println("Enter the number of TV:");
            Integer n=Integer.parseInt(br.readLine());
            System.out.println("The cost of the stall is "+obj.computeCost(stallType,size,n));
           
        }
       
        else{
            System.out.println("The cost of the stall is "+obj.computeCost(stallType,size));
         
        }
        
        
        
        
        
        
         
	}
}
