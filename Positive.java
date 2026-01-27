import java.util.Scanner;
public class Positive{
    public static void main(String[] args) {
        int a;
        Scanner scanner=new Scanner(System.in);
        do{
            System.out.print("Enter the number: ");
            a=scanner.nextInt();
        }while(a<=0);
        System.out.println("You entered: "+a);
    }
}