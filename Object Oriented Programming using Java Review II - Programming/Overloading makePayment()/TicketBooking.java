

public class TicketBooking {
    private String stageEvent;
    
    private String customer;
    private Integer noOfSeats;
    
    public TicketBooking(){}
    
    public TicketBooking(String stageEvent,String customer,Integer noOfSeats){
        this.stageEvent=stageEvent;
        this.customer=customer;
        
        this.noOfSeats=noOfSeats;
    }
    public void setStageEvent(String stageEvent){
        this.stageEvent=stageEvent;
    }
    public String getStageEvent(){
        return stageEvent;
    }
    public void setCustomer(String customer){
        this.customer=customer;
    }
    public String getCustomer(){
        return customer;
        
    }
    public void setNoOfSeats(Integer noOfSeats){
        this.noOfSeats=noOfSeats;
    }
    public Integer getNoOfSeats(){
        return noOfSeats;
    }
    
    public void makePayment(Double amount){
        System.out.println("Stage event:"+this.stageEvent+"\nCustomer:"+this.customer+"\nNumber of seats:"+this.noOfSeats+"\nAmount "+amount +" paid in cash");
    }
    
    public void makePayment(String walletNumber,Double amount){
        System.out.println("Stage event:"+this.stageEvent+"\nCustomer:"+this.customer+"\nNumber of seats:"+this.noOfSeats+"\nAmount "+amount +" paid using wallet number "+walletNumber);
    }
    
    public void makePayment(String creditCard,String ccv,String name,Double amount){
        System.out.println("Stage event:"+this.stageEvent+"\nCustomer:"+this.customer+"\nNumber of seats:"+this.noOfSeats+"\nHolder name:"+name +"\nAmount "+amount +" paid using  "+creditCard+" card"+"\nCCV:"+ccv);                   
    }
    
}






