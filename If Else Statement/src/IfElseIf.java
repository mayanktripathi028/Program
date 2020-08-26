import java.util.Scanner;
public class IfElseIf {
    public static void main(String[]args){
        int num;
        Scanner Scan= new Scanner(System.in);
        System.out.println("Enter number");
        num= Scan.nextInt();
        if (num<100 && num>=1){
            System.out.println("Two number digit");
        }
        else if (num<1000 && num>=100){
            System.out.println("Three number digit");
        }
        else if (num<10000 && num>=1000){
            System.out.println("Four number digit");
        }
        else if (num<100000 && num>=10000){
            System.out.println("Five number digit" );
        }
    }
}
