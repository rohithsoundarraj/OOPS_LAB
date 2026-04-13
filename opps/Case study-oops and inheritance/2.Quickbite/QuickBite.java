class QuickOrder{
    String foodName;
    int quantity;
    String address;
    String instruction;
    
    //default
    QuickOrder(){
        this.foodName="Veg Combo";
        this.quantity=1;
        this.address="To be updated";
    }
    //2
    QuickOrder(String foodName,int quantity){
        this.foodName=foodName;
        this.quantity=quantity;
        this.address="Home address on file";
    }
    
    QuickOrder(String foodName,int quantity,String address,String instruction){
        this.foodName=foodName;
        this.quantity=quantity;
        this.address=address;
        this.instruction=instruction;
    }
    
    void displayDetails(){
        System.out.println("food Name: "+foodName);
        System.out.println("quantity: "+quantity);
        System.out.println("address: "+address);
        System.out.println("Instruction: "+instruction);
        
    }
}
class QuickBite{
    public static void main(String[] args) {
        QuickOrder one=new QuickOrder();
        one.displayDetails();
        QuickOrder two=new QuickOrder("pizza",2);
        two.displayDetails();

        QuickOrder three=new QuickOrder("Biryani",2,"mirzapur","no onions");
        three.displayDetails();
    }
}