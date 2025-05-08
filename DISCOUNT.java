import java.util.Scanner;

public class DISCOUNT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long payment = 0;
        double discount = 0;
        long[] level = {2000000, 10000000, 50000000, 100000000, 200000000, 500000000, Long.MAX_VALUE};
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

        // if (n > 500000000) {
        //     discount = (n - 500000000) * 0.15 + 300000000 * 0.12 + 100000000 * 0.1 + 50000000 * 0.07 + 40000000 * 0.05
        //             + 8000000 * 0.03;
        // } else if (n > 200000000) {
        //     discount = (n - 200000000) * 0.12 + 100000000 * 0.1 + 50000000 * 0.07 + 40000000 * 0.05 + 8000000 * 0.03;
        // } else if (n > 100000000) {
        //     discount = (n - 100000000) * 0.1 + 50000000 * 0.07 + 40000000 * 0.05 + 8000000 * 0.03;
        // } else if (n > 50000000) {
        //     discount = (n - 50000000) * 0.07 + 40000000 * 0.05 + 8000000 * 0.03;
        // } else if (n > 10000000) {
        //     discount = (n - 10000000) * 0.05 + 8000000 * 0.03;
        // } else if (n > 2000000) {
        //     discount = (n - 2000000) * 0.03;
        // }

        payment = n - Math.round(discount);
        System.out.println(payment);
    }
}
