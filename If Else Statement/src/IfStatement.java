import java.util.Scanner;
public class IfStatement{
    public static void main(String[]args){
        int num;
        Scanner Scan= new Scanner(System.in);
        System.out.println("Enter Number:");
        num= Scan.nextInt();
        if (num<100){
            System.out.println("Number is less than 100");
        }

    }
}