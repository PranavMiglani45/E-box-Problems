public class Event {
    protected String name;
    protected String detail;
    protected String type;
    protected String organiserName;
	
    public Event(){}
    
    public Event(String name, String detail, String type, String organiserName){
        this.name=name;
        this.detail=detail;
        this.type=type;
        this.organiserName=organiserName;
        
    }
    
    public void display(){
        System.out.println("Event Name:"+name);
        System.out.println("Detail:"+detail);
        System.out.println("Type:"+type);
        System.out.println("Organiser Name:"+organiserName);
    }
	
}
