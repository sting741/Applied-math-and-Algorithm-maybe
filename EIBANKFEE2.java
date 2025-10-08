import java.util.Scanner;

public class EIBANKFEE2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] level = { 500, 2000, 5000, Long.MAX_VALUE };
        double[] fees = { 12, 7.5, 5, 0 };
        double[] checks = { 0.2, 0.2, 0.1, 0 };
        long total_sec = 0;
        double total = 0;
        double avg = 0;

        int acc = sc.nextInt();
        for (int i = 0; i < acc; i++) {
            long n = sc.nextLong();
            long sec = sc.nextLong();
            total_sec += sec;
            for (int j = 0; j < level.length; j++) {
                if (n < level[j]) {
                    total += (fees[j] + checks[j] * sec);
                    break;
                }
            }
        }

        avg = total / total_sec;
        System.out.println(avg);
    }
}
