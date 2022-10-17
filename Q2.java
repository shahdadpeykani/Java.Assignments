 import java.util.Scanner;
public class Q2 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integer x: ");
        int x = input.nextInt();
        System.out.println("Enter integer y: ");
        int y = input.nextInt();
        System.out.println("Enter integer z: ");
        int z = input.nextInt();
        double f = (x-y)/(x+y)+(3*x*y);
        double g = (x*x-y*y)/(x+y)+(x*x+z*z)/(y-z);
        System.out.println("f("+x+","+y+")="+(Math.round(f)));
        System.out.println("g("+x+","+y+","+z+")="+(Math.round(g)));

    }
}
