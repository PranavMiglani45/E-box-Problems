import java.util.*;

public class EventType {
    //Your code here
    String name;
    ArrayList<Event> list;
	
	EventType(String name,ArrayList<Event> list){
     this.name=name;
     this.list=list;
	}
    void setList(Event e){
        this.list.add(e);
    }
     ArrayList<Event> getList(){
        return this.list;
    }
    void setName(String name){
        this.name=name;
    }
    String getName(){
        return this.name;
    }
    void dissplay(){
        for(int i=0;i<list.size();i++){
            System.out.printf("%-20s%-20s%-20s",list.get(i).getName(),list.get(i).getDetail(),list.get(i).getOrganiserName()).println();  
        }
    }
}
