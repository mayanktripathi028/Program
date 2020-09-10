// Super class or parent class
class A{
    int num=10;
}
// Child class or Sub class
class B extends A{
    int num=20;
    void number(){
        System.out.println(num); //if num=super.num it display 10
    }
    public static void main(String[]args){
        B obj= new B();
        obj.number();
    }
}