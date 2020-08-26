import java.util.Scanner;
public class PositiveOrNegative {
    public static void main(String[]args){
        int num;
        Scanner Scan= new Scanner(System.in);
        System.out.println("Enter number:");
        num=Scan.nextInt();
        if (num<0){
            System.out.println("Number is negative");
        }
        else if (num>0){
            System.out.println("Number is positive");
        }
    }
}
