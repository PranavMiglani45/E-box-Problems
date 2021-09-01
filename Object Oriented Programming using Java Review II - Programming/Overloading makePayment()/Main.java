
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
       
       TicketBooking t=null;
       
       
        System.out.println("Enter the Booking details");
        String[] ch=br.readLine().split(",");
        
        t=new TicketBooking();
        
        t.setStageEvent(ch[0]);
        t.setCustomer(ch[1]);
        t.setNoOfSeats(Integer.parseInt(ch[2]));
        
        
        System.out.println("Payment mode");
        System.out.println("1.Cash payment");
        System.out.println("2.Wallet payment");
        System.out.println("3.Credit card payment");
        
        int n=Integer.parseInt(br.readLine());
        
        
        switch(n){
            case 1:{
                System.out.println("Enter the amount");
                double amount=Double.parseDouble(br.readLine());
        
                t.makePayment(amount);
                break;
            }
            case 2:{
                System.out.println("Enter the amount");
                double amount=Double.parseDouble(br.readLine());
                
                System.out.println("Enter the wallet number");
                String walletN=br.readLine();
            
                t.makePayment(walletN,amount);
                break;
            }
            case 3:{
                System.out.println("Enter card holder name");
                String name=br.readLine();
                
                System.out.println("Enter the amount");
                double amount=Double.parseDouble(br.readLine());
                
                System.out.println("Enter the credit card type");
                String creditCard=br.readLine();
                
                 System.out.println("Enter the CCV number");
                String ccv=br.readLine();
            
                t.makePayment(creditCard,ccv,name,amount);
                break;
            }
            default:
                System.out.println("Invalid choice");
                break;
            
        }
            
            
            
            
        }
    
}
