class Department{
    String deptName;
    String location;
    
    Department(String deptName,String location){
        this.deptName=deptName;
        this.location=location;
    }
    
    void deptDetails(){
        System.out.println("Department Name; "+deptName);
        System.out.println("Location: "+location);
    }
}
class Student{
    String name;
    int age;
    Department department;
    
    Student(String name,int age,Department department){
        this.name=name;
        this.age=age;
        this.department=department;
    }
    void studentDetails(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        department.deptDetails();
    }
}

class Main {
    public static void main(String[] args) {
        Department d=new Department("CSE","Block 3");
        Student s=new Student("Rohith",19,d);
        s.studentDetails();
    }
}