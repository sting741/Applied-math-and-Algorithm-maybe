import java.text.DecimalFormat;
import java.util.*;

public class EIGROSS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            double salary = sc.nextDouble();
            double tax = salary/0.9;
            Math.round(tax);
            tax /= 10;
            sb.append(tax).append("\n");
        }

        System.out.println(sb);
    }
}
