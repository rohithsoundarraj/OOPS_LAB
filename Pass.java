import java.util.Scanner;
public class Pass{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String pass="Q.rRbL6/o";
        String guess;
        do{
            System.out.print("Enter the password: ");
            guess=scanner.next().toLowerCase();
        }while (!guess.equals(pass));
        System.out.println("Login Successful");
    }
}