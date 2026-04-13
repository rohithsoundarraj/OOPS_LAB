class Address{
    String city;
    String street;
    
    Address(String city,String street){
        this.city=city;
        this.street=street;
    }
    void printAddress(){
        System.out.println(street+","+city);
    }
}
class Student{
    String name;
    Address address;
    
    Student(String name,Address address){
        this.name=name;
        this.address=address;
    }
    
    void printInfo(){
        System.out.println("Name: "+name);
        address.printAddress();
    }
    
}
class Main {
    public static void main(String[] args) {
        Address a=new Address("Chennai","Anna Nagar");
        Student s=new Student("Madish",a);
        s.printInfo();
    }
}