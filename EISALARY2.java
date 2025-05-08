import java.text.DecimalFormat;
import java.util.Scanner;

public class EISALARY2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        DecimalFormat dc = new DecimalFormat("#.##");
        int n = sc.nextInt();
        double total_wages = 0, total_times = 0, total_ot_wages = 0, total_ot_times = 0;

        for (int i = 0; i < n; i++) {
            double personal_wage = 0;
            double personal_time = 0;
            double personal_ot_time = 0;
            for (int j = 0; j < 5; j++) {
                double time = sc.nextDouble();
                if (time > 8) {
                    total_ot_times += time - 8;
                    total_times += 8;
                    personal_ot_time += time - 8;
                    personal_time += 8;
                } else {
                    personal_time += time;
                    total_times += time;
                }
            }
            double wage = sc.nextDouble();
            personal_wage = wage * personal_time + wage * personal_ot_time * 1.5;
            total_wages += wage * personal_time;
            total_ot_wages += wage * personal_ot_time * 1.5;
            sb.append(personal_wage + "\n");
        }

        double avg_wage = 0;
        double avg_ot_wage = 0;
        if (Double.compare(total_times, 0.0) > 0) {
            avg_wage = total_wages / total_times;
        }
        if (Double.compare(total_ot_wages, 0.0) > 0) {
            avg_ot_wage = total_ot_wages / total_ot_times;
        }
        sb.append(dc.format(avg_wage) + "\n").append(dc.format(avg_ot_wage));

        System.out.println(sb);
    }
}
