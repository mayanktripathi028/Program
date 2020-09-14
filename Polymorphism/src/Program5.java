// static binding
class Human{
    public static void walk(){
        System.out.println("HUman walk");
    }
}
class Boy extends Human{
    public static void walk(){
        System.out.println("Boy walk");
    }
    public static void main(String[]args){
        Human H= new Human();
        H.walk();
        Boy B= new Boy();
        B.walk();
    }
}