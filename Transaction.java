import java.util.Scanner;
public class Transaction{
    public static void main(String[] args){
        System.out.print("Enter balance: ");
        Scanner scanner=new Scanner(System.in);
        int balance=scanner.nextInt();
        System.out.print("Enter withdraw ammount: ");
        int withdraw=scanner.nextInt();
        if (balance>=withdraw && withdraw%100==0){
            System.out.println("Transaction Successful");
        }
        else{
            System.out.println("Transaction Unsuccessful");
        }
    }
}