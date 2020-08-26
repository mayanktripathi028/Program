import java.util.Scanner;
public class RelationOperator {
    public static void main(String[]args){
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        num1 = sc.nextInt();

        System.out.println("Enter Second Number: ");
        num2 = sc.nextInt();

        if(num1==num2){
            System.out.println("num1 and num2 are equal");
        }
        else{
            System.out.println("num1 and num2 are not equal");
        }
        if(num1 != num2){
            System.out.println("num1 and num2 are not equal");
        }
        else{
            System.out.println("num1 and num2 are equal");
        }
        if (num1>num2){
            System.out.println("num1 is greater than num2");
        }
        else {
            System.out.println("num1 is not greater than num2");
        }
        if (num1>=num2){
            System.out.println("num1 is greater than or equal to num2");
        }
        else{
            System.out.println("num1 is less than num2");
        }
        if (num1<num2){
            System.out.println("num1 is less than num2");
        }
        else {
            System.out.println("num1 is not less than num2");
        }
        if (num1<=num2){
            System.out.println("num1 is less than or equal to num2");
        }
        else {
            System.out.println("num1 is greater than num2");
        }
    }
}
