class abc{
    void display(int a, String b){
        System.out.println("A");
    }
}
class xyz extends abc{
    void display(int a, String b){
        super.display(10, "deepak");
        System.out.println("B");
    }
    public static void main(String[]args){
        xyz x= new xyz();
        x.display(20,"amit");

    }
}