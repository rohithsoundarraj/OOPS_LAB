abstract class ArtVault{
    int artifactId;
    String name;
    String country;
    
    ArtVault(int artifactId,String name,String country){
        this.artifactId=artifactId;
        this.name=name;
        this.country=country;
    }
    
    public static int fee=500;
    public static int artiCount=0;
    
    
    abstract void display();
}
class Painting extends ArtVault{
    String medium;
    
    Painting(int artifactId,String name,String country,String medium){
        super(artifactId,name,country);
        this.medium=medium;
        artiCount++;
    }  
    void display(){
        System.out.println(artifactId);
        System.out.println(name);
        System.out.println(country);
        System.out.println(medium);
    }
}
class Sculpture extends ArtVault{
    String material;
    
    Sculpture(int artifactId,String name,String country,String material){
        super(artifactId,name,country);
        this.material=material;
        artiCount++;
    }  
    void display(){
        System.out.println(artifactId);
        System.out.println(name);
        System.out.println(country);
        System.out.println(material);
    }
}

class Main {
    public static void main(String[] args) {
        Painting P=new Painting(232,"monolisa","Italy","oil");
        P.display();
        Sculpture S=new Sculpture(154,"King","France","marble");
        S.display();
        System.out.println(ArtVault.artiCount);
    }
}