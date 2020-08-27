import java.util.Scanner;
public class Calculator2 {
    public static void main(String[]args){
        int num1, num2, sum = 0;
        Scanner Scan= new Scanner(System.in);
        System.out.println("num1:");
        num1= Scan.nextInt();
        System.out.println("num2:");
        num2= Scan.nextInt();

        System.out.println("Enter operator(+,-,*,/):");
        char operator= Scan.next().charAt(0);

        switch (operator){
            case '+':
                sum = num1 +num2;
                System.out.println("num1+num2="+sum);
                break;
            case '-':
                sum= num1-num2;
                System.out.println("num1-num2="+sum);
                break;
            case '*':
                sum= num1*num2;
                System.out.println("num1*num2"+sum);
                break;
            case '/':
                sum=num1/num2;
                System.out.println("num1/num2="+sum);
                break;
            default:
                System.out.println("wrong input");
        }
        System.out.println(num1+""+operator+""+num2+"="+sum);


    }
}
