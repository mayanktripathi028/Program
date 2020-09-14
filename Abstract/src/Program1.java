abstract class vehicle{
    abstract void start();
}
class car extends vehicle{
    void start(){
        System.out.println("Car starts with key");
    }
}
class scooter extends vehicle{
    void start() {
        System.out.println("Scooter starts with kick");
    }
    public static void main(String[]args){
        car c= new car();
        c.start();
        scooter s= new scooter();
        s.start();
    }
}