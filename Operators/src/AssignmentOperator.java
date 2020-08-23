public class AssignmentOperator {
    public static void main(String[]args){
        int num1=200;
        int num2=300;
        num2=num1;
        System.out.println("=output:" +num2);
        num2+=num1;
        System.out.println("+=output:" +num2);
        num2-=num1;
        System.out.println("-=output:"+num2);
        num2*=num1;
        System.out.println("*=operator:"+num2);
        num2/=num1;
        System.out.println("/=output:"+num2);
        num2%=num1;
        System.out.println("%=output:"+num2);
    }
}
