import java.util.Scanner;
public class SwitchCase2 {
    public static void main(String[]args){
        int num;
        Scanner Scan= new Scanner(System.in);
        System.out.println("Enter number:");
        num = Scan.nextInt();
        switch (num){
            case 1:
                System.out.println("Print A");
            case 2:
                System.out.println("Print B");
            case 3:
                System.out.println("Print C");
            case 4:
                System.out.println("Print D");
            default:
                System.out.println("Default");
        }
    }
}
//* switch case without break statement