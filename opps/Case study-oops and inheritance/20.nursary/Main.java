class UrbanGarden{
    int plantId;
    String name;
    String type;
    int price;
    int quantity;
    
    UrbanGarden(int plantId,String name,String type,int price,int quantity){
        this.plantId=plantId;
        this.name=name;
        this.type=type;
        this.price=price;
        this.quantity=quantity;
    }
    void restock(int q){
        quantity+=q;
    }
    void sell(int count){
        if (quantity>=count){
            quantity-=count;
        }
        else
        System.out.println("stock insufficient");
    }
    void display(){
        System.out.println("Plant Id: "+plantId);
        System.out.println("Name: "+name);
        System.out.println("Type: "+type);
        System.out.println("price: "+price);
        System.out.println("Quantity: "+quantity);
        System.out.println();
    }
}
class Main {
    public static void main(String[] args) {
        UrbanGarden tulsi=new UrbanGarden(1,"Tulsi","outdoor",100,20);
        UrbanGarden pothos=new UrbanGarden(2,"Pothos ","indoor",150,10);
        UrbanGarden lily=new UrbanGarden(3,"lily ","outdoor",200,15);
        
        tulsi.sell(15);
        tulsi.display();
        
        pothos.sell(20);
        pothos.display();
        
        lily.restock(10);
        lily.display();
    }
}