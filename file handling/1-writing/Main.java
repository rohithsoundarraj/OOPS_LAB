import java.io.FileWriter;
import java.io.IOException;
class Main {
    public static void main(String[] args) {
        try{
            FileWriter fw=new FileWriter("first.txt");
            fw.write("This is my first file");
            fw.close();
            
            System.out.println("File written successfully");
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}