import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int balance=10000;
        System.out.print("Enter the ammount: ");
        int withdraw=scanner.nextInt();
        try{
            if (withdraw>balance){
                throw new ArithmeticException("account is greater than balance");
            }
            System.out.println("ammount successfully withdrawed");
            balance-=withdraw;
            System.out.println(balance);
        }
        catch (Exception e){
            System.out.println(e);
        }
        
    }
}