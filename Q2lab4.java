import java.util.Scanner;
public class Q2lab4 {
    public static void main(String[]args){
        //Write a java program to check if a number is divisible.
        Scanner input = new Scanner(System.in);
        System.out.print("Input number: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        if (num1%num2==0) {
            System.out.println(num1 + " is divisible by " + num2);
        }
        else {
            System.out.println(num1+" is not divisible by "+num2);
        }

    }
}
