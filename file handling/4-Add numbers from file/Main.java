import java.io.*;
class Main {
    public static void main(String[] args) {
        try{
            BufferedReader bf=new BufferedReader(new FileReader("numbers.txt"));
            int sum=0;
            int count=0;
            String line;
            while((line=bf.readLine())!=null){
                int num=Integer.parseInt(line);
                sum+=num;
                count++;
            }
            System.out.println("Sum: "+sum);
            
            System.out.println("Average: "+sum/count);
            bf.close();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}