import java.util.Scanner;

public class EIUPURCHASE3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double P = sc.nextDouble();
        double M = sc.nextDouble();
        int month = sc.nextInt();
        double rates = sc.nextDouble();

        double mPay = ((P-M)*rates*Math.pow(1+rates, month))/(Math.pow(1+rates, month)-1);
        System.out.println((long)mPay);
    }
}
