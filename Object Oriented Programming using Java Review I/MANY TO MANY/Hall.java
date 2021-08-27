import java.util.ArrayList;
import java.util.List;

public class Hall{
    private String name;
    private Integer costPerDay;
    private List<EventType> eventTypeList;
    
    public Hall(){}
    
    public Hall(String name,Integer costPerDay,List<EventType> eventTypeList){
        super();
        this.name=name;
        this.costPerDay=costPerDay;
        this.eventTypeList=eventTypeList;
    }
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    
    public Integer getCostPerDay(){
        return costPerDay;
    }
    public void setCostPerDay(Integer costPerDay){
        this.costPerDay=costPerDay;
    }
    
    public List<EventType> getEventTypeList(){
        return eventTypeList;
    }
    public void setEventTypeList(List<EventType> eventTypeList){
        this.eventTypeList=eventTypeList;
    }
    
    public void addToEventTypeList(EventType eventType){
        
        List<EventType> eventObj=new ArrayList<EventType>();
        if(this.getEventTypeList()!=null){
            eventObj=this.getEventTypeList();
        }
        
        eventObj.add(eventType);
        this.setEventTypeList(eventObj);
        
        
        
    }
    
    
    
    
    
}
