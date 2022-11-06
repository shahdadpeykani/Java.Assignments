import java.util.Scanner;
public class Q1Lab4 {
    public static void main(String[]args){
        //Write a java program to decide larger of two input numbers.
        Scanner input = new Scanner(System.in);
        System.out.print("Input numbers: ");
        int num1 = input.nextInt();
        int num2=input.nextInt();
        int max=num1;
        if(max>num2){
            System.out.println("The larger number is: "+max);
        }
        else {
            max = num2;
            System.out.println("The larger number is: "+max);
        }
    }
}
