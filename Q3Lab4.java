import java.util.Scanner;
public class Q3Lab4 {
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter the ticket type: ");
        String type = input.nextLine();
        if(type.equalsIgnoreCase("front")){
            System.out.println("How many "+type+" row tickets do you want? ");
            int num = input.nextInt();
            int total = num*600;
            System.out.println("Total cost is "+ total+" TL");
        }
        else if(type.equalsIgnoreCase("miDDle")){
            System.out.println("How many "+type+" row tickets do you want? ");
            int num = input.nextInt();
            int total = num *400;
            System.out.println("Total cost is "+ total+" TL");
        }
        else if(type.equalsIgnoreCase("back")){
            System.out.println("How many "+type+" row tickets do you want? ");
            int num = input.nextInt();
            int total = num *150;
            System.out.println("Total cost is "+ total+" TL");
        }else{
            System.out.println("Invalid ticket type!");
        }
    }
}
