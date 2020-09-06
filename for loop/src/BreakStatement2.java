// use of break in for loop
public class BreakStatement2 {
    public static void main(String[]args){
        int i;
        for (i=100; i>=10; i--){
            System.out.println("variable i:"+i);
            if (i==99){
                break;
            }
        }
        System.out.println("out of loop");
    }
}
