import java.util.Scanner;

public class EIGROSS2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long taxableI = n - 11000000;
        long grossS;
        if (taxableI <= 0) {
            grossS = n;
        } else {
            long realTax = calculateRealtax(taxableI);
            grossS = n + realTax;
        }
        System.out.println(grossS);
        sc.close();
    }

    private static long calculateRealtax(long taxableI) {
        long realTax = 0;
        long[] level = { 4750000, 4500000, 6800000, 11200000, 15000000, 19600000, Long.MAX_VALUE };
        double[] tax = { 0.95, 0.9, 0.85, 0.8, 0.75, 0.7, 0.65 };
        for (int i = 0; i < level.length; i++) {
            if (taxableI > level[i]) {
                realTax += ((level[i] / tax[i]) - level[i]);
                taxableI -= level[i];
            } else {
                realTax += Math.round((taxableI / tax[i]) - taxableI);
                break;
            }
        }
        return realTax;
    }
}