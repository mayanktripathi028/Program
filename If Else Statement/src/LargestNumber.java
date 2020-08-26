import java.util.Scanner;
public class LargestNumber {
    public static void main(String[]args){
        int num1, num2, num3;
        Scanner Scan= new Scanner(System.in);
        System.out.println("Enter num1:");
        num1= Scan.nextInt();
        System.out.println("Enter num2:");
        num2= Scan.nextInt();
        System.out.println("Enter num3:");
        num3= Scan.nextInt();
        if (num1>=num2 && num1>=num3){
            System.out.println("num1 is greater number");
        }
        else if (num2>=num3 && num2>=num1){
            System.out.println("num2 is greater number");
        }
        else if (num3>=num1 && num3>=num1){
            System.out.println("num3 is greater number");
        }
    }
}
