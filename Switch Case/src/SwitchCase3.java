//* switch case with break statement.

import java.util.Scanner;
public class SwitchCase3 {
    public static void main(String[]args){
        int num;
        Scanner Scan= new Scanner(System.in);
        System.out.println("Enter value");
        num= Scan.nextInt();
        switch (num){
            case 1:
                System.out.println("Value A");
                break;
            case 2:
                System.out.println("value B");
                break;
            case 3:
                System.out.println("value C");
                break;
            case 4:
                System.out.println("value D");
                break;
            default:
                System.out.println("Default");
                break;
        }
    }
}
