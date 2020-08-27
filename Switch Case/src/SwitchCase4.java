//* switch case with break statement using char
import java.util.Scanner;
public class SwitchCase4 {
    public static void main(String[]args){
        char ch;
        Scanner Scan= new Scanner(System.in);
        System.out.println("Enter value:");
        char charAt = Scan.next().charAt(0);
        switch (charAt){
            case 'a':
                System.out.println("Value A");
                break;
            case 'b':
                System.out.println("Value B");
                break;
            case 'c':
                System.out.println("Value c");
                break;
            case 'd':
                System.out.println("Value D");
                break;
            default:
                System.out.println("Default");
        }
    }
}
