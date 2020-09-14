abstract class Sum{
    public void disp(){
        System.out.println("Method of class Sum");
    }
    abstract int sumOfTwo(int n1, int n2);
    abstract int sumOfThree(int n1, int n2, int n3);

}
class Demo extends Sum{
    int sumOfTwo(int num1, int num2){
        return num1+num2;
    }
    int sumOfThree(int num1, int num2, int num3){
        return num1+num2+num3;
    }
    public static void main(String args[]){
        Sum obj = new Demo();
        obj.disp();
        System.out.println(obj.sumOfTwo(3, 7));
        System.out.println(obj.sumOfThree(4, 3, 19));

    }
}