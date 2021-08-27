import java.util.ArrayList;
import java.util.List;

public class EventType{
    
    private String name;
    private List<Hall> hallList;
    
    public EventType(){}
    
    public EventType(String name,List<Hall> hallList){
        this.name=name;
        this.hallList=hallList;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public List<Hall> getHallList(){
        return hallList;
    }
    public void setHallList(List<Hall> hallList){
        this.hallList=hallList;
    }
    
    
    public void addToHallList(Hall hall){
        
        List<Hall> hallObj=new ArrayList<Hall>();
        
        if(this.getHallList()!=null){
            hallObj=this.getHallList();
        }
        hallObj.add(hall);
        this.setHallList(hallObj);
        
        
    }
    
}

