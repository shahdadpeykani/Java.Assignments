import java.util.Scanner;
public class Q2CaesarCipher {
public static void main(String[]args){
Scanner input = new Scanner(System.in);
System.out.print("Please enter a text: ");
String text = input.nextLine();
System.out.print("Please enter padding number: " );
int  padding = input.nextInt();
char l1 = (char) (text.charAt(0)+padding);
    char l2 = (char)(text.charAt(1)+padding);
    char l3= (char)(text.charAt(2)+padding);
    char l4 = (char)(text.charAt(3)+padding);
    char l5 = (char)(text.charAt(4)+padding);
    char l6 = (char)(text.charAt(5)+padding);
    System.out.print("Encrypted text is "+l1+""+l2+""+l3+""+l4+""+l5+""+l6);
}
}
