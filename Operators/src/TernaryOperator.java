import java.util.Scanner;
public class TernaryOperator {
    public static void main(String[]args){
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        num1 = sc.nextInt();

        num2=(num1==10)? 100:200;
        System.out.println("num2:"+num2);

        num2=(num1==25)?100:200;
        System.out.println("num2:"+num2);
    }
}
