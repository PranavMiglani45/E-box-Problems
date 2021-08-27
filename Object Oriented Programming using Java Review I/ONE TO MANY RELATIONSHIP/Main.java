import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args)throws Exception{
		//your code here
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
		System.out.println("Enter the type of events in CSV format");
        String[] type=br.readLine().split(",");
        
        ArrayList<EventType> ans=new ArrayList<EventType>();
        
        for(int i=0;i<type.length;i++){
            ArrayList<Event> list=new ArrayList<Event>();
            ans.add(new EventType(type[i],list));
        }
        System.out.println("Enter the number of Events");
        int n=Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            System.out.println("Enter the Event "+(i+1)+" Details");
            String[] event=br.readLine().split(",");
            for(int j=0;j<type.length;j++){
                if(type[j].equals(event[2])){
                    ans.get(j).setList(new Event(event[0],event[1],event[2],event[3]));
                }
            }
        }
         EventTypeBO a=new EventTypeBO();
         a.display(ans);
       
		
	}

}
