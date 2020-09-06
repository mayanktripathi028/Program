// use of break in while loop
public class BreakStatement1 {
    public static void main(String[] args) {
        int num = 0;
        while (num <= 100) {
            System.out.println("value of num:" + num);
            if (num == 2) {
                break;
            }
            num++;
        }
        System.out.println("Out of while loop");
    }
}
