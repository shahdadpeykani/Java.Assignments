import java.util.Scanner;
public class Q3 {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 4 digits number: ");
        int n = input.nextInt();
        int a = n / 1000;
        int b= (n%1000)/100;
        int c= ((n%1000)%100)/10;
        int d=((n%1000)%100)%10;
        System.out.println("Thousands: "+a);
        System.out.println("Hundreds: "+b);
        System.out.println("Tens: "+c);
        System.out.println("Units: "+d);

    }
}
