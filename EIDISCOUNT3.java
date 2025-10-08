import java.util.Scanner;

public class EIDISCOUNT3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int online = sc.nextInt();
        int vip = sc.nextInt();
        int saiyan = sc.nextInt();
        long payment = 0;
        long discount = 0;
        long[] level = {5000000, 20000000, 100000000, 300000000, 600000000, 900000000, Long.MAX_VALUE};
        double[] rates = {0.03, 0.05, 0.07, 0.1, 0.12, 0.15};
        for (int i = 0; i < rates.length; i++) {
            if (n < level[i]) {
                break;
            }
            if (n > level[i+1]) {
                discount += (level[i+1] - level[i])*rates[i];
            } else {
                discount += (n-level[i])*rates[i];
            }
        }
        payment = n - discount;
        if (online == 1) {
            payment = payment*98/100;
        }
        if (vip == 1) {
            payment = payment*98/100;
        }
        if (saiyan == 1) {
            payment = payment*98/100;
        }

        System.out.println(payment);
    }
}
