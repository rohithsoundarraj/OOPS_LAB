class Reservation{
    String name;
    String room;
    int floor;
    int rate;

    Reservation(){
        this.name="Walk-in Guest";
        this.room="standard room";
        this.floor=1;
        this.rate=2000;
    }
    
    Reservation(String name,String room,int floor,int rate){
        this.name=name;
        this.room=room;
        this.floor=floor;
        this.rate=rate;
    }
    
    Reservation(Reservation er,String name){
        this.name=name;
        this.room=er.room;
        this.floor=er.floor;
        this.rate=er.rate;
    }
    
    void display(){
        System.out.println("Guest: "+name);
        System.out.println("Room: "+room);
        System.out.println("Floor: "+floor);
        System.out.println("Rate: "+rate);
    }
}
class Main {
    public static void main(String[] args) {
        Reservation walk=new Reservation();
        walk.display();
        Reservation ab=new Reservation("Rohith","suit",2,3000);
        ab.display();
        Reservation f=new Reservation(ab,"Monish");
        f.display();
    }
}