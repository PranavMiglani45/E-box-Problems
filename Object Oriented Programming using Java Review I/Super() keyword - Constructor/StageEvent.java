public class StageEvent extends Event{
    private Integer noOfSeats;
   public StageEvent(){}
   public StageEvent(String name, String detail, String type, String organiserName, Integer noOfSeats){
       super(name,detail,type,organiserName);
       this.noOfSeats=noOfSeats;
   }
   
   public void display(){
       super.display();
       System.out.println("Number of seats:"+noOfSeats);
   }
}
