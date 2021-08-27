import java.util.*;

public class EventTypeBO {
    //Your code here
    public void display(ArrayList<EventType> type){
         for(int i=0;i<type.size();i++){
            System.out.println("Event Type:"+type.get(i).name);
            System.out.printf("%-20s%-20s%-20s","Name","Detail","Organiser Name").println();
            type.get(i).dissplay();
        }
    }
}
