class CineNova{
    String mName;
    String showTime;
    int screenNumber;
    int seats;
    
    CineNova(String mName,String showTime,int screenNumber,int seats){
        this.mName=mName;
        this.showTime=showTime;
        this.screenNumber=screenNumber;
        this.seats=seats;
    }
    
    void bookTicket(int tickets){
        seats-=tickets;
    }
    void cancel(int tickets){
        seats+=tickets;
    }
    void displayDetails(){
        System.out.println("Movie: " + mName);
        System.out.println("Showtime: " + showTime);
        System.out.println("Screen: " + screenNumber);
        System.out.println("Available Seats: " + seats);
        System.out.println();
    }
    
}

class Main {
    public static void main(String[] args) {
        CineNova one=new CineNova("Puli","12:30",1,240);
        CineNova two=new CineNova("Leo","4:30",1,190);
        
        one.bookTicket(30);
        two.bookTicket(30);
        
        two.cancel(5);
        one.displayDetails();
        two.displayDetails();

    }
}