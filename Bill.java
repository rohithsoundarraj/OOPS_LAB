import java.util.Scanner;
public class Bill{
    public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);
    System.out.print("Enter number of units used: ");
    int units=scanner.nextInt();
    int bill;
    if (units<=100){
        bill=(units*1);
    }
    else if (units<=200){
        bill=(100*1)+((units-100)*2);
    }
    else{
        bill=(100*1)+(100*2)+((units-200)*3);
    }
    System.out.print("Total bill amount: "+bill);
    }
}