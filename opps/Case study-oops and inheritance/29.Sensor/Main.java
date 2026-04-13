class Sensor{
    public int sensorId;
    String location;
    private String caliKey;
    public int readingValue;
    static int countS=0;

    
    Sensor(int sensorId,String location,String caliKey,int readingValue){
        this.sensorId=sensorId;
        this.location=location;
        this.caliKey=caliKey;
        this.readingValue=readingValue;
        countS++;

    }
    static final char unit='C';
    
    static double ctf(int c){
        double f=(c*(9.0/5))+32;
        return f;
    }
}
class Main {
    public static void main(String[] args) {
        Sensor one=new Sensor(343,"ground","yes",33);
        Sensor two=new Sensor(893,"first","yes",20);
        System.out.println(Sensor.countS);
        System.out.println(Sensor.ctf(1));

        
    }
}