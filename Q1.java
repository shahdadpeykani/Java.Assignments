import java.util.Scanner;
public class Q1 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter distance in miles:");
        float miles = input.nextFloat();
        double km = miles*1.609344;
        System.out.println(miles+" miles is equal to "+(Math.round(km))+" kilometers.");

    }
}
