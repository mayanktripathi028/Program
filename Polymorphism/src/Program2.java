// method overriding
class Demo{
    void show(){
        System.out.println("1");
    }
}
class ABC extends Demo {
    void show() {
        System.out.println("2");
    }
    public static void main(String[]args){
        Demo d= new Demo(); // object
        d.show();
        ABC a=new ABC();// object
        a.show();

    }
}