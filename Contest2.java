import java.util.*;
import java.io.*;

public class Contest2 {
    static double[] interest = {3.90, 3.92, 3.95, 3.99, 4.04, 5.54, 5.72, 5.92, 6.14, 6.38, 6.64, 6.92};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double eps = 1e-4;

        long N = sc.nextLong(); 
        int M = sc.nextInt();  

        double left = 0, right = N;
        double ans = 0;

        while (right - left > eps) {
            double mid = (left + right) / 2;
            if (check(mid, N, M)) {
                ans = mid;
                right = mid;
            } else {
                left = mid;
            }
        }

        System.out.printf("%.4f\n", ans);
    }

    static boolean check(double monthlySave, long target, int months) {
        double[] savings = new double[months + 13]; 

        for (int i = 1; i <= months; i++) {
            for (int k = 1; k <= 12; k++) {
                if (i + k - 1 > months) continue; 
                double rate = interest[k - 1] / 100.0;
                double amount = monthlySave * (1 + (rate * k / 12.0));
                savings[i + k - 1] += amount;
            }
        }

        double total = 0;
        for (int i = 1; i <= months; i++) {
            total += savings[i];
        }

        return total >= target;
    }
}
