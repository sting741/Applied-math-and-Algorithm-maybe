import java.text.DecimalFormat;
import java.util.Scanner;

public class EIUSAVING3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("#.0000");
        double money = sc.nextDouble();
        int month = sc.nextInt();
        double[] rates = { 0.039, 0.0392, 0.0395, 0.0399, 0.0404, 0.0554, 0.0572, 0.0592, 0.0614, 0.0638, 0.0664,
                0.0692 };
        double threshold = BinarySearch(0, month, rates, money);
        System.out.println(dc.format(threshold));
    }

    public static double BinarySearch(double from, int m, double[] rates, double money) {
        double to = money/m;
        int count = 0;
        while (count < 50) {
            double middle = (to + from) / 2;
            double temp_money = 0;
            int temp_m = m;

            for (int i = 0; i < temp_m; temp_m--) {
                int year = temp_m / 12;
                int month = temp_m % 12;
                double temp_middle = middle;
                if (year > 0) {
                    temp_middle = temp_middle * Math.pow(1 + rates[11], year);
                }
                if (month > 0) {
                    temp_middle = temp_middle * (1 + rates[month - 1] / 12 * month);
                }
                temp_money += temp_middle;
            }

            if (temp_money > money) {
                to = middle;
            } else if (temp_money < money) {
                from = middle;
            } else {
                return middle;
            }
            count++;
        }
        return to;
    }
}
