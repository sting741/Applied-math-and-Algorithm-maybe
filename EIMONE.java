import java.util.Scanner;

public class EIMONE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        int twenty_bannotes = 0, ten_bannotes = 0, five_bannotes = 0, one_bannotes = 0;

        
        while (money >= 20) {
            money -= 20;
            twenty_bannotes++;
        }
        while (money >= 10) {
            money -= 10;
            ten_bannotes++;
        }
        while (money >= 5) {
            money -= 5;
            five_bannotes++;
        }
        while (money > 0) {
            money -= 1;
            one_bannotes++;
        }


        if (twenty_bannotes > 0) {
            System.out.println("20 " + twenty_bannotes);
        }
        if (ten_bannotes > 0) {
            System.out.println("10 " + ten_bannotes);
        }
        if (five_bannotes > 0) {
            System.out.println("5 " + five_bannotes);
        }
        if (one_bannotes > 0) {
            System.out.println("1 " + one_bannotes);
        }
    }
}
