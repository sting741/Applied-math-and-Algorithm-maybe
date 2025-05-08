import java.util.Scanner;

public class EIBANKFEE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] level = {500, 2000, 5000, Long.MAX_VALUE};
        double[] fees = {12, 7.5, 5, 0};
        double[] checks = {0.2, 0.2, 0.1, 0};

        double n = sc.nextDouble();
        long sec = sc.nextLong();
        double fee = 0;

        for (int i = 0; i < level.length; i++) {
            if (n < level[i]) {
                fee = fees[i] + checks[i]*sec;
                break;
            }
        }

        System.out.println(fee);
    }
}
