interface Example1{
    int numOne=10;
}
class Example2 implements Example1{
    public void display1(){
        System.out.println("Num1="+numOne);
    }
    public static void main(String args[]){
        Example2 obj=new Example2();
        obj.display1();
    }
}
