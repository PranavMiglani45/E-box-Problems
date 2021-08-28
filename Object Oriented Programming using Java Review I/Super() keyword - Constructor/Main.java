import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

    public static void main(String[] args) throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Choose Event type");
        System.out.println("1.Exhibition");
        System.out.println("2.StageEvent");
		
        int ch=Integer.parseInt(br.readLine());
        //sc.nextLine();
        if(ch==1){
            System.out.println("Enter the details in CSV format");
            
            String s=br.readLine();
            String[] ar=s.split(",");
            
            Exhibition ex=new Exhibition(ar[0],ar[1],ar[2],ar[3],Integer.parseInt(ar[4]));
            ex.display();
          
        }
        else if(ch==2){
            System.out.println("Enter the details in CSV format");
            
            String s=br.readLine();
            String[] ar=s.split(",");
            
            StageEvent st=new StageEvent(ar[0],ar[1],ar[2],ar[3],Integer.parseInt(ar[4]));
            st.display();
        }
        else if(ch==3){
            System.out.println("Invalid choice");
            
        }
		
	}
}
