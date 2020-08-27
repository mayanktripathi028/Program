import  java.util.Scanner;
public class SwitchCase1 {
    public static void main(String[]args){
        int num;
        Scanner Scan= new Scanner(System.in);
        System.out.println("enter nuber:");
        num= Scan.nextInt();
        switch (num+2){
            case 1:
                System.out.println("case 1: value is:" +num);
            case 2:
                System.out.println("case 2: value is:" +num);
            case 3:
                System.out.println("case 3: value is:" +num);
            case 4:
                System.out.println("case 4: value is:" +num);
            default:
                System.out.println("default: value is:" +num);
        }
    }
}
