class MyParentClass {
    MyParentClass(){
        System.out.println("MyParentClass Constructor");
    }
}
class MyChildClass extends MyParentClass{
    MyChildClass(){
        System.out.println("MyChidClass Constructor");
    }
    public static void main(String[]args){
        new MyChildClass();
    }
}
