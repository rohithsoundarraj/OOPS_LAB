class Room{
    String roomType;
    int size;
    
    Room(String roomType,int size){
        this.roomType=roomType;
        this.size=size;
    }
    void roomDetails(){
        System.out.println("Room Type: "+roomType);
        System.out.println("Size: "+size);
    }
}
class House{
    String address;
    Room room;
    
    House(String address,String roomType,int size){
        this.address=address;
        this.room=new Room(roomType,size);
    }
    void houseDetails(){
        System.out.println("Address "+address);
        room.roomDetails();
    }
}
class Main {
    public static void main(String[] args) {
        House h=new House("Anna nagar","suit",15);
        h.houseDetails();
    }
}