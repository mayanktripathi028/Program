class Test1{
    public void display1(){
        System.out.println("display1 method");
    }
}
abstract class Test2 {
    abstract void display2();
}
class Abc extends Test2{
    public void display2(){
        System.out.println("display2 method");
    }
}
abstract class Test3 extends Test1{
    abstract void display3();
}
class Test4 extends Test3{
    public void display3(){
        System.out.println("display3 method");
    }
}
class Demo2{
    public static void main(String args[]){
        Test4 obj=new Test4();
        obj.display3();
        Test1 T1= new Test1();
        T1.display1();
        Abc a= new Abc();
        a.display2();


    }
}