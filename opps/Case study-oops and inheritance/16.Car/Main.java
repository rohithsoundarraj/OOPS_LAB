class Car{
    String licenseP;
    String oName;
    String cmodel;
    String color;
    
    
    Car(String licenseP,String oName,String cmodel,String color){
        this.licenseP=licenseP;
        this.oName=oName;
        this.cmodel=cmodel;
        this.color=color;
    }
    void basicWash(){
        displaySummary("Basic Exterior Wash");
    }

    void vacuumCleaning(){
        displaySummary("Interior Vacuum Cleaning");
    }

    void fullDetail(){
        displaySummary("Full Detail Service");
    }
    
    void displaySummary(String service){
        System.out.println("Car Details:");
        System.out.println("License Plate: " + licenseP);
        System.out.println("Owner Name: " + oName);
        System.out.println("Model: " + cmodel);
        System.out.println("Color: " + color);
        System.out.println("Service Performed: " + service);
        System.out.println();
    }
}
class Main {
    public static void main(String[] args) {
        Car car1 = new Car("TN01AB1234","Rahul","Hyundai i20","White");
        Car car2 = new Car("TN02CD5678","Priya","Honda City","Black");
        Car car3 = new Car("TN03EF9012","Arjun","Swift","Red");

        car1.basicWash();
        car2.vacuumCleaning();
        car3.fullDetail();
    }
}