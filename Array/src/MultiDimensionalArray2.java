public class MultiDimensionalArray2 {
    public static void main(String[] args) {
        int a[][][] = {{{10, 20, 40}, {22, 42, 62}, {26, 36, 48}}};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i][j].length; k++) {
                    System.out.print(a[i][j][k] + " ");
                }
                System.out.println();
            }
        }
    }
}