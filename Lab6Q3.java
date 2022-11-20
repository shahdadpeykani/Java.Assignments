import java.util.Scanner;
public class Lab6Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int y =44;
        int z=0;
        System.out.println("I have picked a number between 1 and 100.");
        do {
            System.out.print("Guess the number: ");
            x = sc.nextInt();
            if(x>y) {
                System.out.println("Decrease your guess");
                z++;
            }
            else if(x<y) {
                System.out.println("Increase your guess");
                z++;
            }
            else {
                z++;
                System.out.println("You have found the number after "+z+" guess.");
            }
        }while(x!=y);
    }
}
