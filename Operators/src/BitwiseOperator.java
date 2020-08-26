import java.util.Scanner;
public class BitwiseOperator {
    public static void main(String[]args){
        int num1, num2, result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        num1 = sc.nextInt();

        System.out.println("Enter Second Number: ");
        num2 = sc.nextInt();
        result= num1&num2;
        System.out.println("num1&num2:"+result);
        result=num1|num2;
        System.out.println("num1|num2:"+result);
        result= num1^num2;
        System.out.println("num1^num2:"+result);
        result =~num1;
        System.out.println("~num1:"+result);
        result=num1<<2;
        System.out.println("num1<<2:"+result);
        result=num1>>2;
        System.out.println("num1>>2:"+result);


    }

}
