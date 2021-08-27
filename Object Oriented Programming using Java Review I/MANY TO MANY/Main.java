import java.util.ArrayList;
import java.util.List;

import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        Hall hall=null;
        EventType eventtype=null;
        
        List<Hall> hallList=new ArrayList<Hall>();
        
        System.out.println("Enter the number of halls:");
        
        int n=Integer.parseInt(br.readLine());
        System.out.println("Enter the hall details in comma separated(Name,Cost per day,Event Type-1,Event Type-2,.....,Event Type-n)");
        
        for(int i=0;i<n;i++){
            
            hall=new Hall();
            String[] halldetails=br.readLine().split(",");
            
            hall.setName(halldetails[0]);
            hall.setCostPerDay(Integer.parseInt(halldetails[1]));
            
            int eventlength=halldetails.length;
            
            for(int j=2;j<eventlength;j++){
                
                eventtype=new EventType();
                
                eventtype.setName(halldetails[j]);
                
                hall.addToEventTypeList(eventtype);
                
                eventtype.addToHallList(hall);
                
                
            }
            
            hallList.add(hall);
            
        }
        int f=0;
        System.out.println("Enter the event name to get the halls:");
        String eventName=br.readLine();
        
        System.out.println("Event Name:"+eventName);
        System.out.println("Halls:");
        
        for(Hall h:hallList){
            List<EventType> eventz=new ArrayList<EventType>();
            
            eventz=h.getEventTypeList();
            
            for(EventType e:eventz){
                
                if(e.getName().equals(eventName)){
                    System.out.println(h.getName());
                    f=1;
                    break;
                }
            }
        }
            
        if(f==0){
        System.out.println("No halls are available for the event type");
        }    
  



        
        
        
        
    }
}
