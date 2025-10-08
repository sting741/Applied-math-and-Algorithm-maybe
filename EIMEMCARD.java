import java.text.DecimalFormat;
import java.util.Scanner;

public class EIMEMCARD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        long sum = 0;
        long[] money = { 1000000, 20000000, 50000000, 200000000, Long.MAX_VALUE };
        double[] rates = { 0.02, 0.03, 0.05, 0.07 };
        for (int i = 0; i < n; i++) {
            long pur = sc.nextLong();
            double discount = 0;
            for (int j = money.length-1; j >= 0; j--) {
                if (sum >= money[j]) {
                    discount = pur*rates[j];
                    break;
                }
            }
            sum += pur;
            sb.append(discount + " ");
        }
        System.out.println(sb);
    }
}
