interface Payment{
    void processPayment(double amount);
}
class CreditCardPayment implements Payment{
    
    public void processPayment(double amount){
        System.out.println(amount+" payment through credit card");
    }
}
class UPIPayment implements Payment{
    
    public void processPayment(double amount){
        System.out.println(amount+" payment through upi");
    }
}
class CashPayment implements Payment{
    
    public void processPayment(double amount){
        System.out.println(amount+" payment through cash");
    }
}
class PaymentProcessor{
    
    public void payment(Payment p,double amount){
        p.processPayment(amount);
    }
}
class Main {
    public static void main(String[] args) {
        PaymentProcessor r=new PaymentProcessor();
        r.payment(new UPIPayment(),400);
    }
}