// Continue statement in while loop
public class ContinueStatement2 {
    public static void main(String[]args) {
        int i = 10;
        while (i >= 0) {
            if (i == 2) {

                i--;
                continue;
            }
            System.out.println(i+" ");
            i--;

        }
    }}



