import java.util.Scanner;
public class Q4 {
    public static void main(String[]args){
Scanner input = new Scanner(System.in);
System.out.println("Number of 1TL: ");
        int T1 = input.nextInt();
        System.out.println("Number of 5TL: ");
        int T5 = input.nextInt();
        System.out.println("Number of 10TL: ");
        int T10 = input.nextInt();
        System.out.println("Number of 20TL: ");
        int T20 = input.nextInt();
        int totalmoney = T20*20+T10*10+T5*5+T1;
        int x = totalmoney/20;
        int y = totalmoney%20;
        System.out.println("Total money: "+ totalmoney);
        System.out.println("Total money has "+x+"*20TLs and"+y+"*1TL");
    }
}
