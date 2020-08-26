import java.util.Scanner;
public class NestedIf {
    public static void main(String[]args){
        int num;
        Scanner Scan= new Scanner(System.in);
        System.out.println("Enter number:");
        num=Scan.nextInt();
        if (num<100){
            System.out.println("Number is less than 100");
        }
        if (num>50){
            System.out.println("number is greater than 50");
        }
    }
}
