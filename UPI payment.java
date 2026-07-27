
abstract class payment {
    protected double amount;
payment(double amount){
    this.amount=amount;
}
abstract void pay();
void receipt(){
 System.out.println("receipt generated");
 System.out.println("Amount paid."+amount);
}
void showpaymentStatus(){
    System.out.println("payment Successfull");
}
}
class upipayment extends payment{
    private String upiId;
upipayment (double amount,String upiId){
    super(amount);
    this.upiId=upiId;
}    
void pay(){
    System.out.println("processing upi payment...");
    System.out.println("upiId;"+upiId);
    }
}
class cardpayment extends payment{
    private String cardnumber;
cardpayment(double amount,String cardnumber){
    super(amount);
    this.cardnumber=cardnumber;
}
void pay(){
    System.out.println("processing card payment...");
    System.out.println("card number;**** **** ****"
    );
    }
}
public class Main{
    public static void main(String[] args){
        payment p1=new upipayment(550.75,"hari@oksbi");
        payment p2=new cardpayment(1250.50,"1234567812345678");
    p1.pay();
    p1.receipt();
    p1.showpaymentStatus();
    System.out.println();
    p2.pay();
    p2.receipt();
    p2.showpaymentStatus();
    }
}    
