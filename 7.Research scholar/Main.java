class Person{
    String name;
    int id;
    
    Person(String name,int id){
        this.name=name;
        this.id=id;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Id: "+id);
    }
}
class Student extends Person{
    String dept;
    double cgpa;
    
    Student(String name,int id,String dept,double cgpa){
        super(name,id);
        this.dept=dept;
        this.cgpa=cgpa;
    }
    void display(){
        super.display();
        System.out.println("Department: "+dept);
        System.out.println("CGPA: "+cgpa);
    }
}
class ResearchScholar extends Student{
    String rtopic;
    String gname;
    
    ResearchScholar(String name,int id,String dept,double cpga,String rtopic,String gname){
        super(name,id,dept,cpga);
        this.rtopic=rtopic;
        this.gname=gname;
    }
    void display(){
        super.display();
        System.out.println("Research Topic: "+rtopic);
        System.out.println("Guide Name: "+gname);
    }
}

class Main {
    public static void main(String[] args) {
        ResearchScholar rohith=new ResearchScholar("Rohith",40,"cse",8,"computer vision","surya");
        rohith.display();
    }
}