import java.util.Scanner;

public class EIUSALES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sale = sc.nextDouble();
        double incentive = 0;
        long[] level = { 0, 20, 50, 200, 500, 2000, Long.MAX_VALUE };
        double[] rates = { 0.02, 0.03, 0.04, 0.05, 0.06, 0.07 };
        for (int i = 0; i < rates.length; i++) {
            if (sale <= level[i]) {
                break;
            }
            if (sale > level[i + 1]) {
                incentive += (level[i + 1] - level[i]) * rates[i];
            } else {
                incentive += (sale - level[i]) * rates[i];
            }
        }

        System.out.println(incentive);
    }
}
