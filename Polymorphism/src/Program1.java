// Method Overloading
class Test{
    void show (){
        System.out.println("1");
    }
    void show(int a){
        System.out.println("2");
    }
    void show(int a, String b){
        System.out.println("3");
    }
    void show(String a, int b){
        System.out.println("4");
    }
    public static void main(String[]args){
        Test t=new Test();
        t.show();
        t.show(10);
        t.show(10, "abc");
        t.show("abc", 10);
    }
}