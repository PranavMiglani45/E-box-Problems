import java.util.*;

public class Stall {
    protected String name;
    protected String detail;
    protected String ownerName;
    
    public Stall(){}
    public Stall(String name,String detail,String ownerName){
        this.name=name;
        this.detail=detail;
        this.ownerName=ownerName;
    }
    
    public void setName(String name){
        this.name=name;
    }
    public void setDetail(String detail){
        this.detail=detail;
    }
    public void setOwnerName(String ownerName){
        this.ownerName=ownerName;
    }
    
    public String getName(){
        return name;
    }
    public String getDetail(){
        return detail;
    }
    public String getOwnerName(){
        return ownerName;
    }
    
    public Double computeCost(String stallType,Integer size){
        
        if(stallType.equals("Platinum")){
            return (double)size*200;
        }
        else if(stallType.equals("Diamond")){
            return (double)size*150;
        }
        else if(stallType.equals("Gold")){
            return (double)size*100;
        }
        
        return (double)0;
    }
    
    public Double computeCost(String stallType,Integer size,Integer n){
        
        if(stallType.equals("Platinum")){
            return ((double)size*200+(double)n*10000);
        }
        else if(stallType.equals("Diamond")){
           return ((double)size*150+(double)n*10000);
        }
        else if(stallType.equals("Gold")){
            return ((double)size*100+(double)n*10000);
        }
       return (double)0;
    }
    
    
    
    
    
}
