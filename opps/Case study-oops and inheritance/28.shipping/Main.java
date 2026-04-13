abstract class ShipmentBlueprint{
    String shipmentId;
    int weight;
    String destination;
    static final String CODE="LOGI";
    
    ShipmentBlueprint(String shipmentId,int weight,String destination){
        this.shipmentId=shipmentId;
        this.weight=weight;
        this.destination=destination;
    }
    
    abstract double shippingCost();
    
    static String trackNumber(String shipmentId){
        String tn=(shipmentId+CODE);
        return tn;
        
    }
}
class DomesticShipment extends ShipmentBlueprint{
    DomesticShipment(String shipmentId,int weight,String destination){
        super(shipmentId,weight,destination);
    }
    double shippingCost(){
        return (weight*50);
    }
}
class InternationalShipment extends ShipmentBlueprint{
    InternationalShipment(String shipmentId,int weight,String destination){
        super(shipmentId,weight,destination);
    }
    double shippingCost(){
        return (weight*200)+1000;
    }
}

class Main {
    public static void main(String[] args) {
        DomesticShipment d=new DomesticShipment("DO23",23,"Mumbai");
        System.out.println(d.shippingCost());
        InternationalShipment i=new InternationalShipment("IN22",40,"New York");
        System.out.println(i.shippingCost());
        System.out.println(ShipmentBlueprint.trackNumber("IN22"));

    }
}