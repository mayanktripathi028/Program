//continue statement in do while loop
public class ContinueStatement3 {
    public static void main(String[] args) {
        int i = 0;
        do {
            if(i==6){
                i++;
                continue;
            }
            System.out.println(i+" ");
            i++;
            }
        while (i<10);

        }
    }
