class BankAccount{
    private String accountHolder;
    private int accountNumber;
    private double balance;
    //constructor
    BankAccount(String accountHolder,int accountNumber,double balance){
        this.accountHolder=accountHolder;
        this.accountNumber=accountNumber;
        
        if (balance>=0){
            this.balance=balance;
        }
        else{
            this.balance=0;
        }
    }
    //getters
    String getAccountHolder(){
        return accountHolder;
    }
    int getAccountNumber(){
        return accountNumber;
    }
    double getBalance(){
        return balance;
    }
    //deposit method
    void deposit(double amount){
        if (amount>0){
            this.balance+=amount;
        }
        else{
            System.out.print("Invalid deposit amount");
        }
    }
    //withdraw method
    void withdraw(double amount){
        if (amount>0 && balance>=amount){
            this.balance-=amount;
        }
        else{
            System.out.println("Insufficient");
        }
    }
}

class Main {
    public static void main(String[] args) {
        BankAccount ob=new BankAccount("john",1234,1000);
        System.out.println(ob.getAccountHolder());
        System.out.println(ob.getAccountNumber());
        System.out.println(ob.getBalance());
        ob.deposit(500);
        ob.withdraw(200);
        ob.withdraw(2000);
        System.out.println(ob.getBalance());

    }
}