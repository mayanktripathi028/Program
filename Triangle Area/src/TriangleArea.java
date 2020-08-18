import java.util.Scanner;
class TrianglArea {
    public static void main(String[]args){
        Scanner scan= new Scanner(System.in);
        int Height, base, Area;
        System.out.print("Height:");
        Height = scan.nextInt();
        System.out.print("base:");
        base = scan.nextInt();
        scan.close();
        Area=(Height*base)/2;
        System.out.println("Area of Triangle:"+Area);

    }
}
