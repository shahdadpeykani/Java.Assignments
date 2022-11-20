import java.util.Scanner;
public class Lab6Q2 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer:");
        int integer = input.nextInt();
        int i = 1;
        while (i<=integer){
           int x = i*i;
            System.out.println("Square of "+i+": "+x);
            i++;
        }
    }

}
