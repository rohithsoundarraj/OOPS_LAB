class BrightSmile{
    int pId;
    String name;
    long pNumber;
    String procedure;
    
    BrightSmile(int id,String name,long num,String procedure){
        this.pId=id;
        this.name=name;
        this.pNumber=num;
        this.procedure=procedure;
    }
    void cost(){
        if (procedure.toLowerCase().equals("cleaning"))
        System.out.println(500);
        else if (procedure.toLowerCase().equals("filling"))
        System.out.println(1500);
        else if (procedure.toLowerCase().equals("extraction"))
        System.out.println(2000);
        else if (procedure.toLowerCase().equals("root canal"))
        System.out.println(8000);
    }
    void details(){
        System.out.println("Id: "+pId);
        System.out.println("Name: "+name);
        System.out.println("Phone Number: "+pNumber);
        System.out.println("procedure: "+procedure);
        System.out.print("Total cost: ");
        this.cost();
        System.out.println();
    } 
}
class Main {
    public static void main(String[] args) {
        BrightSmile rohith=new BrightSmile(23,"Rohith",8773466806L,"cleaning");
        BrightSmile singh=new BrightSmile(23,"singh",8998166806L,"filling");
        BrightSmile modi=new BrightSmile(23,"modi",7338166806L,"extraction");
        BrightSmile trump=new BrightSmile(23,"trump",9778166806L,"root canal");
        BrightSmile xi=new BrightSmile(23,"xi",8734333806L,"cleaning");
        rohith.details();
        singh.details();
        modi.details();
        trump.details();
        xi.details();
    }
}