import java.util.Scanner;

public class EIUSAVING {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        double[] rates = { 0.039, 0.0392, 0.0395, 0.0399, 0.0404, 0.0554, 0.0572, 0.0592, 0.0614, 0.0638, 0.0664,
                0.0692 };
        double sum = 0;
        for (int i = 0; i < m; m--) {
            int year = m / 12;
            int month = m % 12;
            double n = sc.nextDouble();
            if (year > 0) {
                n = n * Math.pow(1 + rates[11], year);
            }
            if (month > 0) {
                n = n * (1 + rates[month - 1] / 12 * month);
            }
            sum += n;
        }

        System.out.println(Math.round(sum));
    }
}
