import java.util.Scanner;
public class Grade{
    public static void main(String[] args){
        System.out.print("Enter your marks: ");
        Scanner scanner=new Scanner(System.in);
        int marks=scanner.nextInt();
        if (marks>=90){
            System.out.println("Grade:A");
        }
        else if (marks>=75){
            System.out.println("Grade:B");
        }
        else if (marks>=60){
            System.out.println("Grade:C");
        }
        else if (marks>=40){
            System.out.println("Grade:D");
        }
        else{
             System.out.println("Grade:Fail");
        }
    }
}