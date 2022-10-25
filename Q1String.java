import java.util.Scanner;
public class Q1String {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a String: ");
        String text = input.nextLine();
        int length = text.length();
        System.out.println("Last two characters in your entry is: "+ text.substring(length-2));
        System.out.println("Your entry has: "+length+" characters");
        System.out.println("The UPPERCASE value of the string you entered is: "+text.toUpperCase());
        System.out.println("The lowercase value of the string you entered is: " + text.toLowerCase());
        System.out.println("Are they equal? "+ text.equalsIgnoreCase(text.toUpperCase()));
        System.out.println("Index of character 'a' in your entry is: " + text.indexOf("a"));
        String text2 = text + "-cmpe113-";
        System.out.print("The strings are concatenated: "+ text2 );
        int length2 = text2.length();
        System.out.println("It's length becomes: "+ length2);
        System.out.println(text.substring(text.indexOf(" ")-1,text.indexOf(" ")+2));
    }
}
