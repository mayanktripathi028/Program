import java.util.Scanner;
public class IfElse {
    public static void main(String[]args){
        int num;
        Scanner Scan= new Scanner(System.in);
        System.out.println("Enter number:");
        num=Scan.nextInt();
        if (num<100){
            System.out.println("Number is smaller than 100");
        }
        else {
            System.out.println("number is greater than 100");
        }
    }
}
