import java.io.*;
class Main {
    public static void main(String[] args) {
        try{
            BufferedReader bf=new BufferedReader(new FileReader("test.txt"));
            
            String line;
            while((line=bf.readLine())!=null){
                System.out.println(line);
            }
            bf.close();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}