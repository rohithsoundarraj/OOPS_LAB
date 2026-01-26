import java.util.Scanner;
public class Pin{
    public static void main(String[] args){
        int pass=8462;
        int attempts=0;
        int pin;
        Scanner scanner=new Scanner(System.in);
        while(attempts<3){
            System.out.print("Enter the pin: ");
            pin=scanner.nextInt();
            attempts++;
            if (pin==pass){
                System.out.println("Access Granted");
                break;
            }
            if (attempts==3){
                System.out.println("Card Blocked");
                break;
            }
        }
    }
}