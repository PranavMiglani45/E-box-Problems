public class Exhibition extends Event {
    private Integer noOfStalls;
	
	public Exhibition(){}
    
    public Exhibition(String name, String detail, String type, String organiserName, Integer noOfStalls){
        super(name,detail,type,organiserName);
        this.noOfStalls=noOfStalls;
    }
	
    
    public void display(){
        super.display();
        System.out.println("Number of stalls:"+noOfStalls);
    }
}
