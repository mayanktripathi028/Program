interface I1{
    public void show1();
}
interface I2{
    public void display1();
}
interface In{
    public void Show();
    public void Display();
}
class Test implements I1,I2{
    @Override
    public void show1() {
        System.out.println("Show 1");
    }

    @Override
    public void display1() {
        System.out.println("Display 1");
    }
}
class demo implements In{
    @Override
    public void Show() {
        System.out.println("one");
    }
    @Override
    public void Display() {
        System.out.println("Display");
    }
    public static void main(String[]args){
        demo d= new demo();
        d.Show();
        d.Display();
        Test t= new Test();
        t.show1();
        t.display1();
    }
}