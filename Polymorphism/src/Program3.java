class Animal{
    void sound(){
        System.out.println("Animal is making a sound");
    }
}
class Horse extends Animal{
    void sound(){
        System.out.println("Neigh");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("Meow");
    }
    public static void main(String args[]){
        Horse H = new Horse();
        H.sound();
        Cat c  = new Cat();
        c.sound();

    }
}