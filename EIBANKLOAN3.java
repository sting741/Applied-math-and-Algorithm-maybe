import java.util.Scanner;

public class EIBANKLOAN3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        double debt = sc.nextDouble();
        double mPayoff = sc.nextDouble();
        double month = sc.nextDouble();
        double r = sc.nextDouble() / 1200;
        double fine = sc.nextDouble() / 100;

        double mPayment = debt / month;
        double mPayment1 = debt / month;
        double interest = debt * r;
        double prePay = 0;
        double realPay = 0;
        double sumChanges = 0;
        double sumMpay = 0;

        for (int i = 1; i <= month; i++) {
            interest = debt * r;
            mPayment = Math.max(mPayment1*i - (sumChanges+sumMpay), 0);
            sumChanges += mPayment;
            prePay = mPayoff - interest - mPayment;
            realPay = prePay/(1+fine);
            sumMpay += realPay;
            debt -= mPayment + realPay;
            sb.append(i+ " " + Math.round(debt) + "\n");

            if (debt < mPayoff) {
                sb.append((i + 1) + " " + 0 + "\n");
                break;
            }
        }

        System.out.println(sb);
    }
}
