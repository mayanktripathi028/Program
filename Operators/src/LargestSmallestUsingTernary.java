import java.util.Scanner;
public class LargestSmallestUsingTernary {
    public static void main(String[]args) {
        int num1, num2, num3, result, temp;
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        num1 = Scanner.nextInt();
        System.out.println("Enter second number:");
        num2 = Scanner.nextInt();
        System.out.println("Enter third number:");
        num3 = Scanner.nextInt();
        Scanner.close();

        temp = num1 > num2 ? num1 : num2;
        result = num3 > temp ? num3 : temp;
        System.out.println("Largest number:" + result);

        temp= num1<num2 ? num1:num2;
        result = num3<temp ? num3:temp;
        System.out.println("Smallest number:"+result);


    }
}
