import java.util.Scanner;
public class VowelsAndConsonent {
    public static void main(String[]args){
        char ch;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter Alphabet:");
        char charAt= scan.next().charAt(0);
        switch (charAt){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("is vowels");
                break;
            default:
                System.out.println( "is consonent");


        }
    }
}
