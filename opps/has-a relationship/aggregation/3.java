class Company{
    String companyName;
    String industry;
    
    Company(String companyName,String industry){
        this.companyName=companyName;
        this.industry=industry;
    }
    
    void companyDetails(){
        System.out.println("Company:"+companyName);
        System.out.println("Industry: "+industry);
    }
}
class Employee{
    String empName;
    double salary;
    Company company;
    
    Employee(String empName,double salary,Company company){
        this.empName=empName;
        this.salary=salary;
        this.company=company;
    }
    void employeeDetails(){
        System.out.println("Employee Name: "+empName);
        System.out.println("Salary: "+salary);
        company.companyDetails();
    }
}
class Main {
    public static void main(String[] args) {
        Company c=new Company("Infosys","IT");
        Employee e1=new Employee("ROHITH",10000,c);
        Employee e2=new Employee("MONISH",100000,c);
        e1.employeeDetails();
        System.out.println();
        e2.employeeDetails();
        
    }
}